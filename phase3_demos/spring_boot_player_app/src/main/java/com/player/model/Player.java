package com.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Player {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String teamName;
	private int age;
	private long contact;
}
