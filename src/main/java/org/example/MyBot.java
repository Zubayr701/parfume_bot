package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBot extends TelegramLongPollingBot {

    private Map<Long, String> userLastPage = new HashMap<>();
    private Map<Long, String> userLastCategory = new HashMap<>();
    private Map<Long, String> userCurrentPerfume = new HashMap<>();
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
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("📂 Kategoriyalar") || message.equals("📂 Katalog")){
                    execute(MyBotService.showCategories(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("🔥 Aksiyalar")){
                    execute(MyBotService.showPromotions(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("✨ Yangiliklar")){
                    execute(MyBotService.showNews(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("🛒 Savat") || message.equals("🛒 Savatni ko'rish")){
                    List<String> cart = userCarts.get(chatId);
                    if (cart == null || cart.isEmpty()) {
                        execute(MyBotService.showCart(chatId));
                    } else {
                        execute(MyBotService.showCartWithItems(chatId, cart));
                    }
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("📦 Buyurtmalarim")){
                    execute(MyBotService.showOrders(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("📞 Bog'lanish")){
                    execute(MyBotService.showContact(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("ℹ️ Ma'lumot")){
                    execute(MyBotService.showInfo(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("👔 Erkaklar uchun")){
                    execute(MyBotService.showMenPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                    userLastCategory.put(chatId, "men");
                }
                else if (message.equals("👗 Ayollar uchun")){
                    execute(MyBotService.showWomenPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                    userLastCategory.put(chatId, "women");
                }
                else if (message.equals("⚡ Uniseks")){
                    execute(MyBotService.showUnisexPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                    userLastCategory.put(chatId, "unisex");
                }
                else if (message.equals("👑 Premium")){
                    execute(MyBotService.showPremiumPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                    userLastCategory.put(chatId, "premium");
                }
                else if (message.equals("Dior Sauvage") || message.equals("Armani Code") || message.equals("Versace Eros") || message.equals("Paco Rabanne") || message.equals("Hugo Boss") || message.equals("Bleu de Chanel") || message.equals("Acqua di Gio") || message.equals("One Million") || message.equals("Invictus") || message.equals("The One")){
                    execute(MyBotService.showPerfumeDetails(chatId, message));
                    userLastPage.put(chatId, "perfume_detail");
                    userCurrentPerfume.put(chatId, message);
                }
                else if (message.equals("Chanel No.5") || message.equals("Dior J'adore") || message.equals("Lancome") || message.equals("Gucci Bloom") || message.equals("YSL Black Opium") || message.equals("Coco Mademoiselle") || message.equals("Miss Dior") || message.equals("Flowerbomb") || message.equals("Good Girl") || message.equals("La Vie Est Belle")){
                    execute(MyBotService.showPerfumeDetails(chatId, message));
                    userLastPage.put(chatId, "perfume_detail");
                    userCurrentPerfume.put(chatId, message);
                }
                else if (message.equals("CK One") || message.equals("Tom Ford Noir") || message.equals("Byredo Gypsy Water") || message.equals("Le Labo") || message.equals("Maison Margiela") || message.equals("Jo Malone") || message.equals("Escentric Molecules") || message.equals("Prada Amber") || message.equals("Atelier Cologne") || message.equals("Kilian")){
                    execute(MyBotService.showPerfumeDetails(chatId, message));
                    userLastPage.put(chatId, "perfume_detail");
                    userCurrentPerfume.put(chatId, message);
                }
                else if (message.equals("Tom Ford Oud Wood") || message.equals("Creed Aventus") || message.equals("Roja Parfums") || message.equals("Clive Christian") || message.equals("Amouage Interlude") || message.equals("Bond No. 9") || message.equals("Frederic Malle") || message.equals("Xerjoff") || message.equals("Parfums de Marly") || message.equals("Nishane")){
                    execute(MyBotService.showPerfumeDetails(chatId, message));
                    userLastPage.put(chatId, "perfume_detail");
                    userCurrentPerfume.put(chatId, message);
                }
                else if (message.equals("📹 Video ko'rish")){
                    String perfumeName = userCurrentPerfume.get(chatId);
                    if (perfumeName != null) {
                        execute(MyBotService.showPerfumeVideo(chatId, perfumeName));
                    }
                }
                else if (message.equals("🛒 Savatga qo'shish")){
                    String perfumeName = userCurrentPerfume.get(chatId);
                    if (perfumeName != null) {
                        List<String> cart = userCarts.get(chatId);
                        if (cart == null) {
                            cart = new ArrayList<>();
                            userCarts.put(chatId, cart);
                        }
                        cart.add(perfumeName);
                        execute(MyBotService.confirmAddToCart(chatId, perfumeName));
                    }
                }
                else if (message.equals("🗑 Savatni tozalash")){
                    userCarts.remove(chatId);
                    execute(MyBotService.showCart(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("⬅️ Orqaga")){
                    String lastPage = userLastPage.getOrDefault(chatId, "menu");

                    if (lastPage.equals("perfume_detail")) {
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
                        userLastPage.put(chatId, "categories");
                    } else if (lastPage.equals("categories")) {
                        execute(MyBotService.showCategories(chatId));
                        userLastPage.put(chatId, "menu");
                    } else {
                        execute(MyBotService.showMenu(chatId));
                        userLastPage.put(chatId, "menu");
                    }
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
                    userLastPage.put(chatId, "menu");
                }

                org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery answer = new org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery();
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