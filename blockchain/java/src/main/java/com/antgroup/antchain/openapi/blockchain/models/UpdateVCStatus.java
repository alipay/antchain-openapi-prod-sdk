// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateVCStatus extends TeaModel {
    // valid or invalid
    /**
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 可验证声明id
    /**
     * <strong>example:</strong>
     * <p>vc:mychain:xxxx</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    public static UpdateVCStatus build(java.util.Map<String, ?> map) throws Exception {
        UpdateVCStatus self = new UpdateVCStatus();
        return TeaModel.build(map, self);
    }

    public UpdateVCStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateVCStatus setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
