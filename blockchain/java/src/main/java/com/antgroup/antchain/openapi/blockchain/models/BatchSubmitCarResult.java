// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchSubmitCarResult extends TeaModel {
    // 提交线索唯一请求id
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("submit_id")
    @Validation(required = true)
    public String submitId;

    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_success")
    @Validation(required = true)
    public Boolean isSuccess;

    // OK
    // NO_DEMAND 无线索需求，需要重试
    // INVALID 无效，不要重试
    /**
     * <strong>example:</strong>
     * <p>OK/INVALID/NO_DEMAND</p>
     */
    @NameInMap("push_result_code")
    @Validation(required = true)
    public String pushResultCode;

    public static BatchSubmitCarResult build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitCarResult self = new BatchSubmitCarResult();
        return TeaModel.build(map, self);
    }

    public BatchSubmitCarResult setSubmitId(String submitId) {
        this.submitId = submitId;
        return this;
    }
    public String getSubmitId() {
        return this.submitId;
    }

    public BatchSubmitCarResult setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public BatchSubmitCarResult setPushResultCode(String pushResultCode) {
        this.pushResultCode = pushResultCode;
        return this;
    }
    public String getPushResultCode() {
        return this.pushResultCode;
    }

}
