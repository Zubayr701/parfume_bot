package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
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
        send.setCaption("ARES Parfume botiga xush kelibsiz!\n\nBizning eng so'nggi yangiliklarimiz va chegirmalardan xabardor bo'lish uchun bizni kuzatib boring:\nTelegram: https://t.me\nInstagram: https://instagram.com\n\nMenu tugmasini bosing 👇");

        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("Menu");
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
        message.setText("🏠 Asosiy Menu\n\nKerakli bo'limni tanlang:");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        keyboard.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🎁 TOP 5"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("📂 Kategoriyalar"));
        keyboardRows.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("🔥 Aksiyalar"));
        row3.add(new KeyboardButton("✨ Yangiliklar"));
        keyboardRows.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("🛒 Savat"));
        row4.add(new KeyboardButton("📦 Buyurtmalarim"));
        keyboardRows.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("📞 Bog'lanish"));
        row5.add(new KeyboardButton("ℹ️ Ma'lumot"));
        keyboardRows.add(row5);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showProducts(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("🎁 TOP 5\n\n💎 Chanel No.5 - 520,000 so'm\n💎 Dior Sauvage - 450,000 so'm\n💎 Tom Ford - 650,000 so'm\n💎 Armani Code - 380,000 so'm\n💎 Versace Eros - 420,000 so'm");
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
        message.setText("📂 Kategoriyalar\n\nAtir turlarini tanlang:");
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
        message.setText("👔 Erkaklar uchun atirlar\n\nQaysi atirni ko'rmoqchisiz?");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Dior Sauvage"));
        row1.add(new KeyboardButton("Armani Code"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Versace Eros"));
        row2.add(new KeyboardButton("Paco Rabanne"));
        keyboardRows.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Hugo Boss"));
        row3.add(new KeyboardButton("Bleu de Chanel"));
        keyboardRows.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Acqua di Gio"));
        row4.add(new KeyboardButton("One Million"));
        keyboardRows.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Invictus"));
        row5.add(new KeyboardButton("The One"));
        keyboardRows.add(row5);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row6);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showWomenPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("👗 Ayollar uchun atirlar\n\nQaysi atirni ko'rmoqchisiz?");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Chanel No.5"));
        row1.add(new KeyboardButton("Dior J'adore"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Lancome"));
        row2.add(new KeyboardButton("Gucci Bloom"));
        keyboardRows.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("YSL Black Opium"));
        row3.add(new KeyboardButton("Coco Mademoiselle"));
        keyboardRows.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Miss Dior"));
        row4.add(new KeyboardButton("Flowerbomb"));
        keyboardRows.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Good Girl"));
        row5.add(new KeyboardButton("La Vie Est Belle"));
        keyboardRows.add(row5);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row6);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showUnisexPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("⚡ Unisex atirlar\n\nQaysi atirni ko'rmoqchisiz?");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("CK One"));
        row1.add(new KeyboardButton("Tom Ford Noir"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Byredo Gypsy Water"));
        row2.add(new KeyboardButton("Le Labo"));
        keyboardRows.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Maison Margiela"));
        row3.add(new KeyboardButton("Jo Malone"));
        keyboardRows.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Escentric Molecules"));
        row4.add(new KeyboardButton("Prada Amber"));
        keyboardRows.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Atelier Cologne"));
        row5.add(new KeyboardButton("Kilian"));
        keyboardRows.add(row5);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row6);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showPremiumPerfume(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("👑 Premium atirlar\n\nQaysi atirni ko'rmoqchisiz?");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("Tom Ford Oud Wood"));
        row1.add(new KeyboardButton("Creed Aventus"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("Roja Parfums"));
        row2.add(new KeyboardButton("Clive Christian"));
        keyboardRows.add(row2);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton("Amouage Interlude"));
        row3.add(new KeyboardButton("Bond No. 9"));
        keyboardRows.add(row3);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(new KeyboardButton("Frederic Malle"));
        row4.add(new KeyboardButton("Xerjoff"));
        keyboardRows.add(row4);
        KeyboardRow row5 = new KeyboardRow();
        row5.add(new KeyboardButton("Parfums de Marly"));
        row5.add(new KeyboardButton("Nishane"));
        keyboardRows.add(row5);
        KeyboardRow row6 = new KeyboardRow();
        row6.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row6);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendPhoto sendPhotoDiorSauvage(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/10"));
        sendPhoto.setCaption("Dior Sauvage\n\n💰 Narxi: 450,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nZamonaviy va jasur erkaklar uchun. Fresh va o'tli hidlar kombinatsiyasi.\n\n🎭 Asosiy notalar:\n• Yuqori: Bergamot, Pepper\n• O'rta: Lavender, Elemi\n• Baza: Ambroxan, Vanilla\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Dior Sauvage");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Dior Sauvage");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoArmaniCode(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/8"));
        sendPhoto.setCaption("Armani Code\n\n💰 Narxi: 380,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nNafis va jozibali erkaklar uchun kechki atir.\n\n🎭 Asosiy notalar:\n• Yuqori: Limon, Bergamot\n• O'rta: Yasemin, Olive Blossom\n• Baza: Tonka, Tobacco\n\n⏱️ Davomiyligi: 6-8 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Armani Code");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Armani Code");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoVersaceEros(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/13"));
        sendPhoto.setCaption("Versace Eros\n\n💰 Narxi: 420,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nKuchli va shahvoniy erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Mint, Apple\n• O'rta: Tonka, Geranium\n• Baza: Vanilla, Oakmoss\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Versace Eros");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Versace Eros");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoPacoRabanne(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/16"));
        sendPhoto.setCaption("Paco Rabanne 1 Million\n\n💰 Narxi: 390,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nBoy va ajoyib erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Grapefruit, Mint\n• O'rta: Cinnamon, Rose\n• Baza: Leather, Patchouli\n\n⏱️ Davomiyligi: 7-9 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Paco Rabanne");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Paco Rabanne");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoHugoBoss(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/11"));
        sendPhoto.setCaption("Hugo Boss Bottled\n\n💰 Narxi: 360,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nKlassik va professional erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Apple, Plum\n• O'rta: Geranium, Cinnamon\n• Baza: Sandalwood, Cedar\n\n⏱️ Davomiyligi: 6-8 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Hugo Boss");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Hugo Boss");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoBleuDeChanel(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/9"));
        sendPhoto.setCaption("Bleu de Chanel\n\n💰 Narxi: 480,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nMustaqil va chaqqon erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Lemon, Mint\n• O'rta: Ginger, Jasmine\n• Baza: Cedar, Sandalwood\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Bleu de Chanel");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Bleu de Chanel");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoAcquaDiGio(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/14"));
        sendPhoto.setCaption("Giorgio Armani Acqua di Gio\n\n💰 Narxi: 400,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nDengiz va tabiiy hidlar.\n\n🎭 Asosiy notalar:\n• Yuqori: Lime, Lemon\n• O'rta: Jasmine, Rosemary\n• Baza: Musk, Cedar\n\n⏱️ Davomiyligi: 6-8 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Acqua di Gio");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Acqua di Gio");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoOneMillion(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/12"));
        sendPhoto.setCaption("Paco Rabanne One Million\n\n💰 Narxi: 410,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nJasur va ajoyib erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Grapefruit, Mint\n• O'rta: Cinnamon, Rose\n• Baza: Leather, Amber\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:One Million");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:One Million");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoInvictus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/19"));
        sendPhoto.setCaption("Paco Rabanne Invictus\n\n💰 Narxi: 395,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nSport va energiyali erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Grapefruit, Marine\n• O'rta: Bay Leaf, Jasmine\n• Baza: Guaiac Wood, Ambergris\n\n⏱️ Davomiyligi: 7-9 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Invictus");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Invictus");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoTheOne(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/20"));
        sendPhoto.setCaption("Dolce & Gabbana The One\n\n💰 Narxi: 430,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nNafis va klassik erkaklar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Coriander, Basil\n• O'rta: Ginger, Cardamom\n• Baza: Tobacco, Cedar\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:The One");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:The One");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoChanelNo5(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/21"));
        sendPhoto.setCaption("Chanel No.5\n\n💰 Narxi: 520,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nKlassik va elegant ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Aldehydes, Neroli\n• O'rta: Jasmine, Rose\n• Baza: Sandalwood, Vanilla\n\n⏱️ Davomiyligi: 10-12 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Chanel No.5");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Chanel No.5");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoDiorJadore(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/22"));
        sendPhoto.setCaption("Dior J'adore\n\n💰 Narxi: 480,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nGullar hidli va nafis ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Magnolia, Peach\n• O'rta: Jasmine, Rose\n• Baza: Amaranth, Blackberry\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Dior J'adore");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Dior J'adore");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoLancome(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/24"));
        sendPhoto.setCaption("Lancome La Vie Est Belle\n\n💰 Narxi: 440,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nShirin va zamonaviy ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Pear, Blackcurrant\n• O'rta: Iris, Jasmine\n• Baza: Praline, Vanilla\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Lancome");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Lancome");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoGucciBloom(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/25"));
        sendPhoto.setCaption("Gucci Bloom\n\n💰 Narxi: 460,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nTabiiy va gul hidli ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Rangoon Creeper\n• O'rta: Tuberose, Jasmine\n• Baza: Orris Root\n\n⏱️ Davomiyligi: 7-9 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Gucci Bloom");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Gucci Bloom");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

        public static SendPhoto sendPhotoYSLBlackOpium(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/26"));
        sendPhoto.setCaption("Yves Saint Laurent Black Opium\n\n💰 Narxi: 490,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nKechki va jozibali ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Coffee, Pink Pepper\n• O'rta: Orange Blossom, Jasmine\n• Baza: Vanilla, Patchouli\n\n⏱️ Davomiyligi: 10-12 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:YSL Black Opium");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:YSL Black Opium");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoCocoMademoiselle(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/27"));
        sendPhoto.setCaption("Chanel Coco Mademoiselle\n\n💰 Narxi: 510,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nZamonaviy va nafis ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Orange, Bergamot\n• O'rta: Jasmine, Rose\n• Baza: Patchouli, Vanilla\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Coco Mademoiselle");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Coco Mademoiselle");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoMissDior(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/28"));
        sendPhoto.setCaption("Miss Dior\n\n💰 Narxi: 470,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nRomantik va gul hidli ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Mandarin, Blood Orange\n• O'rta: Rose, Peony\n• Baza: Musk, Patchouli\n\n⏱️ Davomiyligi: 7-9 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Miss Dior");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Miss Dior");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoFlowerbomb(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/29"));
        sendPhoto.setCaption("Viktor & Rolf Flowerbomb\n\n💰 Narxi: 495,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nKuchli va gul hidli ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Tea, Bergamot\n• O'rta: Jasmine, Rose, Orchid\n• Baza: Patchouli, Musk\n\n⏱️ Davomiyligi: 10-12 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Flowerbomb");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Flowerbomb");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoGoodGirl(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/31"));
        sendPhoto.setCaption("Carolina Herrera Good Girl\n\n💰 Narxi: 485,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nJasur va zamonaviy ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Almond, Coffee\n• O'rta: Tuberose, Jasmine\n• Baza: Tonka, Cacao\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Good Girl");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Good Girl");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoLaVieEstBelle(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/32"));
        sendPhoto.setCaption("Lancome La Vie Est Belle\n\n💰 Narxi: 440,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nShirin va zamonaviy ayollar uchun.\n\n🎭 Asosiy notalar:\n• Yuqori: Pear, Blackcurrant\n• O'rta: Iris, Jasmine\n• Baza: Praline, Vanilla\n\n⏱️ Davomiyligi: 8-10 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:La Vie Est Belle");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:La Vie Est Belle");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoCKOne(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/33"));
        sendPhoto.setCaption("Calvin Klein CK One\n\n💰 Narxi: 350,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 Ta'rif:\nYengil va toza uniseks atir.\n\n🎭 Asosiy notalar:\n• Yuqori: Lemon, Mandarin\n• O'rta: Jasmine, Rose\n• Baza: Musk, Amber\n\n⏱️ Davomiyligi: 4-6 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:CK One");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:CK One");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendPhoto sendPhotoTomFordNoir(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/ares_perfume/34"));
        sendPhoto.setCaption("Tom Ford Noir\n\n💰 Narxi: 550,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 Ta'rif:\nSirli va kuchli uniseks atir.\n\n🎭 Asosiy notalar:\n• Yuqori: Bergamot, Violet\n• O'rta: Black Pepper, Nutmeg\n• Baza: Patchouli, Amber\n\n⏱️ Davomiyligi: 10-12 soat");
        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText("🛒 Savatga qo'shish");
        btn1.setCallbackData("add:Tom Ford Noir");
        row1.add(btn1);
        rows.add(row1);
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        InlineKeyboardButton btn2 = new InlineKeyboardButton();
        btn2.setText("📹 Video");
        btn2.setCallbackData("video:Tom Ford Noir");
        row2.add(btn2);
        rows.add(row2);
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        InlineKeyboardButton btn3 = new InlineKeyboardButton();
        btn3.setText("⬅️ Orqaga");
        btn3.setCallbackData("back");
        row3.add(btn3);
        rows.add(row3);
        ikm.setKeyboard(rows);
        sendPhoto.setReplyMarkup(ikm);
        return sendPhoto;
    }

    public static SendMessage showContact(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("📞 Bog'lanish\n\n📱 Telefon: +998 90 123 45 67\n📧 Email: info@aresparfume.uz\n🏢 Manzil: Toshkent, Chilonzor tumani\n⏰ Ish vaqti: 9:00 - 20:00 (har kuni)\n\n📱 Ijtimoiy tarmoqlar:\nTelegram: https://t.me/ares_perfume\nInstagram: https://instagram.com/ares_perfume");
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
        message.setText("ℹ️ ARES Parfume haqida\n\nBiz original va sifatli atirlar bilan ta'minlaymiz.\n\n✅ 100% original mahsulotlar\n🚚 Toshkent bo'ylab bepul yetkazib berish\n💰 Qulay narxlar va aksiyalar\n🎁 Sovg'alar va bonuslar\n⭐ Professional maslahat\n\nBizning maqsadimiz - sizga eng yaxshi xizmat ko'rsatish!");
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
        message.setText("🔥 Aksiyalar\n\n1️⃣ Har 3 ta atir uchun - 1 ta sovg'a! 🎁\n2️⃣ Premium atirlar - 20% chegirma 💎\n3️⃣ Yangi mijozlar uchun - 15% bonus 🎉\n4️⃣ Sevgillar kuni - 30% chegirma ❤️\n\n⏰ Aksiyalar muddati: 30 kun");
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
        message.setText("✨ Yangiliklar\n\n🆕 Yangi kolleksiya keldi!\n🎉 Yozgi aksiya boshlandi\n💝 Sovg'a to'plamlari tayyor\n\nTez orada yana yangiliklar!");
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
        message.setText("🛒 Savatingiz\n\nSavatingiz hozircha bo'sh.\n\nMahsulot qo'shish uchun katalogga o'ting!");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("📂 Katalog"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row2);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showCartWithItems(Long chatId, List<String> cart){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        StringBuilder text = new StringBuilder("🛒 Savatingiz\n\n");
        for (int i = 0; i < cart.size(); i++) {
            text.append((i + 1)).append(". ").append(cart.get(i)).append("\n");
        }
        text.append("\n📞 Buyurtma berish uchun:\n+998 90 123 45 67");
        message.setText(text.toString());
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🗑 Savatni tozalash"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("📂 Katalog"));
        row2.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row2);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage confirmAddToCart(Long chatId, String perfumeName){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("✅ " + perfumeName + " savatga qo'shildi!\n\n🛒 Savatni ko'rish yoki xaridni davom ettiring.");
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🛒 Savat"));
        keyboardRows.add(row1);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("📂 Katalog"));
        row2.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row2);
        keyboard.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboard);
        return message;
    }

    public static SendMessage showOrders(Long chatId){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("📦 Buyurtmalarim\n\nSizda hali buyurtmalar yo'q.\n\nBirinchi buyurtmangizni bering!");
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

    public static SendVideo showPerfumeVideo(Long chatId, String perfumeName){
        SendVideo send = new SendVideo();
        send.setChatId(chatId);
        String videoPath = "C:\\Users\\Asus\\OneDrive\\Desktop\\ares\\videos\\" + perfumeName + ".mp4";
        send.setVideo(new InputFile(new File(videoPath)));
        send.setCaption("🎥 " + perfumeName + " haqida video");
        return send;
    }
}