package com.krishna.blitzai.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.krishna.blitzai.database.entity.ChatMessage;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MessagesDao_Impl implements MessagesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChatMessage> __insertionAdapterOfChatMessage;

  private final EntityDeletionOrUpdateAdapter<ChatMessage> __deletionAdapterOfChatMessage;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllAsNotGeneratingInChat;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEmptyMessagesInChat;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllAsNotGenerating;

  private final SharedSQLiteStatement __preparedStmtOfDeleteEmptyMessages;

  public MessagesDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChatMessage = new EntityInsertionAdapter<ChatMessage>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ChatMessage` (`content`,`generating`,`time`,`role`,`chat_id`,`message_id`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChatMessage entity) {
        if (entity.getContent() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getContent());
        }
        final int _tmp = entity.getGenerating() ? 1 : 0;
        statement.bindLong(2, _tmp);
        statement.bindLong(3, entity.getTime());
        if (entity.getRole() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getRole());
        }
        if (entity.getChatId() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getChatId());
        }
        statement.bindLong(6, entity.getId());
      }
    };
    this.__deletionAdapterOfChatMessage = new EntityDeletionOrUpdateAdapter<ChatMessage>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `ChatMessage` WHERE `message_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ChatMessage entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfMarkAllAsNotGeneratingInChat = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE ChatMessage SET generating = 0 WHERE generating = 1 AND chat_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEmptyMessagesInChat = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ChatMessage WHERE content is NULL AND chat_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAllAsNotGenerating = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE ChatMessage SET generating = 0 WHERE generating = 1";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteEmptyMessages = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ChatMessage WHERE content is NULL";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ChatMessage[] message,
      final Continuation<? super List<Long>> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      @NonNull
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          final List<Long> _result = __insertionAdapterOfChatMessage.insertAndReturnIdsList(message);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insert(final List<ChatMessage> messages,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfChatMessage.insert(messages);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final ChatMessage[] messages, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfChatMessage.handleMultiple(messages);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object markAllAsNotGeneratingInChat(final long chatId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllAsNotGeneratingInChat.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, chatId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfMarkAllAsNotGeneratingInChat.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteEmptyMessagesInChat(final long chatId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEmptyMessagesInChat.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, chatId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteEmptyMessagesInChat.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object markAllAsNotGenerating(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllAsNotGenerating.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfMarkAllAsNotGenerating.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteEmptyMessages(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteEmptyMessages.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteEmptyMessages.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object countGeneratingMessagesInChat(final long chatId,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM ChatMessage WHERE generating = 1 AND chat_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, chatId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final int _tmp;
            _tmp = _cursor.getInt(0);
            _result = _tmp;
          } else {
            _result = 0;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
