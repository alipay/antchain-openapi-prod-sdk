// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PfVoucherCheckResult extends TeaModel {
    // 凭证id
    /**
     * <strong>example:</strong>
     * <p>20119112323</p>
     */
    @NameInMap("voucher_id")
    @Validation(required = true)
    public String voucherId;

    // 凭证类型
    /**
     * <strong>example:</strong>
     * <p>WAYBILL</p>
     */
    @NameInMap("voucher_category")
    @Validation(required = true)
    public String voucherCategory;

    // 状态；PASS:通过，NO_PASS 未通过
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static PfVoucherCheckResult build(java.util.Map<String, ?> map) throws Exception {
        PfVoucherCheckResult self = new PfVoucherCheckResult();
        return TeaModel.build(map, self);
    }

    public PfVoucherCheckResult setVoucherId(String voucherId) {
        this.voucherId = voucherId;
        return this;
    }
    public String getVoucherId() {
        return this.voucherId;
    }

    public PfVoucherCheckResult setVoucherCategory(String voucherCategory) {
        this.voucherCategory = voucherCategory;
        return this;
    }
    public String getVoucherCategory() {
        return this.voucherCategory;
    }

    public PfVoucherCheckResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
