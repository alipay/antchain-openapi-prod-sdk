// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class GrantOrderDetail extends TeaModel {
    // 券编码
    /**
     * <strong>example:</strong>
     * <p>1798234932684395</p>
     */
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    public static GrantOrderDetail build(java.util.Map<String, ?> map) throws Exception {
        GrantOrderDetail self = new GrantOrderDetail();
        return TeaModel.build(map, self);
    }

    public GrantOrderDetail setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

}
