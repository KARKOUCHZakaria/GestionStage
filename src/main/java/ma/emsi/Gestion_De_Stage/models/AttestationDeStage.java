package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class AttestationDeStage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateAttestation;
    private String description;

    @OneToOne
    @JoinColumn(name = "stage_id")
    private Stage stage;
}
