package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class MyBot extends TelegramLongPollingBot {

    private Map<Long, String> userLastPage = new HashMap<>();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            try {
                if (message.equals("/start")){
                    execute(MyBotService.strt(chatId));
                }
                else if (message.equals("menuu")){
                    execute(MyBotService.showMenu(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("🎁 Mahsulotlar")){
                    execute(MyBotService.showProducts(chatId));
                    userLastPage.put(chatId, "menu");
                }
                else if (message.equals("📂 Kategoriyalar")){
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
                else if (message.equals("🛒 Savat")){
                    execute(MyBotService.showCart(chatId));
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
                }
                else if (message.equals("👗 Ayollar uchun")){
                    execute(MyBotService.showWomenPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                }
                else if (message.equals("⚡ Uniseks")){
                    execute(MyBotService.showUnisexPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                }
                else if (message.equals("👑 Premium")){
                    execute(MyBotService.showPremiumPerfume(chatId));
                    userLastPage.put(chatId, "categories");
                }
                else if (message.equals("⬅️ Orqaga")){
                    String lastPage = userLastPage.getOrDefault(chatId, "menu");

                    if (lastPage.equals("categories")) {
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

                org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery answer =
                        new org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery();
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