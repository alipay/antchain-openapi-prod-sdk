// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CommitmentInfo extends TeaModel {
    // 租金总额
    /**
     * <strong>example:</strong>
     * <p>7890.00</p>
     */
    @NameInMap("total_rent")
    @Validation(required = true)
    public String totalRent;

    // 租赁分期信息
    @NameInMap("rental_staging_information")
    @Validation(required = true)
    public java.util.List<RentalStagingInformation> rentalStagingInformation;

    public static CommitmentInfo build(java.util.Map<String, ?> map) throws Exception {
        CommitmentInfo self = new CommitmentInfo();
        return TeaModel.build(map, self);
    }

    public CommitmentInfo setTotalRent(String totalRent) {
        this.totalRent = totalRent;
        return this;
    }
    public String getTotalRent() {
        return this.totalRent;
    }

    public CommitmentInfo setRentalStagingInformation(java.util.List<RentalStagingInformation> rentalStagingInformation) {
        this.rentalStagingInformation = rentalStagingInformation;
        return this;
    }
    public java.util.List<RentalStagingInformation> getRentalStagingInformation() {
        return this.rentalStagingInformation;
    }

}
