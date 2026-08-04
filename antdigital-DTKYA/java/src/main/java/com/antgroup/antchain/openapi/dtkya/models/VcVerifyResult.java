// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VcVerifyResult extends TeaModel {
    // vcId
    /**
     * <strong>example:</strong>
     * <p>vcId</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // VC核验结果
    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // VC核验结果描述
    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static VcVerifyResult build(java.util.Map<String, ?> map) throws Exception {
        VcVerifyResult self = new VcVerifyResult();
        return TeaModel.build(map, self);
    }

    public VcVerifyResult setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcVerifyResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VcVerifyResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
