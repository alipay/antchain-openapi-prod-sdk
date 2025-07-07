// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidInfo extends TeaModel {
    // 分布式数字身份id
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 分布式数字身份对应的用户名称
    /**
     * <strong>example:</strong>
     * <p>蚂蚁金服</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DidInfo build(java.util.Map<String, ?> map) throws Exception {
        DidInfo self = new DidInfo();
        return TeaModel.build(map, self);
    }

    public DidInfo setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DidInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
