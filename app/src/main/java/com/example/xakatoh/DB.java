package com.example.xakatoh;

public class DB {
    public static final String TABLE_NAME = "Students";
    public static final String _ID = "id";
    public static final String COLUMN_FIRST_NAME_WRITER = "firstName";
    public static final String COLUMN_SECOND_NAME_WRITER = "secondName";
    public static final String COLUMN_MIDDLE_NAME_WRITER = "middleName";
    public static final String COLUMN_BIRTHDAY_WRITER = "birthday";
    public static final String GROUP_ID = "GroupID";
    public static final String DATABASE_NAME = "Students.db";
    public static final int DATABASE_VERSION = 1;
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
            TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," +
            COLUMN_FIRST_NAME_WRITER + " TEXT," +
            COLUMN_SECOND_NAME_WRITER + " TEXT," +
            COLUMN_MIDDLE_NAME_WRITER + "TEXT," +
            COLUMN_BIRTHDAY_WRITER + "INTEGER," +
            GROUP_ID + "INTEGER PRIMARY KEY";
    public static final String DELETE_TABLE = "DROP TABLE IF EXISTS" + TABLE_NAME;
}
