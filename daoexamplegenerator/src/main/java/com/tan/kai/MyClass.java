package com.tan.kai;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyClass {
    public static void main(String[] args) throws Exception {

        Schema schema = new Schema(1, "com.tank.kai.greedao");
        addNote(schema);
        addBook(schema);
        System.out.println("dir:" + System.getProperty("user.dir"));
        new DaoGenerator().generateAll(schema, System.getProperty("user.dir") + "\\app\\src\\main\\java-gen");
    }

    private static void addNote(Schema schema) {
        //一个实体类就关联到数据库中的一张表，此处表名是Note,就是类名
        Entity note = schema.addEntity("Note");
        //表重命名
        //note.setTableName("Note");
        note.addIdProperty();
        note.addStringProperty("text").notNull();
        // 与在 Java 中使用驼峰命名法不同，默认数据库中的命名是使用大写和下划线来分割单词的。
        // For example, a property called “creationDate” will become a database column “CREATION_DATE”.
        note.addStringProperty("comment");
        note.addDateProperty("date");

    }

    private static void addBook(Schema schema) {

        Entity entity = schema.addEntity("Book");

        entity.addIdProperty();
        entity.addIntProperty("bid");
        entity.addStringProperty("name");
        entity.addStringProperty("author");
        entity.addStringProperty("img_url");
        entity.addIntProperty("chapter_count");
        entity.addIntProperty("status");

    }
}
