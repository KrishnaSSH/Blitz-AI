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
import com.krishna.blitzai.database.entity.GeneratedImage;
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
public final class GeneratedImagesDao_Impl implements GeneratedImagesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GeneratedImage> __insertionAdapterOfGeneratedImage;

  private final EntityDeletionOrUpdateAdapter<GeneratedImage> __deletionAdapterOfGeneratedImage;

  public GeneratedImagesDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGeneratedImage = new EntityInsertionAdapter<GeneratedImage>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `GeneratedImage` (`prompt`,`url`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GeneratedImage entity) {
        if (entity.getPrompt() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getPrompt());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUrl());
        }
        statement.bindLong(3, entity.getId());
      }
    };
    this.__deletionAdapterOfGeneratedImage = new EntityDeletionOrUpdateAdapter<GeneratedImage>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `GeneratedImage` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GeneratedImage entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final GeneratedImage image, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGeneratedImage.insert(image);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final GeneratedImage image, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGeneratedImage.handle(image);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<GeneratedImage>> getAll() {
    final String _sql = "SELECT * FROM GeneratedImage";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"GeneratedImage"}, new Callable<List<GeneratedImage>>() {
      @Override
      @NonNull
      public List<GeneratedImage> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrompt = CursorUtil.getColumnIndexOrThrow(_cursor, "prompt");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<GeneratedImage> _result = new ArrayList<GeneratedImage>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GeneratedImage _item;
            final String _tmpPrompt;
            if (_cursor.isNull(_cursorIndexOfPrompt)) {
              _tmpPrompt = null;
            } else {
              _tmpPrompt = _cursor.getString(_cursorIndexOfPrompt);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new GeneratedImage(_tmpPrompt,_tmpUrl,_tmpId);
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
