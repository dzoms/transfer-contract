package transfer.contract.domain.usercontact;

/**
 * Код ошибки при операции нвд пользовательским контактом.
 */
public enum UserContactOperationErrorCode {
    /**
     * Пользовательский контакт уже существует.
     */
    USER_CONTACT_ALREADY_EXIST,
    /**
     * Пользователь добавляет самого себя
     */
    USER_ADDS_HIMSELF,
}
