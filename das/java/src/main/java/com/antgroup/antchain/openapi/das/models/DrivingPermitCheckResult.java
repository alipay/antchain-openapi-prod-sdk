// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DrivingPermitCheckResult extends TeaModel {
    // 车牌号
    @NameInMap("platenumber")
    public String platenumber;

    // 车牌种类
    @NameInMap("platetype")
    public String platetype;

    // 所有人
    @NameInMap("owner")
    public String owner;

    public static DrivingPermitCheckResult build(java.util.Map<String, ?> map) throws Exception {
        DrivingPermitCheckResult self = new DrivingPermitCheckResult();
        return TeaModel.build(map, self);
    }

    public DrivingPermitCheckResult setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
        return this;
    }
    public String getPlatenumber() {
        return this.platenumber;
    }

    public DrivingPermitCheckResult setPlatetype(String platetype) {
        this.platetype = platetype;
        return this;
    }
    public String getPlatetype() {
        return this.platetype;
    }

    public DrivingPermitCheckResult setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
