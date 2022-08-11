// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class BareClaim extends TeaModel {
    // 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
    @NameInMap("claim")
    @Validation(required = true)
    public String claim;

    // 证书类型
    @NameInMap("type")
    public String type;

    public static BareClaim build(java.util.Map<String, ?> map) throws Exception {
        BareClaim self = new BareClaim();
        return TeaModel.build(map, self);
    }

    public BareClaim setClaim(String claim) {
        this.claim = claim;
        return this;
    }
    public String getClaim() {
        return this.claim;
    }

    public BareClaim setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
