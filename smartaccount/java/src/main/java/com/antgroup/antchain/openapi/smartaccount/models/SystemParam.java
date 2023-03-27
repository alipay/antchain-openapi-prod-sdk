// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartaccount.models;

import com.aliyun.tea.*;

public class SystemParam extends TeaModel {
    // 合作伙伴
    @NameInMap("partner")
    @Validation(required = true)
    public String partner;

    // 业务场景单元
    @NameInMap("function")
    @Validation(required = true)
    public String function;

    // 业务幂等号
    @NameInMap("request_id")
    public String requestId;

    public static SystemParam build(java.util.Map<String, ?> map) throws Exception {
        SystemParam self = new SystemParam();
        return TeaModel.build(map, self);
    }

    public SystemParam setPartner(String partner) {
        this.partner = partner;
        return this;
    }
    public String getPartner() {
        return this.partner;
    }

    public SystemParam setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public SystemParam setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
