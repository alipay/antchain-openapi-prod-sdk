// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class MerchantOrderInfo extends TeaModel {
    // 申请单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台方的用户id, 保持唯一
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 申请状态 99-已完结;-1-失败;031-审核中
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static MerchantOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantOrderInfo self = new MerchantOrderInfo();
        return TeaModel.build(map, self);
    }

    public MerchantOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public MerchantOrderInfo setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public MerchantOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
