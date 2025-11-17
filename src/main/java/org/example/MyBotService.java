package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public static SendPhoto strt(Long chatId){
        SendPhoto send = new SendPhoto();
        send.setChatId(chatId);
        send.setPhoto(new InputFile(new File("C:\\Users\\Asus\\OneDrive\\Desktop\\ares\\ares.jpg")));
        send.setCaption(" ARES Parfume botiga xush kelibsiz! \n\n" +
                "Bizning eng so'nggi yangiliklarimiz va chegirma xabardor bo'lish uchun bizni ijtimoiy tarmoqlarda kuzatib boring:\n" +
                " Telegram: https://t.me\n" +
                " Instagram: https://instagram.com\n\n" +
                "Menu tugmasini bosing 👇");

        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("📋 Menu");
        btn1.setCallbackData("menuu");
        row1.add(btn1);
        rowlist.add(row1);

        ikm.setKeyboard(rowlist);
        send.setReplyMarkup(ikm);

        return send;
    }

    public static SendMessage showMenu(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(" *Asosiy Menu*\n\nKerakli bo'limni tanlang:");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        keyboard.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🎁 Mahsulotlar"));
        row1.add(new KeyboardButton("📂 Kategoriyalar"));
        keyboardRows.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("🔥 Aksiyalar"));
        row2.add(new KeyboardButton("✨ Yangiliklar"));
        keyboardRows.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("🛒 Savat"));
        row3.add(new KeyboardButton("📦 Buyurtmalarim"));
        keyboardRows.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("📞 Bog'lanish"));
        row4.add(new KeyboardButton("ℹ️ Ma'lumot"));
        keyboardRows.add(row4);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showProducts(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("🎁 *Mahsulotlar*\n\n" +
                "💎 Chanel No.5 - 520,000 so'm\n" +
                "💎 Dior Sauvage - 450,000 so'm\n" +
                "💎 Tom Ford - 650,000 so'm\n" +
                "💎 Armani Code - 380,000 so'm\n" +
                "💎 Versace Eros - 420,000 so'm\n\n" +
                "Buyurtma berish uchun operator bilan bog'laning!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showCategories(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("📂 *Kategoriyalar*\n\nAtir turlarini tanlang:");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("👔 Erkaklar uchun"));
        row1.add(new KeyboardButton("👗 Ayollar uchun"));
        keyboardRows.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⚡ Uniseks"));
        row2.add(new KeyboardButton("👑 Premium"));
        keyboardRows.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row3);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showMenPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("👔 *Erkaklar uchun atirlar*\n\n" +
                "• Dior Sauvage - 450,000 so'm\n" +
                "• Armani Code - 380,000 so'm\n" +
                "• Versace Eros - 420,000 so'm\n" +
                "• Paco Rabanne - 390,000 so'm\n" +
                "• Hugo Boss - 360,000 so'm");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showWomenPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("👗 *Ayollar uchun atirlar*\n\n" +
                "• Chanel No.5 - 520,000 so'm\n" +
                "• Dior J'adore - 480,000 so'm\n" +
                "• Lancome - 440,000 so'm\n" +
                "• Gucci Bloom - 460,000 so'm\n" +
                "• Yves Saint Laurent - 490,000 so'm");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showUnisexPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("⚡ *Uniseks atirlar*\n\n" +
                "• Calvin Klein CK One - 350,000 so'm\n" +
                "• Tom Ford Noir - 550,000 so'm\n" +
                "• Byredo - 580,000 so'm\n" +
                "• Le Labo - 620,000 so'm");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showPremiumPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("👑 *Premium atirlar*\n\n" +
                "• Tom Ford Oud Wood - 750,000 so'm\n" +
                "• Creed Aventus - 850,000 so'm\n" +
                "• Roja Parfums - 920,000 so'm\n" +
                "• Clive Christian - 1,200,000 so'm\n\n" +
                "🔥 Premium atirlar uchun - 20% chegirma!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showContact(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("📞 *Bog'lanish*\n\n" +
                "📱 Telefon: +998 90 123 45 67\n" +
                "📧 Email: info@rfparfume.uz\n" +
                "🏢 Manzil: Toshkent, Chilonzor tumani\n" +
                "⏰ Ish vaqti: 9:00 - 20:00 (har kuni)\n\n" +
                "📱 Ijtimoiy tarmoqlar:\n" +
                "Telegram: https://t.me/rfparfume\n" +
                "Instagram: https://instagram.com/rfparfume");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showInfo(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("ℹ️ *ARES Parfume haqida*\n\n" +
                "Biz original va sifatli atirlar bilan ta'minlaymiz.\n\n" +
                "✅ 100% original mahsulotlar\n" +
                "🚚 Toshkent bo'ylab bepul yetkazib berish\n" +
                "💰 Qulay narxlar va aksiyalar\n" +
                "🎁 Sovg'alar va bonuslar\n" +
                "⭐ Professional maslahat\n\n" +
                "Bizning maqsadimiz - sizga eng yaxshi xizmat ko'rsatish!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showPromotions(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("🔥 *Aksiyalar*\n\n" +
                "1️⃣ Har 3 ta atir uchun - 1 ta sovg'a! 🎁\n" +
                "2️⃣ Premium atirlar - 20% chegirma 💎\n" +
                "3️⃣ Yangi mijozlar uchun - 15% bonus 🎉\n" +
                "4️⃣ Sevgillar kuni - 30% chegirma ❤️\n\n" +
                "⏰ Aksiyalar muddati: 30 kun");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showNews(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("✨ *Yangiliklar*\n\n" +
                "🆕 Yangi kolleksiya keldi!\n" +
                "🎉 Yozgi aksiya boshlandi\n" +
                "💝 Sovg'a to'plamlari tayyor\n\n" +
                "Tez orada yana yangiliklar!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showCart(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("🛒 *Savatingiz*\n\n" +
                "Savatingiz hozircha bo'sh.\n\n" +
                "Mahsulot qo'shish uchun katalogga o'ting!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }

    public static SendMessage showOrders(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("📦 *Buyurtmalarim*\n\n" +
                "Sizda hali buyurtmalar yo'q.\n\n" +
                "Birinchi buyurtmangizni bering!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row);

        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);

        return message;
    }
}