// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderDetail extends TeaModel {
    // 凭证编号
    /**
     * <strong>example:</strong>
     * <p>1798234932684395</p>
     */
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    public static OrderDetail build(java.util.Map<String, ?> map) throws Exception {
        OrderDetail self = new OrderDetail();
        return TeaModel.build(map, self);
    }

    public OrderDetail setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

}
