package entity;

import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "attendance")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
public class Attendance implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "attendance_type_id")
    private String attendanceTypeId;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updatedAt")
    private String updated_at;

    @Column(name = "entry_date")
    private String entryDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "attendance_type_id", orphanRemoval = true)
    private Set<AttendanceType> attendanceTypes = new HashSet<>();


}

