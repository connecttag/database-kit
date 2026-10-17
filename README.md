# database-kit

Reusable Room database primitives for Android libraries.

## Owns

- Generic `BaseDao<T>` insert, update, and delete operations.
- `RoomDatabaseSpec` for describing a Room database class, name, migrations, and destructive migration policy.
- `RoomMigrationPolicy` as a small helper for applying shared migration arrays.

## Boundaries

- Do not add app-specific database names, entities, DAOs, repositories, or migrations here.
- Keep feature-owned schemas in their owning data modules, such as Room store modules.
- Keep SQLCipher passphrase lifecycle in `data:database-passphrase-android`.
- Keep dependency versions in `gradle/libs.versions.toml`.

## Usage

Use this module when a library needs shared Room setup primitives. Storage modules should depend on these helpers while keeping their own entities, migrations, and repository contracts local.
