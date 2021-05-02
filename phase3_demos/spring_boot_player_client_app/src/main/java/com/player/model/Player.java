package com.player.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
public class Player {

	
	private int id;
	private String name;
	private String teamName;
	private int age;
	private long contact;
}
