package com.crio.jumbotail.assettracking.exchanges;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LocationDataDto implements Serializable {

	private LocationDto locationDto;

	private long deviceTimestamp;

	public LocationDataDto(LocationDto locationDto, long deviceTimestamp) {
		this.locationDto = locationDto;
		this.deviceTimestamp = deviceTimestamp;
	}
}
