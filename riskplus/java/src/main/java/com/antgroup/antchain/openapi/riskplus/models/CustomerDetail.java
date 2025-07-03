// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerDetail extends TeaModel {
    // 用户标识
    /**
     * <strong>example:</strong>
     * <p>&quot;186123456789&quot;</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 渠道参数
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;name&quot;:&quot;苹果&quot;,&quot;code&quot;:&quot;5643&quot;,&quot;num&quot;:&quot;5&quot;}&quot;</p>
     */
    @NameInMap("channel_params")
    @Validation(required = true)
    public String channelParams;

    // 用户透传字段
    /**
     * <strong>example:</strong>
     * <p>&quot;[{&quot;name&quot;:&quot;zhangshan&quot;}]&quot;</p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static CustomerDetail build(java.util.Map<String, ?> map) throws Exception {
        CustomerDetail self = new CustomerDetail();
        return TeaModel.build(map, self);
    }

    public CustomerDetail setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public CustomerDetail setChannelParams(String channelParams) {
        this.channelParams = channelParams;
        return this;
    }
    public String getChannelParams() {
        return this.channelParams;
    }

    public CustomerDetail setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
