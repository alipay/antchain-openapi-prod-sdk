// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VehicleLicenseCertResult extends TeaModel {
    // 与车辆的车牌号是否一致
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("plate_number")
    public Boolean plateNumber;

    // 与车辆对应号牌种类是否一致
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("plate_type")
    public Boolean plateType;

    // 与车辆所有人是否一致
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("owner")
    public Boolean owner;

    public static VehicleLicenseCertResult build(java.util.Map<String, ?> map) throws Exception {
        VehicleLicenseCertResult self = new VehicleLicenseCertResult();
        return TeaModel.build(map, self);
    }

    public VehicleLicenseCertResult setPlateNumber(Boolean plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }
    public Boolean getPlateNumber() {
        return this.plateNumber;
    }

    public VehicleLicenseCertResult setPlateType(Boolean plateType) {
        this.plateType = plateType;
        return this;
    }
    public Boolean getPlateType() {
        return this.plateType;
    }

    public VehicleLicenseCertResult setOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }
    public Boolean getOwner() {
        return this.owner;
    }

}
