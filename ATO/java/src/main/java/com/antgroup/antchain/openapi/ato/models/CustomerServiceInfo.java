// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CustomerServiceInfo extends TeaModel {
    // 公司社会统一信息代码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>xxx公司</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    // 处理类型:
    // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
    // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
    /**
     * <strong>example:</strong>
     * <p>MERCHANT_PROCESS</p>
     */
    @NameInMap("process_type")
    public String processType;

    public static CustomerServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomerServiceInfo self = new CustomerServiceInfo();
        return TeaModel.build(map, self);
    }

    public CustomerServiceInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CustomerServiceInfo setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CustomerServiceInfo setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

}
