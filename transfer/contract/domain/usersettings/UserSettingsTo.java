package transfer.contract.domain.usersettings;

import lombok.Builder;

import java.util.UUID;

@Builder(toBuilder = true)
public record UserSettingsTo(
        UUID id,
        String username,
        String avatar
) {
}
