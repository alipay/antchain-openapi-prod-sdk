// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class AigcRiskResult extends TeaModel {
    // AIGC风险检测评分
    /**
     * <strong>example:</strong>
     * <p>safe</p>
     */
    @NameInMap("aigc_risk_level")
    public String aigcRiskLevel;

    // 图像伪造分数
    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("deepfake_score")
    public String deepfakeScore;

    // 图像伪造结论
    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("deepfake_result")
    public String deepfakeResult;

    // 视频伪造分数
    /**
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("video_forgery_score")
    public String videoForgeryScore;

    // 视频伪造结论
    /**
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("video_forgery_result")
    public String videoForgeryResult;

    public static AigcRiskResult build(java.util.Map<String, ?> map) throws Exception {
        AigcRiskResult self = new AigcRiskResult();
        return TeaModel.build(map, self);
    }

    public AigcRiskResult setAigcRiskLevel(String aigcRiskLevel) {
        this.aigcRiskLevel = aigcRiskLevel;
        return this;
    }
    public String getAigcRiskLevel() {
        return this.aigcRiskLevel;
    }

    public AigcRiskResult setDeepfakeScore(String deepfakeScore) {
        this.deepfakeScore = deepfakeScore;
        return this;
    }
    public String getDeepfakeScore() {
        return this.deepfakeScore;
    }

    public AigcRiskResult setDeepfakeResult(String deepfakeResult) {
        this.deepfakeResult = deepfakeResult;
        return this;
    }
    public String getDeepfakeResult() {
        return this.deepfakeResult;
    }

    public AigcRiskResult setVideoForgeryScore(String videoForgeryScore) {
        this.videoForgeryScore = videoForgeryScore;
        return this;
    }
    public String getVideoForgeryScore() {
        return this.videoForgeryScore;
    }

    public AigcRiskResult setVideoForgeryResult(String videoForgeryResult) {
        this.videoForgeryResult = videoForgeryResult;
        return this;
    }
    public String getVideoForgeryResult() {
        return this.videoForgeryResult;
    }

}
