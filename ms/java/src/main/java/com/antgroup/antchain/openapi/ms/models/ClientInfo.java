// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ClientInfo extends TeaModel {
    // 订阅客户端地址列表
    @NameInMap("ip")
    public String ip;

    public static ClientInfo build(java.util.Map<String, ?> map) throws Exception {
        ClientInfo self = new ClientInfo();
        return TeaModel.build(map, self);
    }

    public ClientInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
