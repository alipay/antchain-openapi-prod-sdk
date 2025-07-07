// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcTransmitPayload extends TeaModel {
    // 目标did相关信息列表
    @NameInMap("target_verifier")
    @Validation(required = true)
    public java.util.List<VcTransmitTargetStruct> targetVerifier;

    // 要传输的vc_id
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:xxxxx</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
    /**
     * <strong>example:</strong>
     * <p>json string</p>
     */
    @NameInMap("vc_content")
    public String vcContent;

    public static VcTransmitPayload build(java.util.Map<String, ?> map) throws Exception {
        VcTransmitPayload self = new VcTransmitPayload();
        return TeaModel.build(map, self);
    }

    public VcTransmitPayload setTargetVerifier(java.util.List<VcTransmitTargetStruct> targetVerifier) {
        this.targetVerifier = targetVerifier;
        return this;
    }
    public java.util.List<VcTransmitTargetStruct> getTargetVerifier() {
        return this.targetVerifier;
    }

    public VcTransmitPayload setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcTransmitPayload setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}
