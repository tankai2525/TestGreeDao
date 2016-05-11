package com.tank.kai.greedao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.tank.kai.greedao.Book;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK".
*/
public class BookDao extends AbstractDao<Book, Long> {

    public static final String TABLENAME = "BOOK";

    /**
     * Properties of entity Book.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Bid = new Property(1, Integer.class, "bid", false, "BID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Img_url = new Property(4, String.class, "img_url", false, "IMG_URL");
        public final static Property Chapter_count = new Property(5, Integer.class, "chapter_count", false, "CHAPTER_COUNT");
        public final static Property Status = new Property(6, Integer.class, "status", false, "STATUS");
    };


    public BookDao(DaoConfig config) {
        super(config);
    }
    
    public BookDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"BID\" INTEGER," + // 1: bid
                "\"NAME\" TEXT," + // 2: name
                "\"AUTHOR\" TEXT," + // 3: author
                "\"IMG_URL\" TEXT," + // 4: img_url
                "\"CHAPTER_COUNT\" INTEGER," + // 5: chapter_count
                "\"STATUS\" INTEGER);"); // 6: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Book entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer bid = entity.getBid();
        if (bid != null) {
            stmt.bindLong(2, bid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        String img_url = entity.getImg_url();
        if (img_url != null) {
            stmt.bindString(5, img_url);
        }
 
        Integer chapter_count = entity.getChapter_count();
        if (chapter_count != null) {
            stmt.bindLong(6, chapter_count);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(7, status);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Book readEntity(Cursor cursor, int offset) {
        Book entity = new Book( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // bid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // img_url
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // chapter_count
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // status
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Book entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImg_url(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setChapter_count(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setStatus(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Book entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Book entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}