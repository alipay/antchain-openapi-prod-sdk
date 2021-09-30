// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class PredictRequest extends TeaModel {
    // 资产明细ID
    @NameInMap("asset_detail_id")
    public String assetDetailId;

    // 身份证号码MD5
    @NameInMap("cert_no_md5")
    @Validation(required = true)
    public String certNoMd5;

    // 已还总额,默认0
    @NameInMap("payback_amount")
    public Long paybackAmount;

    // 已还期数，默认0
    @NameInMap("payback_num")
    public Long paybackNum;

    // 逾期月数
    @NameInMap("overdue_month")
    public Long overdueMonth;

    // 债务人信用分数，由系统计算得出，无须传入。
    @NameInMap("prediction_score")
    public String predictionScore;

    public static PredictRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictRequest self = new PredictRequest();
        return TeaModel.build(map, self);
    }

    public PredictRequest setAssetDetailId(String assetDetailId) {
        this.assetDetailId = assetDetailId;
        return this;
    }
    public String getAssetDetailId() {
        return this.assetDetailId;
    }

    public PredictRequest setCertNoMd5(String certNoMd5) {
        this.certNoMd5 = certNoMd5;
        return this;
    }
    public String getCertNoMd5() {
        return this.certNoMd5;
    }

    public PredictRequest setPaybackAmount(Long paybackAmount) {
        this.paybackAmount = paybackAmount;
        return this;
    }
    public Long getPaybackAmount() {
        return this.paybackAmount;
    }

    public PredictRequest setPaybackNum(Long paybackNum) {
        this.paybackNum = paybackNum;
        return this;
    }
    public Long getPaybackNum() {
        return this.paybackNum;
    }

    public PredictRequest setOverdueMonth(Long overdueMonth) {
        this.overdueMonth = overdueMonth;
        return this;
    }
    public Long getOverdueMonth() {
        return this.overdueMonth;
    }

    public PredictRequest setPredictionScore(String predictionScore) {
        this.predictionScore = predictionScore;
        return this;
    }
    public String getPredictionScore() {
        return this.predictionScore;
    }

}
