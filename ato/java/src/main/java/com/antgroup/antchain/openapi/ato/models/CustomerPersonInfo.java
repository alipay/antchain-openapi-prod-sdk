// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CustomerPersonInfo extends TeaModel {
    // 客诉处理员支付宝账号
    @NameInMap("alipay_logon_id")
    @Validation(required = true)
    public String alipayLogonId;

    // 客诉处理员支付宝绑定手机号
    @NameInMap("alipay_bind_mobile")
    @Validation(required = true)
    public String alipayBindMobile;

    // 客服人员名称
    @NameInMap("customer_service_name")
    @Validation(required = true)
    public String customerServiceName;

    public static CustomerPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomerPersonInfo self = new CustomerPersonInfo();
        return TeaModel.build(map, self);
    }

    public CustomerPersonInfo setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public CustomerPersonInfo setAlipayBindMobile(String alipayBindMobile) {
        this.alipayBindMobile = alipayBindMobile;
        return this;
    }
    public String getAlipayBindMobile() {
        return this.alipayBindMobile;
    }

    public CustomerPersonInfo setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
        return this;
    }
    public String getCustomerServiceName() {
        return this.customerServiceName;
    }

}
