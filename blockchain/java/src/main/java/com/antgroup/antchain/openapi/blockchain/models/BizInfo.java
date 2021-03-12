// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BizInfo extends TeaModel {
    // BPWZPFCN
    @NameInMap("client_tenent")
    public String clientTenent;

    // 业务代码
    @NameInMap("code")
    public String code;

    public static BizInfo build(java.util.Map<String, ?> map) throws Exception {
        BizInfo self = new BizInfo();
        return TeaModel.build(map, self);
    }

    public BizInfo setClientTenent(String clientTenent) {
        this.clientTenent = clientTenent;
        return this;
    }
    public String getClientTenent() {
        return this.clientTenent;
    }

    public BizInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
