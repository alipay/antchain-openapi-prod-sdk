// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defininstchannel.models;

import com.aliyun.tea.*;

public class SystemParam extends TeaModel {
    // 合作方标识，由蚂蚁分配
    @NameInMap("partner")
    @Validation(required = true)
    public String partner;

    // 功能标识，业务接口定义
    @NameInMap("function")
    @Validation(required = true)
    public String function;

    // 请求流水号
    @NameInMap("request_id")
    @Validation(required = true)
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
