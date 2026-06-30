// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeviceRiskResp extends TeaModel {
    // apdid
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("apdid")
    @Validation(required = true)
    public String apdid;

    // apdid_token
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    // risk_level
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    // risk_desc
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("risk_desc")
    @Validation(required = true)
    public String riskDesc;

    // sug_action
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("sug_action")
    @Validation(required = true)
    public String sugAction;

    // risk_labels
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("risk_labels")
    @Validation(required = true)
    public java.util.List<String> riskLabels;

    public static DeviceRiskResp build(java.util.Map<String, ?> map) throws Exception {
        DeviceRiskResp self = new DeviceRiskResp();
        return TeaModel.build(map, self);
    }

    public DeviceRiskResp setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

    public DeviceRiskResp setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public DeviceRiskResp setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

    public DeviceRiskResp setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

    public DeviceRiskResp setSugAction(String sugAction) {
        this.sugAction = sugAction;
        return this;
    }
    public String getSugAction() {
        return this.sugAction;
    }

    public DeviceRiskResp setRiskLabels(java.util.List<String> riskLabels) {
        this.riskLabels = riskLabels;
        return this;
    }
    public java.util.List<String> getRiskLabels() {
        return this.riskLabels;
    }

}
