package com.beaconfire.housingservice.domain.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FacilityReportDetailRequest {
    private Integer facilityReportId;
    private Integer employeeId;
    private String comment;
}
