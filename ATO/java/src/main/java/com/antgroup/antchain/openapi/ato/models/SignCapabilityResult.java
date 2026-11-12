// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignCapabilityResult extends TeaModel {
    // 能力：PREAUTH / WITHHOLD / CONTRACT
    /**
     * <strong>example:</strong>
     * <p>PREAUTH</p>
     */
    @NameInMap("capability")
    public String capability;

    // 能力状态,● NOT_NEEDED：方案不需要该能力（如仅预授权方案的代扣、未开启合同的方案）
    // ● NOT_STARTED：方案需要但尚未发起
    // ● PENDING：已发起，结果未知，等待回执或回查
    // ● SUCCESS：该能力签约成功
    // ● FAIL：业务拒签或失败，本签约单内不可重试
    // ● CANCELLED：已取消，不再参与判定
    /**
     * <strong>example:</strong>
     * <p>NOT_NEEDED</p>
     */
    @NameInMap("status")
    public String status;

    // status=FAIL 时的失败码，见后文说明
    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("fail_code")
    public String failCode;

    // status=FAIL 时的失败描述
    /**
     * <strong>example:</strong>
     * <p>失败信息</p>
     */
    @NameInMap("fail_msg")
    public String failMsg;

    // 能力资源号：预授权为 planNo（授权计划号）；代扣为 agreementNo（协议号）；合同为 contractSignNo（签署单号）。能力尚未发起时为空
    /**
     * <strong>example:</strong>
     * <p>planNo</p>
     */
    @NameInMap("resource_ref")
    public String resourceRef;

    public static SignCapabilityResult build(java.util.Map<String, ?> map) throws Exception {
        SignCapabilityResult self = new SignCapabilityResult();
        return TeaModel.build(map, self);
    }

    public SignCapabilityResult setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

    public SignCapabilityResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SignCapabilityResult setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public SignCapabilityResult setFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }
    public String getFailMsg() {
        return this.failMsg;
    }

    public SignCapabilityResult setResourceRef(String resourceRef) {
        this.resourceRef = resourceRef;
        return this;
    }
    public String getResourceRef() {
        return this.resourceRef;
    }

}
