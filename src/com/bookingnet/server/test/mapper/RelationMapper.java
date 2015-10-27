package com.bookingnet.server.test.mapper;

import java.util.ArrayList;

import net.cbtltd.shared.Relation;

public interface RelationMapper {

	//Integeration check tables test cases
	ArrayList<Relation> attributeCountLT4ForPropertiesbySupplierId(String supplierId);
}
