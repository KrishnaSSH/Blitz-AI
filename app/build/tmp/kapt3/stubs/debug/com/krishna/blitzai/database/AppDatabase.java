package com.krishna.blitzai.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/krishna/blitzai/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "audiosDao", "Lcom/krishna/blitzai/database/dao/GeneratedAudiosDao;", "chatsDao", "Lcom/krishna/blitzai/database/dao/ChatsDao;", "imagesDao", "Lcom/krishna/blitzai/database/dao/GeneratedImagesDao;", "messagesDao", "Lcom/krishna/blitzai/database/dao/MessagesDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.krishna.blitzai.database.entity.Chat.class, com.krishna.blitzai.database.entity.ChatMessage.class, com.krishna.blitzai.database.entity.GeneratedImage.class, com.krishna.blitzai.database.entity.GeneratedAudio.class}, version = 4)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    @org.jetbrains.annotations.NotNull
    public static final com.krishna.blitzai.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.krishna.blitzai.database.dao.ChatsDao chatsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.krishna.blitzai.database.dao.MessagesDao messagesDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.krishna.blitzai.database.dao.GeneratedImagesDao imagesDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.krishna.blitzai.database.dao.GeneratedAudiosDao audiosDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/krishna/blitzai/database/AppDatabase$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_2_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_3_4() {
            return null;
        }
    }
}