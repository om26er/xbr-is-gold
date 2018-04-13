package network.xbr.xbrisgold.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {DisconnectionStat.class, NetworkUsageStat.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DisconnectStatDao getDCStatDao();
    public abstract NetworkUsageStatDao getNetworkStatDao();
}