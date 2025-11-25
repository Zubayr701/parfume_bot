package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBot extends TelegramLongPollingBot {

    MyBotService myBotService = new MyBotService();
    private Map<Long, String> userLastCategory = new HashMap<>();
    private Map<Long, List<String>> userCarts = new HashMap<>();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            try {
                if (message.equals("/start")){
                    execute(MyBotService.strt(chatId));
                }
                else if (message.equals("🎁 TOP 5")){
                    execute(MyBotService.showProducts(chatId));
                }
                else if (message.equals("📂 Kategoriyalar") || message.equals("📂 Katalog")){
                    execute(MyBotService.showCategories(chatId));
                }
                else if (message.equals("🔥 Aksiyalar")){
                    execute(MyBotService.showPromotions(chatId));
                }
                else if (message.equals("✨ Yangiliklar")){
                    execute(MyBotService.showNews(chatId));
                }
                else if (message.equals("🛒 Savat")){
                    List<String> cart = userCarts.get(chatId);
                    if (cart == null || cart.isEmpty()) {
                        execute(MyBotService.showCart(chatId));
                    } else {
                        execute(MyBotService.showCartWithItems(chatId, cart));
                    }
                }
                else if (message.equals("📦 Buyurtmalarim")){
                    execute(MyBotService.showOrders(chatId));
                }
                else if (message.equals("📞 Bog'lanish")){
                    execute(MyBotService.showContact(chatId));
                }
                else if (message.equals("ℹ️ Ma'lumot")){
                    execute(MyBotService.showInfo(chatId));
                }
                else if (message.equals("👔 Erkaklar uchun")){
                    execute(MyBotService.showMenPerfume(chatId));
                    userLastCategory.put(chatId, "men");
                }
                else if (message.equals("👗 Ayollar uchun")){
                    execute(MyBotService.showWomenPerfume(chatId));
                    userLastCategory.put(chatId, "women");
                }
                else if (message.equals("⚡ Uniseks")){
                    execute(MyBotService.showUnisexPerfume(chatId));
                    userLastCategory.put(chatId, "unisex");
                }
                else if (message.equals("👑 Premium")){
                    execute(MyBotService.showPremiumPerfume(chatId));
                    userLastCategory.put(chatId, "premium");
                }
                else if (message.equals("Dior Sauvage")){
                    execute(MyBotService.sendPhotoDiorSauvage(chatId));
                }
                else if (message.equals("Armani Code")){
                    execute(MyBotService.sendPhotoArmaniCode(chatId));
                }
                else if (message.equals("Versace Eros")){
                    execute(MyBotService.sendPhotoVersaceEros(chatId));
                }
                else if (message.equals("Paco Rabanne")){
                    execute(MyBotService.sendPhotoPacoRabanne(chatId));
                }
                else if (message.equals("Hugo Boss")){
                    execute(MyBotService.sendPhotoHugoBoss(chatId));
                }
                else if (message.equals("Bleu de Chanel")){
                    execute(MyBotService.sendPhotoBleuDeChanel(chatId));
                }
                else if (message.equals("Acqua di Gio")){
                    execute(MyBotService.sendPhotoAcquaDiGio(chatId));
                }
                else if (message.equals("One Million")){
                    execute(MyBotService.sendPhotoOneMillion(chatId));
                }
                else if (message.equals("Invictus")){
                    execute(MyBotService.sendPhotoInvictus(chatId));
                }
                else if (message.equals("The One")){
                    execute(MyBotService.sendPhotoTheOne(chatId));
                }
                else if (message.equals("Chanel No.5")){
                    execute(MyBotService.sendPhotoChanelNo5(chatId));
                }
                else if (message.equals("Dior J'adore")){
                    execute(MyBotService.sendPhotoDiorJadore(chatId));
                }
                else if (message.equals("Lancome")){
                    execute(MyBotService.sendPhotoLancome(chatId));
                }
                else if (message.equals("Gucci Bloom")){
                    execute(MyBotService.sendPhotoGucciBloom(chatId));
                }
                else if (message.equals("YSL Black Opium")){
                    execute(MyBotService.sendPhotoYSLBlackOpium(chatId));
                }
                else if (message.equals("Coco Mademoiselle")){
                    execute(MyBotService.sendPhotoCocoMademoiselle(chatId));
                }
                else if (message.equals("Miss Dior")){
                    execute(MyBotService.sendPhotoMissDior(chatId));
                }
                else if (message.equals("Flowerbomb")){
                    execute(MyBotService.sendPhotoFlowerbomb(chatId));
                }
                else if (message.equals("Good Girl")){
                    execute(MyBotService.sendPhotoGoodGirl(chatId));
                }
                else if (message.equals("La Vie Est Belle")){
                    execute(MyBotService.sendPhotoLaVieEstBelle(chatId));
                }
                else if (message.equals("CK One")){
                    execute(MyBotService.sendPhotoCKOne(chatId));
                }
                else if (message.equals("Tom Ford Noir")){
                    execute(MyBotService.sendPhotoTomFordNoir(chatId));
                }
                else if (message.equals("🗑 Savatni tozalash")){
                    userCarts.remove(chatId);
                    execute(MyBotService.showCart(chatId));
                }
                else if (message.equals("⬅️ Orqaga")){
                    execute(MyBotService.showMenu(chatId));
                }

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

        if (update.hasCallbackQuery()) {
            String callbackData = update.getCallbackQuery().getData();
            Long chatId = update.getCallbackQuery().getMessage().getChatId();

            try {
                if (callbackData.equals("menuu")) {
                    execute(MyBotService.showMenu(chatId));
                }
                else if (callbackData.startsWith("add:")) {
                    String perfumeName = callbackData.replace("add:", "");
                    List<String> cart = userCarts.get(chatId);
                    if (cart == null) {
                        cart = new ArrayList<>();
                        userCarts.put(chatId, cart);
                    }
                    cart.add(perfumeName);
                    execute(MyBotService.confirmAddToCart(chatId, perfumeName));
                }
                else if (callbackData.startsWith("video:")) {
                    String perfumeName = callbackData.replace("video:", "");
                    execute(MyBotService.showPerfumeVideo(chatId, perfumeName));
                }
                else if (callbackData.equals("back")) {
                    String lastCategory = userLastCategory.getOrDefault(chatId, "men");
                    if (lastCategory.equals("men")) {
                        execute(MyBotService.showMenPerfume(chatId));
                    } else if (lastCategory.equals("women")) {
                        execute(MyBotService.showWomenPerfume(chatId));
                    } else if (lastCategory.equals("unisex")) {
                        execute(MyBotService.showUnisexPerfume(chatId));
                    } else if (lastCategory.equals("premium")) {
                        execute(MyBotService.showPremiumPerfume(chatId));
                    }
                }

                AnswerCallbackQuery answer = new AnswerCallbackQuery();
                answer.setCallbackQueryId(update.getCallbackQuery().getId());
                execute(answer);

            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "ares_perfume_bot";
    }

    @Override
    public String getBotToken() {
        return "8563669502:AAHso9-AP6peNYxw0mXpVmLaPWh2J0Ss1G4";
    }
}