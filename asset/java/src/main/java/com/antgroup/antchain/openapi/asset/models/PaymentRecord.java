// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class PaymentRecord extends TeaModel {
    // 云上租户id	
    @NameInMap("cloud_tenant_id")
    @Validation(required = true)
    public String cloudTenantId;

    // 打款金额，单位分
    @NameInMap("payment_amount")
    @Validation(required = true)
    public Long paymentAmount;

    // 服务商名称 - 即云租户名称，比如南京飞翰
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 打款日期
    @NameInMap("payment_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String paymentDate;

    // 唯一请求id，即payment_record_id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    public static PaymentRecord build(java.util.Map<String, ?> map) throws Exception {
        PaymentRecord self = new PaymentRecord();
        return TeaModel.build(map, self);
    }

    public PaymentRecord setCloudTenantId(String cloudTenantId) {
        this.cloudTenantId = cloudTenantId;
        return this;
    }
    public String getCloudTenantId() {
        return this.cloudTenantId;
    }

    public PaymentRecord setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public Long getPaymentAmount() {
        return this.paymentAmount;
    }

    public PaymentRecord setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public PaymentRecord setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    public String getPaymentDate() {
        return this.paymentDate;
    }

    public PaymentRecord setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
