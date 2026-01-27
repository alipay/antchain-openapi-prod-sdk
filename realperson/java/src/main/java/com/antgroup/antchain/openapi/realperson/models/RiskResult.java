// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class RiskResult extends TeaModel {
    // 活体检测标签
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("image_labels")
    public String imageLabels;

    // 设备风险等级
    /**
     * <strong>example:</strong>
     * <p>safe</p>
     */
    @NameInMap("device_risk_level")
    public String deviceRiskLevel;

    // 设备风险标签
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("device_risk_labels")
    public String deviceRiskLabels;

    // 行为风险等级
    /**
     * <strong>example:</strong>
     * <p>safe</p>
     */
    @NameInMap("behavior_risk_level")
    public String behaviorRiskLevel;

    // 行为风险标签
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("behavior_risk_labels")
    public String behaviorRiskLabels;

    // 是否关联攻击
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_correlate")
    public Boolean isCorrelate;

    public static RiskResult build(java.util.Map<String, ?> map) throws Exception {
        RiskResult self = new RiskResult();
        return TeaModel.build(map, self);
    }

    public RiskResult setImageLabels(String imageLabels) {
        this.imageLabels = imageLabels;
        return this;
    }
    public String getImageLabels() {
        return this.imageLabels;
    }

    public RiskResult setDeviceRiskLevel(String deviceRiskLevel) {
        this.deviceRiskLevel = deviceRiskLevel;
        return this;
    }
    public String getDeviceRiskLevel() {
        return this.deviceRiskLevel;
    }

    public RiskResult setDeviceRiskLabels(String deviceRiskLabels) {
        this.deviceRiskLabels = deviceRiskLabels;
        return this;
    }
    public String getDeviceRiskLabels() {
        return this.deviceRiskLabels;
    }

    public RiskResult setBehaviorRiskLevel(String behaviorRiskLevel) {
        this.behaviorRiskLevel = behaviorRiskLevel;
        return this;
    }
    public String getBehaviorRiskLevel() {
        return this.behaviorRiskLevel;
    }

    public RiskResult setBehaviorRiskLabels(String behaviorRiskLabels) {
        this.behaviorRiskLabels = behaviorRiskLabels;
        return this;
    }
    public String getBehaviorRiskLabels() {
        return this.behaviorRiskLabels;
    }

    public RiskResult setIsCorrelate(Boolean isCorrelate) {
        this.isCorrelate = isCorrelate;
        return this;
    }
    public Boolean getIsCorrelate() {
        return this.isCorrelate;
    }

}
