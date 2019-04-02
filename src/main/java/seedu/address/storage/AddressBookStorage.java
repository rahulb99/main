package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.EPiggy;
import seedu.address.model.ReadOnlyEPiggy;

/**
 * Represents a storage for {@link EPiggy}.
 */
public interface AddressBookStorage {

    /**
     * Returns the file path of the data file.
     */
    Path getAddressBookFilePath();

    /**
     * Returns EPiggy data as a {@link ReadOnlyEPiggy}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<seedu.address.model.ReadOnlyEPiggy> readAddressBook() throws DataConversionException, IOException;

    /**
     * @see #getAddressBookFilePath()
     */
    Optional<seedu.address.model.ReadOnlyEPiggy> readAddressBook(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyEPiggy} to the storage.
     * @param ePiggy cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveAddressBook(ReadOnlyEPiggy ePiggy) throws IOException;

    /**
     * @see #saveAddressBook(ReadOnlyEPiggy)
     */
    void saveAddressBook(ReadOnlyEPiggy ePiggy, Path filePath) throws IOException;

    /**
     * Creates a backup file for {@link ReadOnlyEPiggy}
     * @param ePiggy
     * @throws IOException
     */
    void backupAddressBook(ReadOnlyEPiggy ePiggy) throws IOException;

}
