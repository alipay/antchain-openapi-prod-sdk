// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CargoTank extends TeaModel {
    // 箱号
    @NameInMap("box_no")
    @Validation(required = true)
    public String boxNo;

    // 铅封号	
    // 
    @NameInMap("lead_sealing_no")
    @Validation(required = true)
    public String leadSealingNo;

    // 箱型	
    @NameInMap("box_type")
    @Validation(required = true)
    public String boxType;

    // 重量	
    @NameInMap("box_weight")
    @Validation(required = true)
    public String boxWeight;

    public static CargoTank build(java.util.Map<String, ?> map) throws Exception {
        CargoTank self = new CargoTank();
        return TeaModel.build(map, self);
    }

    public CargoTank setBoxNo(String boxNo) {
        this.boxNo = boxNo;
        return this;
    }
    public String getBoxNo() {
        return this.boxNo;
    }

    public CargoTank setLeadSealingNo(String leadSealingNo) {
        this.leadSealingNo = leadSealingNo;
        return this;
    }
    public String getLeadSealingNo() {
        return this.leadSealingNo;
    }

    public CargoTank setBoxType(String boxType) {
        this.boxType = boxType;
        return this;
    }
    public String getBoxType() {
        return this.boxType;
    }

    public CargoTank setBoxWeight(String boxWeight) {
        this.boxWeight = boxWeight;
        return this;
    }
    public String getBoxWeight() {
        return this.boxWeight;
    }

}
