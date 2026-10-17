package org.connecttag.core.database

import androidx.room.RoomDatabase
import androidx.room.migration.Migration

/**
 * Helper to apply Room migrations centrally.
 */
public object RoomMigrationPolicy {

    /**
     * Default set of migrations.
     */
    public val migrations: Array<Migration> = emptyArray()

    /**
     * Applies [migrations] to the provided [builder].
     */
    public fun apply(builder: RoomDatabase.Builder<out RoomDatabase>): RoomDatabase.Builder<out RoomDatabase> {
        if (migrations.isNotEmpty()) {
            builder.addMigrations(*migrations)
        }
        return builder
    }
}
