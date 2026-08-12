// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AbcCreateStructB extends TeaModel {
    // 【信息描述】
    /**
     * <strong>example:</strong>
     * <p>这是关于xxx的资料信息</p>
     */
    @NameInMap("info")
    public String info;

    // 【地区】
    /**
     * <strong>example:</strong>
     * <p>浙江省杭州市</p>
     */
    @NameInMap("region")
    public String region;

    public static AbcCreateStructB build(java.util.Map<String, ?> map) throws Exception {
        AbcCreateStructB self = new AbcCreateStructB();
        return TeaModel.build(map, self);
    }

    public AbcCreateStructB setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public AbcCreateStructB setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
