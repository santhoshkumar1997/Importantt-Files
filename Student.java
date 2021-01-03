package factory.software.santhosh.jpa.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "Student")
@Table(name = "STUDENT", uniqueConstraints = {
		@UniqueConstraint(name = "student_email_unique", columnNames = "email") })
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@Column(name = "id", updatable = false)
	private Long id;
	@Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
	private String firstName;
	@Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
	private String lastName;
	@Column(name = "email", nullable = false, columnDefinition = "TEXT")
	private String email;
	@Column(name = "age", nullable = false)
	private Integer age;
}
