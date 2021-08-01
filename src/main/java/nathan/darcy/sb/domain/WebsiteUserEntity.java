package nathan.darcy.sb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="website_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WebsiteUserEntity {
    @Id
    @Column(name="website_user_id")
    private Long websiteUserId;

    @Column(name="user_name")
    private String userName;

    @JoinColumn(name="application_id")
    @ManyToOne
    private ApplicationEntity application;

}
