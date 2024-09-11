package com.krishna.blitzai.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.krishna.blitzai.database.entity.Chat;
import com.krishna.blitzai.database.entity.ChatMessage;
import com.krishna.blitzai.database.entity.ChatWithMessages;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ChatsDao_Impl implements ChatsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Chat> __insertionAdapterOfChat;

  private final EntityDeletionOrUpdateAdapter<Chat> __deletionAdapterOfChat;

  public ChatsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChat = new EntityInsertionAdapter<Chat>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Chat` (`title`,`created_time`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Chat entity) {
        if (entity.getTitle() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getTitle());
        }
        statement.bindLong(2, entity.getCreatedTime());
        statement.bindLong(3, entity.getId());
      }
    };
    this.__deletionAdapterOfChat = new EntityDeletionOrUpdateAdapter<Chat>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Chat` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Chat entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final Chat chat, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfChat.insertAndReturnId(chat);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Chat chat, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfChat.handle(chat);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ChatWithMessages>> getAll() {
    final String _sql = "SELECT * FROM Chat";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[] {"ChatMessage",
        "Chat"}, new Callable<List<ChatWithMessages>>() {
      @Override
      @NonNull
      public List<ChatWithMessages> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfCreatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "created_time");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final LongSparseArray<ArrayList<ChatMessage>> _collectionMessages = new LongSparseArray<ArrayList<ChatMessage>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionMessages.containsKey(_tmpKey)) {
                _collectionMessages.put(_tmpKey, new ArrayList<ChatMessage>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipChatMessageAscomKrishnaBlitzaiDatabaseEntityChatMessage(_collectionMessages);
            final List<ChatWithMessages> _result = new ArrayList<ChatWithMessages>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final ChatWithMessages _item;
              final Chat _tmpChat;
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final long _tmpCreatedTime;
              _tmpCreatedTime = _cursor.getLong(_cursorIndexOfCreatedTime);
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              _tmpChat = new Chat(_tmpTitle,_tmpCreatedTime,_tmpId);
              final ArrayList<ChatMessage> _tmpMessagesCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpMessagesCollection = _collectionMessages.get(_tmpKey_1);
              _item = new ChatWithMessages(_tmpChat,_tmpMessagesCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<ChatWithMessages> getById(final long id) {
    final String _sql = "SELECT * FROM Chat WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, true, new String[] {"ChatMessage",
        "Chat"}, new Callable<ChatWithMessages>() {
      @Override
      @NonNull
      public ChatWithMessages call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfCreatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "created_time");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final LongSparseArray<ArrayList<ChatMessage>> _collectionMessages = new LongSparseArray<ArrayList<ChatMessage>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionMessages.containsKey(_tmpKey)) {
                _collectionMessages.put(_tmpKey, new ArrayList<ChatMessage>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipChatMessageAscomKrishnaBlitzaiDatabaseEntityChatMessage(_collectionMessages);
            final ChatWithMessages _result;
            if (_cursor.moveToFirst()) {
              final Chat _tmpChat;
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final long _tmpCreatedTime;
              _tmpCreatedTime = _cursor.getLong(_cursorIndexOfCreatedTime);
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              _tmpChat = new Chat(_tmpTitle,_tmpCreatedTime,_tmpId);
              final ArrayList<ChatMessage> _tmpMessagesCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpMessagesCollection = _collectionMessages.get(_tmpKey_1);
              _result = new ChatWithMessages(_tmpChat,_tmpMessagesCollection);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipChatMessageAscomKrishnaBlitzaiDatabaseEntityChatMessage(
      @NonNull final LongSparseArray<ArrayList<ChatMessage>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchLongSparseArray(_map, true, (map) -> {
        __fetchRelationshipChatMessageAscomKrishnaBlitzaiDatabaseEntityChatMessage(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `content`,`generating`,`time`,`role`,`chat_id`,`message_id` FROM `ChatMessage` WHERE `chat_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      final long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "chat_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfContent = 0;
      final int _cursorIndexOfGenerating = 1;
      final int _cursorIndexOfTime = 2;
      final int _cursorIndexOfRole = 3;
      final int _cursorIndexOfChatId = 4;
      final int _cursorIndexOfId = 5;
      while (_cursor.moveToNext()) {
        final Long _tmpKey;
        if (_cursor.isNull(_itemKeyIndex)) {
          _tmpKey = null;
        } else {
          _tmpKey = _cursor.getLong(_itemKeyIndex);
        }
        if (_tmpKey != null) {
          final ArrayList<ChatMessage> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final ChatMessage _item_1;
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final boolean _tmpGenerating;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfGenerating);
            _tmpGenerating = _tmp != 0;
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final String _tmpRole;
            if (_cursor.isNull(_cursorIndexOfRole)) {
              _tmpRole = null;
            } else {
              _tmpRole = _cursor.getString(_cursorIndexOfRole);
            }
            final Long _tmpChatId;
            if (_cursor.isNull(_cursorIndexOfChatId)) {
              _tmpChatId = null;
            } else {
              _tmpChatId = _cursor.getLong(_cursorIndexOfChatId);
            }
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item_1 = new ChatMessage(_tmpContent,_tmpGenerating,_tmpTime,_tmpRole,_tmpChatId,_tmpId);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
