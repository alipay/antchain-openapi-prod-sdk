// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class FaceShieldResult extends TeaModel {
    // 设备token
    // 
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
    // 
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    // 风险描述，对风险等级的补充
    // 
    @NameInMap("risk_desc")
    @Validation(required = true)
    public String riskDesc;

    // 处理的建议，如PAAS
    @NameInMap("sug_action")
    @Validation(required = true)
    public String sugAction;

    public static FaceShieldResult build(java.util.Map<String, ?> map) throws Exception {
        FaceShieldResult self = new FaceShieldResult();
        return TeaModel.build(map, self);
    }

    public FaceShieldResult setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public FaceShieldResult setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

    public FaceShieldResult setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

    public FaceShieldResult setSugAction(String sugAction) {
        this.sugAction = sugAction;
        return this;
    }
    public String getSugAction() {
        return this.sugAction;
    }

}
