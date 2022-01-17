// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwHostVO extends TeaModel {
    // 服务器地址，域名或ip(:端口)
    @NameInMap("address")
    public String address;

    // host name
    @NameInMap("host_name")
    public String hostName;

    // 元信息
    @NameInMap("meta_data")
    public String metaData;

    public static SofaGwHostVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwHostVO self = new SofaGwHostVO();
        return TeaModel.build(map, self);
    }

    public SofaGwHostVO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SofaGwHostVO setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SofaGwHostVO setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

}
