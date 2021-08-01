package nathan.darcy.sb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebsiteUserDto {
    private String id;
    private String username;
    private String applicationName;
}
