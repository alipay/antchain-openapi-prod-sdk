// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ResultItem extends TeaModel {
    // dataId
    /**
     * <strong>example:</strong>
     * <p>46052e46721417297df682ef88a8ab91</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 分值
    /**
     * <strong>example:</strong>
     * <p>0.32223</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 特征值
    /**
     * <strong>example:</strong>
     * <p>{&quot;feature1&quot;:0.223,&quot;feature2&quot;:0.33,&quot;feature3&quot;:0.323}</p>
     */
    @NameInMap("feature_json")
    public String featureJson;

    // 单调样本数据处理结果
    // 初始化/处理中/成功/失败
    /**
     * <strong>example:</strong>
     * <p>INIT/PROCESS/SUCCESS/FAIL</p>
     */
    @NameInMap("status")
    public String status;

    // 各个子分
    /**
     * <strong>example:</strong>
     * <p>{&quot;score1&quot;:0.22233,&quot;score2&quot;:0.34234,&quot;score3&quot;:0.34343}</p>
     */
    @NameInMap("score_json")
    @Validation(required = true)
    public String scoreJson;

    public static ResultItem build(java.util.Map<String, ?> map) throws Exception {
        ResultItem self = new ResultItem();
        return TeaModel.build(map, self);
    }

    public ResultItem setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ResultItem setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public ResultItem setFeatureJson(String featureJson) {
        this.featureJson = featureJson;
        return this;
    }
    public String getFeatureJson() {
        return this.featureJson;
    }

    public ResultItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ResultItem setScoreJson(String scoreJson) {
        this.scoreJson = scoreJson;
        return this;
    }
    public String getScoreJson() {
        return this.scoreJson;
    }

}
