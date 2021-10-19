// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class PredictResponse extends TeaModel {
    // 资产明细ID
    @NameInMap("asset_detail_id")
    public String assetDetailId;

    // 反向指标
    @NameInMap("probability0")
    public String probability0;

    // 正向指标
    @NameInMap("probability1")
    public String probability1;

    // 身份证号码MD5
    @NameInMap("cert_no_md5")
    public String certNoMd5;

    // 身份证号码MD5
    @NameInMap("mobile_md5")
    public String mobileMd5;

    // 可选值，A,B,C
    @NameInMap("level")
    public String level;

    // 内部特征预测分数
    @NameInMap("prediction_score")
    public String predictionScore;

    // 身份证号码
    @NameInMap("cert_no")
    public String certNo;

    public static PredictResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictResponse self = new PredictResponse();
        return TeaModel.build(map, self);
    }

    public PredictResponse setAssetDetailId(String assetDetailId) {
        this.assetDetailId = assetDetailId;
        return this;
    }
    public String getAssetDetailId() {
        return this.assetDetailId;
    }

    public PredictResponse setProbability0(String probability0) {
        this.probability0 = probability0;
        return this;
    }
    public String getProbability0() {
        return this.probability0;
    }

    public PredictResponse setProbability1(String probability1) {
        this.probability1 = probability1;
        return this;
    }
    public String getProbability1() {
        return this.probability1;
    }

    public PredictResponse setCertNoMd5(String certNoMd5) {
        this.certNoMd5 = certNoMd5;
        return this;
    }
    public String getCertNoMd5() {
        return this.certNoMd5;
    }

    public PredictResponse setMobileMd5(String mobileMd5) {
        this.mobileMd5 = mobileMd5;
        return this;
    }
    public String getMobileMd5() {
        return this.mobileMd5;
    }

    public PredictResponse setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public PredictResponse setPredictionScore(String predictionScore) {
        this.predictionScore = predictionScore;
        return this;
    }
    public String getPredictionScore() {
        return this.predictionScore;
    }

    public PredictResponse setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
