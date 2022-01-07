// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class PredictRequest extends TeaModel {
    // 资产明细ID
    @NameInMap("external_asset_detail_id")
    public String externalAssetDetailId;

    // 身份证号码MD5
    @NameInMap("cert_no_md5")
    @Validation(required = true)
    public String certNoMd5;

    // 已还总额,默认0
    @NameInMap("payback_amount")
    public String paybackAmount;

    // 已还期数，默认0
    @NameInMap("payback_num")
    public String paybackNum;

    // 逾期月数
    @NameInMap("overdue_day")
    public Long overdueDay;

    // 身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 支付宝内部预测分数
    @NameInMap("prediction_score")
    public String predictionScore;

    public static PredictRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictRequest self = new PredictRequest();
        return TeaModel.build(map, self);
    }

    public PredictRequest setExternalAssetDetailId(String externalAssetDetailId) {
        this.externalAssetDetailId = externalAssetDetailId;
        return this;
    }
    public String getExternalAssetDetailId() {
        return this.externalAssetDetailId;
    }

    public PredictRequest setCertNoMd5(String certNoMd5) {
        this.certNoMd5 = certNoMd5;
        return this;
    }
    public String getCertNoMd5() {
        return this.certNoMd5;
    }

    public PredictRequest setPaybackAmount(String paybackAmount) {
        this.paybackAmount = paybackAmount;
        return this;
    }
    public String getPaybackAmount() {
        return this.paybackAmount;
    }

    public PredictRequest setPaybackNum(String paybackNum) {
        this.paybackNum = paybackNum;
        return this;
    }
    public String getPaybackNum() {
        return this.paybackNum;
    }

    public PredictRequest setOverdueDay(Long overdueDay) {
        this.overdueDay = overdueDay;
        return this;
    }
    public Long getOverdueDay() {
        return this.overdueDay;
    }

    public PredictRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PredictRequest setPredictionScore(String predictionScore) {
        this.predictionScore = predictionScore;
        return this;
    }
    public String getPredictionScore() {
        return this.predictionScore;
    }

}
