package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="CONTACT_DETAILS")
@Data
public class Contact {
    
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer ContactId;
	
	@Column(name="CONTACT_NAME")
	private String  ContactName;
	
	@Column(name="CONTACT_EMAIL")
	private String  ContactEmail;
	
	@Column(name="CONTACT_Phno")
	private Long    ContactPhno;
	
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDate CreateDate;
	
	@Column(name="UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate  UpdateDate;
	
	@Column(name="ACTIVE_SW")
	private String ActiveSw;
}
