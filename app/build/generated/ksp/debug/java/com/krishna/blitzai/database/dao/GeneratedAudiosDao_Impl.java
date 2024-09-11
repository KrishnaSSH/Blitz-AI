package com.krishna.blitzai.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.krishna.blitzai.database.entity.GeneratedAudio;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
public final class GeneratedAudiosDao_Impl implements GeneratedAudiosDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GeneratedAudio> __insertionAdapterOfGeneratedAudio;

  private final EntityDeletionOrUpdateAdapter<GeneratedAudio> __deletionAdapterOfGeneratedAudio;

  public GeneratedAudiosDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGeneratedAudio = new EntityInsertionAdapter<GeneratedAudio>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `GeneratedAudio` (`input`,`file_path`,`file_mime_type`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GeneratedAudio entity) {
        statement.bindString(1, entity.getInput());
        statement.bindString(2, entity.getFilePath());
        statement.bindString(3, entity.getMimeType());
        statement.bindLong(4, entity.getId());
      }
    };
    this.__deletionAdapterOfGeneratedAudio = new EntityDeletionOrUpdateAdapter<GeneratedAudio>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `GeneratedAudio` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GeneratedAudio entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final GeneratedAudio audio, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGeneratedAudio.insert(audio);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final GeneratedAudio audio, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGeneratedAudio.handle(audio);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<GeneratedAudio>> getAll() {
    final String _sql = "SELECT * FROM GeneratedAudio";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"GeneratedAudio"}, new Callable<List<GeneratedAudio>>() {
      @Override
      @NonNull
      public List<GeneratedAudio> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfInput = CursorUtil.getColumnIndexOrThrow(_cursor, "input");
          final int _cursorIndexOfFilePath = CursorUtil.getColumnIndexOrThrow(_cursor, "file_path");
          final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "file_mime_type");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<GeneratedAudio> _result = new ArrayList<GeneratedAudio>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GeneratedAudio _item;
            final String _tmpInput;
            _tmpInput = _cursor.getString(_cursorIndexOfInput);
            final String _tmpFilePath;
            _tmpFilePath = _cursor.getString(_cursorIndexOfFilePath);
            final String _tmpMimeType;
            _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new GeneratedAudio(_tmpInput,_tmpFilePath,_tmpMimeType,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
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
}
