// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoLicenseValidPeriod extends TeaModel {
    // 营业执照有效期-起
    /**
     * <strong>example:</strong>
     * <p>营业执照有效期-起</p>
     */
    @NameInMap("start_date")
    public String startDate;

    // 营业执照有效期-止
    /**
     * <strong>example:</strong>
     * <p>营业执照有效期-止</p>
     */
    @NameInMap("end_date")
    public String endDate;

    public static MaoLicenseValidPeriod build(java.util.Map<String, ?> map) throws Exception {
        MaoLicenseValidPeriod self = new MaoLicenseValidPeriod();
        return TeaModel.build(map, self);
    }

    public MaoLicenseValidPeriod setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public MaoLicenseValidPeriod setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
