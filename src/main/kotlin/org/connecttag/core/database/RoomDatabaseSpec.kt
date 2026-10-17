package org.connecttag.core.database

import androidx.room.RoomDatabase
import androidx.room.migration.Migration

/**
 * Specification for creating a Room database instance.
 */
public data class RoomDatabaseSpec<T : RoomDatabase>(
    val databaseClass: Class<T>,
    val name: String,
    val migrations: Array<Migration> = emptyArray(),
    val destructiveMigrationFallback: Boolean = true,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RoomDatabaseSpec<*>) return false

        return databaseClass == other.databaseClass &&
            name == other.name &&
            migrations.contentEquals(other.migrations) &&
            destructiveMigrationFallback == other.destructiveMigrationFallback
    }

    override fun hashCode(): Int {
        var result = databaseClass.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + migrations.contentHashCode()
        result = 31 * result + destructiveMigrationFallback.hashCode()
        return result
    }
}
