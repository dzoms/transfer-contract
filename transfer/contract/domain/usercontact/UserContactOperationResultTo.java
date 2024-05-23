package transfer.contract.domain.usercontact;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import transfer.contract.domain.common.OperationStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Результат операции над пользовательским контактом.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserContactOperationResultTo {
    /**
     * Статус выполнения операции.
     */
    @Builder.Default
    private OperationStatus status = OperationStatus.OK;

    /**
     * Идентификатор пользовательского контакта, над которой была произведена операция.
     */
    private UUID userContact;

    /**
     * Ошибки, возникшие в результате выполнения операции.
     */
    @Builder.Default
    private List<UserSettingsOperationErrorTo> errors = new ArrayList<>();

    /**
     * TO ошибки при операции над пользовательским контактом.
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder(toBuilder = true)
    public static class UserSettingsOperationErrorTo {
        /**
         * Идентификатор сущности проекта, у которого произошла ошибка при выполнении операции.
         */
        private UUID Id;

        /**
         * Код ошибки при операции над доской.
         */
        private UserContactOperationErrorCode errorCode;
    }
}