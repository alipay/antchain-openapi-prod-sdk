// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class MpaasUserGamecenterPaymentVirtualdeliveryResponse extends TeaModel {
    // 发货结果
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static MpaasUserGamecenterPaymentVirtualdeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        MpaasUserGamecenterPaymentVirtualdeliveryResponse self = new MpaasUserGamecenterPaymentVirtualdeliveryResponse();
        return TeaModel.build(map, self);
    }

    public MpaasUserGamecenterPaymentVirtualdeliveryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
