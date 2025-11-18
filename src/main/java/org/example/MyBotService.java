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
        send.setCaption(" ARES Parfume botiga xush kelibsiz! \n\n" +
                "Bizning eng so'nggi yangiliklarimiz va chegirma xabardor bo'lish uchun bizni ijtimoiy tarmoqlarda kuzatib boring:\n" +
                " Telegram: https://t.me\n" +
                " Instagram: https://instagram.com\n\n" +
                "Menu tugmasini bosing 👇");

        InlineKeyboardMarkup ikm = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();

        InlineKeyboardButton btn1 = new InlineKeyboardButton();
        btn1.setText(" Menu");
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
        message.setText("🏠 *Asosiy Menu*\n\nKerakli bo'limni tanlang:");
        message.setParseMode("Markdown");

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
        message.setText("🎁 *TOP 5*\n\n" +
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
        message.setText("👔 *Erkaklar uchun atirlar*\n\nQaysi atirni ko'rmoqchisiz?");
        message.setParseMode("Markdown");

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
        message.setText("👗 *Ayollar uchun atirlar*\n\nQaysi atirni ko'rmoqchisiz?");
        message.setParseMode("Markdown");

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
        message.setText("⚡ *Unisex atirlar*\n\nQaysi atirni ko'rmoqchisiz?");
        message.setParseMode("Markdown");

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
        message.setText("👑 *Premium atirlar*\n\nQaysi atirni ko'rmoqchisiz?");
        message.setParseMode("Markdown");

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

    public static SendPhoto showPerfumeDetails(Long chatId, String perfumeName){
        SendPhoto send = new SendPhoto();
        send.setChatId(chatId);

        String imagePath = "C:\\Users\\Asus\\OneDrive\\Desktop\\ares\\" + perfumeName + ".jpg";
        send.setPhoto(new InputFile(new File(imagePath)));

        String details = getPerfumeInfo(perfumeName);
        send.setCaption(details);
        send.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🛒 Savatga qo'shish"));
        keyboardRows.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("📹 Video ko'rish"));
        row2.add(new KeyboardButton("⬅️ Orqaga"));
        keyboardRows.add(row2);

        keyboard.setKeyboard(keyboardRows);
        send.setReplyMarkup(keyboard);

        return send;
    }

    public static SendVideo showPerfumeVideo(Long chatId, String perfumeName){
        SendVideo send = new SendVideo();
        send.setChatId(chatId);

        String videoPath = "C:\\Users\\Asus\\OneDrive\\Desktop\\ares\\videos\\" + perfumeName + ".mp4";
        send.setVideo(new InputFile(new File(videoPath)));

        send.setCaption("🎥 *" + perfumeName + "* haqida video");
        send.setParseMode("Markdown");

        return send;
    }

    private static String getPerfumeInfo(String perfumeName) {
        if (perfumeName.equals("Dior Sauvage")) {
            return "💎 *Dior Sauvage*\n\n💰 Narxi: 450,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nZamonaviy va jasur erkaklar uchun. Fresh va o'tli hidlar kombinatsiyasi.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Bergamot, Pepper\n• O'rta: Lavender, Elemi\n• Baza: Ambroxan, Vanilla\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Armani Code")) {
            return "💎 *Armani Code*\n\n💰 Narxi: 380,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nNafis va jozibali erkaklar uchun kechki atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Limon, Bergamot\n• O'rta: Yasemin, Olive Blossom\n• Baza: Tonka, Tobacco\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Versace Eros")) {
            return "💎 *Versace Eros*\n\n💰 Narxi: 420,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nKuchli va shahvoniy erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Mint, Apple\n• O'rta: Tonka, Geranium\n• Baza: Vanilla, Oakmoss\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Paco Rabanne")) {
            return "💎 *Paco Rabanne 1 Million*\n\n💰 Narxi: 390,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nBoy va ajoyib erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Grapefruit, Mint\n• O'rta: Cinnamon, Rose\n• Baza: Leather, Patchouli\n\n⏱ *Davomiyligi:* 7-9 soat";
        }
        if (perfumeName.equals("Hugo Boss")) {
            return "💎 *Hugo Boss Bottled*\n\n💰 Narxi: 360,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nKlassik va professional erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Apple, Plum\n• O'rta: Geranium, Cinnamon\n• Baza: Sandalwood, Cedar\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Bleu de Chanel")) {
            return "💎 *Bleu de Chanel*\n\n💰 Narxi: 480,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nMustaqil va chaqqon erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Lemon, Mint\n• O'rta: Ginger, Jasmine\n• Baza: Cedar, Sandalwood\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Acqua di Gio")) {
            return "💎 *Giorgio Armani Acqua di Gio*\n\n💰 Narxi: 400,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nDengiz va tabiiy hidlar.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Lime, Lemon\n• O'rta: Jasmine, Rosemary\n• Baza: Musk, Cedar\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("One Million")) {
            return "💎 *Paco Rabanne One Million*\n\n💰 Narxi: 410,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nJasur va ajoyib erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Grapefruit, Mint\n• O'rta: Cinnamon, Rose\n• Baza: Leather, Amber\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Invictus")) {
            return "💎 *Paco Rabanne Invictus*\n\n💰 Narxi: 395,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nSport va energiyali erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Grapefruit, Marine\n• O'rta: Bay Leaf, Jasmine\n• Baza: Guaiac Wood, Ambergris\n\n⏱ *Davomiyligi:* 7-9 soat";
        }
        if (perfumeName.equals("The One")) {
            return "💎 *Dolce & Gabbana The One*\n\n💰 Narxi: 430,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nNafis va klassik erkaklar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Coriander, Basil\n• O'rta: Ginger, Cardamom\n• Baza: Tobacco, Cedar\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Chanel No.5")) {
            return "💎 *Chanel No.5*\n\n💰 Narxi: 520,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nKlassik va elegant ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Aldehydes, Neroli\n• O'rta: Jasmine, Rose\n• Baza: Sandalwood, Vanilla\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Dior J'adore")) {
            return "💎 *Dior J'adore*\n\n💰 Narxi: 480,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nGullar hidli va nafis ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Magnolia, Peach\n• O'rta: Jasmine, Rose\n• Baza: Amaranth, Blackberry\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Lancome")) {
            return "💎 *Lancome La Vie Est Belle*\n\n💰 Narxi: 440,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nShirin va zamonaviy ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pear, Blackcurrant\n• O'rta: Iris, Jasmine\n• Baza: Praline, Vanilla\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Gucci Bloom")) {
            return "💎 *Gucci Bloom*\n\n💰 Narxi: 460,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nTabiiy va gul hidli ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Rangoon Creeper\n• O'rta: Tuberose, Jasmine\n• Baza: Orris Root\n\n⏱ *Davomiyligi:* 7-9 soat";
        }
        if (perfumeName.equals("YSL Black Opium")) {
            return "💎 *Yves Saint Laurent Black Opium*\n\n💰 Narxi: 490,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nKechki va jozibali ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Coffee, Pink Pepper\n• O'rta: Orange Blossom, Jasmine\n• Baza: Vanilla, Patchouli\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Coco Mademoiselle")) {
            return "💎 *Chanel Coco Mademoiselle*\n\n💰 Narxi: 510,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nZamonaviy va nafis ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Orange, Bergamot\n• O'rta: Jasmine, Rose\n• Baza: Patchouli, Vanilla\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Miss Dior")) {
            return "💎 *Miss Dior*\n\n💰 Narxi: 470,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nRomantik va gul hidli ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Mandarin, Blood Orange\n• O'rta: Rose, Peony\n• Baza: Musk, Patchouli\n\n⏱ *Davomiyligi:* 7-9 soat";
        }
        if (perfumeName.equals("Flowerbomb")) {
            return "💎 *Viktor & Rolf Flowerbomb*\n\n💰 Narxi: 495,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nKuchli va gul hidli ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Tea, Bergamot\n• O'rta: Jasmine, Rose, Orchid\n• Baza: Patchouli, Musk\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Good Girl")) {
            return "💎 *Carolina Herrera Good Girl*\n\n💰 Narxi: 485,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nJasur va zamonaviy ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Almond, Coffee\n• O'rta: Tuberose, Jasmine\n• Baza: Tonka, Cacao\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("La Vie Est Belle")) {
            return "💎 *Lancome La Vie Est Belle*\n\n💰 Narxi: 440,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nShirin va zamonaviy ayollar uchun.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pear, Blackcurrant\n• O'rta: Iris, Jasmine\n• Baza: Praline, Vanilla\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("CK One")) {
            return "💎 *Calvin Klein CK One*\n\n💰 Narxi: 350,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nYengil va toza uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Lemon, Mandarin\n• O'rta: Jasmine, Rose\n• Baza: Musk, Amber\n\n⏱ *Davomiyligi:* 4-6 soat";
        }
        if (perfumeName.equals("Tom Ford Noir")) {
            return "💎 *Tom Ford Noir*\n\n💰 Narxi: 550,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nSirli va kuchli uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Bergamot, Violet\n• O'rta: Black Pepper, Nutmeg\n• Baza: Patchouli, Amber\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Byredo Gypsy Water")) {
            return "💎 *Byredo Gypsy Water*\n\n💰 Narxi: 580,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nTabiiy va o'tli uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Bergamot, Lemon, Pepper\n• O'rta: Incense, Pine\n• Baza: Vanilla, Sandalwood\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Le Labo")) {
            return "💎 *Le Labo Santal 33*\n\n💰 Narxi: 620,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nYog'och va terili uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Cardamom, Iris, Violet\n• O'rta: Sandalwood, Papyrus\n• Baza: Leather, Cedar\n\n⏱ *Davomiyligi:* 8-10 soat";
        }
        if (perfumeName.equals("Maison Margiela")) {
            return "💎 *Maison Margiela Replica*\n\n💰 Narxi: 530,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nXotiralarni eslatuvchi uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pink Pepper, Lavender\n• O'rta: Orange Blossom\n• Baza: Vanilla, Musk\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Jo Malone")) {
            return "💎 *Jo Malone Wood Sage & Sea Salt*\n\n💰 Narxi: 560,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Cologne\n\n📝 *Ta'rif:*\nDengiz va tabiiy uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Ambrette Seeds\n• O'rta: Sea Salt\n• Baza: Sage, Grapefruit\n\n⏱ *Davomiyligi:* 4-6 soat";
        }
        if (perfumeName.equals("Escentric Molecules")) {
            return "💎 *Escentric Molecules Molecule 01*\n\n💰 Narxi: 520,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nMinimalist va noyob uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Iso E Super molekulasi\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Prada Amber")) {
            return "💎 *Prada Amber Pour Homme*\n\n💰 Narxi: 490,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Toilette\n\n📝 *Ta'rif:*\nKlassik va zamonaviy uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Mandarin, Cardamom\n• O'rta: Neroli, Orange Blossom\n• Baza: Amber, Patchouli\n\n⏱ *Davomiyligi:* 7-9 soat";
        }
        if (perfumeName.equals("Atelier Cologne")) {
            return "💎 *Atelier Cologne Orange Sanguine*\n\n💰 Narxi: 510,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Cologne Absolue\n\n📝 *Ta'rif:*\nToza va sitrus uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Blood Orange, Bitter Orange\n• O'rta: Jasmine, Geranium\n• Baza: Sandalwood, Tonka\n\n⏱ *Davomiyligi:* 6-8 soat";
        }
        if (perfumeName.equals("Kilian")) {
            return "💎 *Kilian Love Don't Be Shy*\n\n💰 Narxi: 650,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nShirin va boy uniseks atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Neroli, Orange Blossom\n• O'rta: Marshmallow, Rose\n• Baza: Vanilla, Musk\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Tom Ford Oud Wood")) {
            return "💎 *Tom Ford Oud Wood*\n\n💰 Narxi: 750,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nBoy va noyob premium atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Rosewood, Cardamom\n• O'rta: Oud Wood, Sandalwood\n• Baza: Vetiver, Tonka\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Creed Aventus")) {
            return "💎 *Creed Aventus*\n\n💰 Narxi: 850,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nMuvaffaqiyat va kuch ramzi. Premium darajadagi atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pineapple, Blackcurrant\n• O'rta: Birch, Jasmine\n• Baza: Oakmoss, Vanilla\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Roja Parfums")) {
            return "💎 *Roja Parfums Enigma*\n\n💰 Narxi: 920,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Parfum\n\n📝 *Ta'rif:*\nEng yuqori sifatli premium atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Bergamot, Cognac\n• O'rta: Jasmine, Rose, Heliotrope\n• Baza: Tobacco, Ambergris\n\n⏱ *Davomiyligi:* 15+ soat";
        }
        if (perfumeName.equals("Clive Christian")) {
            return "💎 *Clive Christian No. 1*\n\n💰 Narxi: 1,200,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Parfum\n\n📝 *Ta'rif:*\nDunyodagi eng qimmat atirlardan biri.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Lime, Cardamom, Thyme\n• O'rta: Jasmine, Rose, Ylang-Ylang\n• Baza: Sandalwood, Cedar, Vetiver\n\n⏱ *Davomiyligi:* 18+ soat";
        }
        if (perfumeName.equals("Amouage Interlude")) {
            return "💎 *Amouage Interlude Man*\n\n💰 Narxi: 780,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nKuchli va boy premium atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Oregano, Pepper\n• O'rta: Incense, Amber, Opoponax\n• Baza: Leather, Patchouli, Sandalwood\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Bond No. 9")) {
            return "💎 *Bond No. 9 New York*\n\n💰 Narxi: 690,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nNyu-York ruhini aks ettiruvchi premium atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Nutmeg, Ginger\n• O'rta: Rose, Sandalwood\n• Baza: Patchouli, Vanilla, Musk\n\n⏱ *Davomiyligi:* 10-12 soat";
        }
        if (perfumeName.equals("Frederic Malle")) {
            return "💎 *Frederic Malle Portrait of a Lady*\n\n💰 Narxi: 820,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nNafis va boy premium atir.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pink Pepper, Cinnamon\n• O'rta: Turkish Rose, Raspberry\n• Baza: Patchouli, Incense, Sandalwood\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Xerjoff")) {
            return "💎 *Xerjoff Naxos*\n\n💰 Narxi: 880,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nItalyan premium atir brendi.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Lavender, Bergamot, Lemon\n• O'rta: Honey, Cinnamon, Jasmine\n• Baza: Tobacco, Vanilla, Tonka\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Parfums de Marly")) {
            return "💎 *Parfums de Marly Layton*\n\n💰 Narxi: 760,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Eau de Parfum\n\n📝 *Ta'rif:*\nFrantsuz qirollik premium atiri.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Apple, Lavender, Mandarin\n• O'rta: Geranium, Jasmine, Violet\n• Baza: Vanilla, Patchouli, Guaiac Wood\n\n⏱ *Davomiyligi:* 12+ soat";
        }
        if (perfumeName.equals("Nishane")) {
            return "💎 *Nishane Hacivat*\n\n💰 Narxi: 810,000 so'm\n🔸 Hajmi: 100ml\n🌟 Turi: Extrait de Parfum\n\n📝 *Ta'rif:*\nTurkiyaning premium atir brendi.\n\n🎭 *Asosiy notalar:*\n• Yuqori: Pineapple, Grapefruit, Bergamot\n• O'rta: Cedar, Patchouli, Jasmine\n• Baza: Oakmoss, Woody Notes\n\n⏱ *Davomiyligi:* 15+ soat";
        }
        return "💎 *" + perfumeName + "*\n\n💰 Narxi: Ma'lumot kiritilmoqda\n🔸 Hajmi: 100ml\n\n📝 Batafsil ma'lumot tez orada qo'shiladi!\n\n📞 Buyurtma berish uchun operator bilan bog'laning.";
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
        message.setText("🛒 *Savatingiz*\n\nSavatingiz hozircha bo'sh.\n\nMahsulot qo'shish uchun katalogga o'ting!");
        message.setParseMode("Markdown");

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

        StringBuilder text = new StringBuilder("🛒 *Savatingiz*\n\n");

        for (String perfumeName : cart) {
            text.append("• ").append(perfumeName).append("\n");
        }

        text.append("\n📞 *Buyurtma berish uchun:*\n");
        text.append("+998 90 123 45 67");

        message.setText(text.toString());
        message.setParseMode("Markdown");

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
        message.setText("✅ *" + perfumeName + "* savatga qo'shildi!");
        message.setParseMode("Markdown");

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🛒 Savatni ko'rish"));
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