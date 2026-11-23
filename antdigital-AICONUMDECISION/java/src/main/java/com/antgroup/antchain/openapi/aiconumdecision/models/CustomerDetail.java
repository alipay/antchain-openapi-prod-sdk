// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class CustomerDetail extends TeaModel {
    // 用户凭证，按 paramType 对应格式；任一格式错误或同批重复，本批次全部失败
    /**
     * <strong>example:</strong>
     * <p>18970942236</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 触达渠道发送所需参数，按所用模板入参填写；无传 {}
    /**
     * <strong>example:</strong>
     * <p>{&quot;姓名&quot;:&quot;陈先生&quot;}</p>
     */
    @NameInMap("channel_params")
    public String channelParams;

    // 用户扩展字段，辅助决策；回执回调将该字段内容原样返回；无传 {}
    /**
     * <strong>example:</strong>
     * <p>{&quot;lastCallTime&quot;:&quot;2026-10-15 10:30:00&quot;}</p>
     */
    @NameInMap("ext_info")
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
