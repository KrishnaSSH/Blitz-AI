package com.krishna.blitzai.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.krishna.blitzai.database.dao.ChatsDao;
import com.krishna.blitzai.database.dao.ChatsDao_Impl;
import com.krishna.blitzai.database.dao.GeneratedAudiosDao;
import com.krishna.blitzai.database.dao.GeneratedAudiosDao_Impl;
import com.krishna.blitzai.database.dao.GeneratedImagesDao;
import com.krishna.blitzai.database.dao.GeneratedImagesDao_Impl;
import com.krishna.blitzai.database.dao.MessagesDao;
import com.krishna.blitzai.database.dao.MessagesDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ChatsDao _chatsDao;

  private volatile MessagesDao _messagesDao;

  private volatile GeneratedImagesDao _generatedImagesDao;

  private volatile GeneratedAudiosDao _generatedAudiosDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `Chat` (`title` TEXT, `created_time` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ChatMessage` (`content` TEXT, `generating` INTEGER NOT NULL, `time` INTEGER NOT NULL, `role` TEXT, `chat_id` INTEGER, `message_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`chat_id`) REFERENCES `Chat`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_ChatMessage_chat_id` ON `ChatMessage` (`chat_id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `GeneratedImage` (`prompt` TEXT, `url` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `GeneratedAudio` (`input` TEXT NOT NULL, `file_path` TEXT NOT NULL, `file_mime_type` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '20fbecf3326b44cea8452b3350df1f8c')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `Chat`");
        db.execSQL("DROP TABLE IF EXISTS `ChatMessage`");
        db.execSQL("DROP TABLE IF EXISTS `GeneratedImage`");
        db.execSQL("DROP TABLE IF EXISTS `GeneratedAudio`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsChat = new HashMap<String, TableInfo.Column>(3);
        _columnsChat.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChat.put("created_time", new TableInfo.Column("created_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChat.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChat = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChat = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChat = new TableInfo("Chat", _columnsChat, _foreignKeysChat, _indicesChat);
        final TableInfo _existingChat = TableInfo.read(db, "Chat");
        if (!_infoChat.equals(_existingChat)) {
          return new RoomOpenHelper.ValidationResult(false, "Chat(com.krishna.blitzai.database.entity.Chat).\n"
                  + " Expected:\n" + _infoChat + "\n"
                  + " Found:\n" + _existingChat);
        }
        final HashMap<String, TableInfo.Column> _columnsChatMessage = new HashMap<String, TableInfo.Column>(6);
        _columnsChatMessage.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("generating", new TableInfo.Column("generating", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("role", new TableInfo.Column("role", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("chat_id", new TableInfo.Column("chat_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsChatMessage.put("message_id", new TableInfo.Column("message_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChatMessage = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysChatMessage.add(new TableInfo.ForeignKey("Chat", "CASCADE", "NO ACTION", Arrays.asList("chat_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesChatMessage = new HashSet<TableInfo.Index>(1);
        _indicesChatMessage.add(new TableInfo.Index("index_ChatMessage_chat_id", false, Arrays.asList("chat_id"), Arrays.asList("ASC")));
        final TableInfo _infoChatMessage = new TableInfo("ChatMessage", _columnsChatMessage, _foreignKeysChatMessage, _indicesChatMessage);
        final TableInfo _existingChatMessage = TableInfo.read(db, "ChatMessage");
        if (!_infoChatMessage.equals(_existingChatMessage)) {
          return new RoomOpenHelper.ValidationResult(false, "ChatMessage(com.krishna.blitzai.database.entity.ChatMessage).\n"
                  + " Expected:\n" + _infoChatMessage + "\n"
                  + " Found:\n" + _existingChatMessage);
        }
        final HashMap<String, TableInfo.Column> _columnsGeneratedImage = new HashMap<String, TableInfo.Column>(3);
        _columnsGeneratedImage.put("prompt", new TableInfo.Column("prompt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGeneratedImage.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGeneratedImage.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGeneratedImage = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGeneratedImage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGeneratedImage = new TableInfo("GeneratedImage", _columnsGeneratedImage, _foreignKeysGeneratedImage, _indicesGeneratedImage);
        final TableInfo _existingGeneratedImage = TableInfo.read(db, "GeneratedImage");
        if (!_infoGeneratedImage.equals(_existingGeneratedImage)) {
          return new RoomOpenHelper.ValidationResult(false, "GeneratedImage(com.krishna.blitzai.database.entity.GeneratedImage).\n"
                  + " Expected:\n" + _infoGeneratedImage + "\n"
                  + " Found:\n" + _existingGeneratedImage);
        }
        final HashMap<String, TableInfo.Column> _columnsGeneratedAudio = new HashMap<String, TableInfo.Column>(4);
        _columnsGeneratedAudio.put("input", new TableInfo.Column("input", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGeneratedAudio.put("file_path", new TableInfo.Column("file_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGeneratedAudio.put("file_mime_type", new TableInfo.Column("file_mime_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGeneratedAudio.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGeneratedAudio = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGeneratedAudio = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGeneratedAudio = new TableInfo("GeneratedAudio", _columnsGeneratedAudio, _foreignKeysGeneratedAudio, _indicesGeneratedAudio);
        final TableInfo _existingGeneratedAudio = TableInfo.read(db, "GeneratedAudio");
        if (!_infoGeneratedAudio.equals(_existingGeneratedAudio)) {
          return new RoomOpenHelper.ValidationResult(false, "GeneratedAudio(com.krishna.blitzai.database.entity.GeneratedAudio).\n"
                  + " Expected:\n" + _infoGeneratedAudio + "\n"
                  + " Found:\n" + _existingGeneratedAudio);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "20fbecf3326b44cea8452b3350df1f8c", "1a20d828087fbf231a72c39a543c7e7e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Chat","ChatMessage","GeneratedImage","GeneratedAudio");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Chat`");
      _db.execSQL("DELETE FROM `ChatMessage`");
      _db.execSQL("DELETE FROM `GeneratedImage`");
      _db.execSQL("DELETE FROM `GeneratedAudio`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ChatsDao.class, ChatsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MessagesDao.class, MessagesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GeneratedImagesDao.class, GeneratedImagesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GeneratedAudiosDao.class, GeneratedAudiosDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ChatsDao chatsDao() {
    if (_chatsDao != null) {
      return _chatsDao;
    } else {
      synchronized(this) {
        if(_chatsDao == null) {
          _chatsDao = new ChatsDao_Impl(this);
        }
        return _chatsDao;
      }
    }
  }

  @Override
  public MessagesDao messagesDao() {
    if (_messagesDao != null) {
      return _messagesDao;
    } else {
      synchronized(this) {
        if(_messagesDao == null) {
          _messagesDao = new MessagesDao_Impl(this);
        }
        return _messagesDao;
      }
    }
  }

  @Override
  public GeneratedImagesDao imagesDao() {
    if (_generatedImagesDao != null) {
      return _generatedImagesDao;
    } else {
      synchronized(this) {
        if(_generatedImagesDao == null) {
          _generatedImagesDao = new GeneratedImagesDao_Impl(this);
        }
        return _generatedImagesDao;
      }
    }
  }

  @Override
  public GeneratedAudiosDao audiosDao() {
    if (_generatedAudiosDao != null) {
      return _generatedAudiosDao;
    } else {
      synchronized(this) {
        if(_generatedAudiosDao == null) {
          _generatedAudiosDao = new GeneratedAudiosDao_Impl(this);
        }
        return _generatedAudiosDao;
      }
    }
  }
}
