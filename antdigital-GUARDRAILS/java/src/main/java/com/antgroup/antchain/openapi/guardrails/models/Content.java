// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.guardrails.models;

import com.aliyun.tea.*;

public class Content extends TeaModel {
    // 护栏业务编码
    /**
     * <strong>example:</strong>
     * <p>护栏业务编码</p>
     */
    @NameInMap("business_code")
    public String businessCode;

    // 护栏业务文案
    /**
     * <strong>example:</strong>
     * <p>护栏业务文案</p>
     */
    @NameInMap("business_msg")
    public String businessMsg;

    public static Content build(java.util.Map<String, ?> map) throws Exception {
        Content self = new Content();
        return TeaModel.build(map, self);
    }

    public Content setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public Content setBusinessMsg(String businessMsg) {
        this.businessMsg = businessMsg;
        return this;
    }
    public String getBusinessMsg() {
        return this.businessMsg;
    }

}
