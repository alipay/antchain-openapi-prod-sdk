// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ClusterInfo extends TeaModel {
    // 产品信息
    @NameInMap("prod_infos")
    @Validation(required = true)
    public java.util.List<ProdInfo> prodInfos;

    public static ClusterInfo build(java.util.Map<String, ?> map) throws Exception {
        ClusterInfo self = new ClusterInfo();
        return TeaModel.build(map, self);
    }

    public ClusterInfo setProdInfos(java.util.List<ProdInfo> prodInfos) {
        this.prodInfos = prodInfos;
        return this;
    }
    public java.util.List<ProdInfo> getProdInfos() {
        return this.prodInfos;
    }

}
