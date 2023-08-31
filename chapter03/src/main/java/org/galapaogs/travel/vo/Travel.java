package org.galapaogs.travel.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	private int no;
	private String title;
	private String region;
	private String address;
	private String phone;
	private String description;
	
	
}
