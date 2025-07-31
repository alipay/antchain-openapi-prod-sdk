// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RejectRiskModel extends TeaModel {
    //  拒量模型捞回分
    /**
     * <strong>example:</strong>
     * <p>0.00570491</p>
     */
    @NameInMap("mob_three_score")
    @Validation(required = true)
    public String mobThreeScore;

    // 拒量模型首逾分
    /**
     * <strong>example:</strong>
     * <p>0.62764417</p>
     */
    @NameInMap("fpd_thirty_score")
    @Validation(required = true)
    public String fpdThirtyScore;

    public static RejectRiskModel build(java.util.Map<String, ?> map) throws Exception {
        RejectRiskModel self = new RejectRiskModel();
        return TeaModel.build(map, self);
    }

    public RejectRiskModel setMobThreeScore(String mobThreeScore) {
        this.mobThreeScore = mobThreeScore;
        return this;
    }
    public String getMobThreeScore() {
        return this.mobThreeScore;
    }

    public RejectRiskModel setFpdThirtyScore(String fpdThirtyScore) {
        this.fpdThirtyScore = fpdThirtyScore;
        return this;
    }
    public String getFpdThirtyScore() {
        return this.fpdThirtyScore;
    }

}
