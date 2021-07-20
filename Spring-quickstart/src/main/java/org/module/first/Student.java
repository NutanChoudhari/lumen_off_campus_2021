package org.module.first;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {

	int id;
	String name;
}
