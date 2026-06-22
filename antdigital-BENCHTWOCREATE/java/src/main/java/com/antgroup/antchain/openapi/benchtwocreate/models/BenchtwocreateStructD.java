// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class BenchtwocreateStructD extends TeaModel {
    // 【地区】
    /**
     * <strong>example:</strong>
     * <p>浙江省杭州市西湖区xxx街道xxx-xxx-xxx</p>
     */
    @NameInMap("region")
    public String region;

    public static BenchtwocreateStructD build(java.util.Map<String, ?> map) throws Exception {
        BenchtwocreateStructD self = new BenchtwocreateStructD();
        return TeaModel.build(map, self);
    }

    public BenchtwocreateStructD setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
