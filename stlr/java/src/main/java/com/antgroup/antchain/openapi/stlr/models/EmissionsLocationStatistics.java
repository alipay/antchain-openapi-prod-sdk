// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsLocationStatistics extends TeaModel {
    // 盘查单元编码
    @NameInMap("location_no")
    @Validation(required = true)
    public String locationNo;

    // 盘查单元名称
    @NameInMap("location_name")
    @Validation(required = true)
    public String locationName;

    // 盘查单元排放量
    @NameInMap("emission_amount")
    @Validation(required = true)
    public Long emissionAmount;

    // 排放量单位，默认为：tCO2e
    @NameInMap("data_unit")
    @Validation(required = true)
    public String dataUnit;

    public static EmissionsLocationStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsLocationStatistics self = new EmissionsLocationStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsLocationStatistics setLocationNo(String locationNo) {
        this.locationNo = locationNo;
        return this;
    }
    public String getLocationNo() {
        return this.locationNo;
    }

    public EmissionsLocationStatistics setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public EmissionsLocationStatistics setEmissionAmount(Long emissionAmount) {
        this.emissionAmount = emissionAmount;
        return this;
    }
    public Long getEmissionAmount() {
        return this.emissionAmount;
    }

    public EmissionsLocationStatistics setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

}
