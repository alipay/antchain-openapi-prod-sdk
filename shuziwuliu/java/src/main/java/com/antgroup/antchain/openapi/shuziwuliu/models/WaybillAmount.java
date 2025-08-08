// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class WaybillAmount extends TeaModel {
    // 运单金额（2位小数）
    /**
     * <strong>example:</strong>
     * <p>100000.00</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 运单号
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    public static WaybillAmount build(java.util.Map<String, ?> map) throws Exception {
        WaybillAmount self = new WaybillAmount();
        return TeaModel.build(map, self);
    }

    public WaybillAmount setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public WaybillAmount setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
