package com.dev.sec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;	
    
    public Role() {

    }

    public Role(RoleName name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public Role withId(Long id) {
		this.id = id;
		return this;
	}

	public RoleName withName() {
		return name;
	}

	public Role withName(RoleName name) {
		this.name = name;
		return this;
	}

}
