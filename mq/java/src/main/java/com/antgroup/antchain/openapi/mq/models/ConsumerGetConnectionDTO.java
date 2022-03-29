// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerGetConnectionDTO extends TeaModel {
    // 指定 Group ID 的连接信息
    // 
    // 
    @NameInMap("connection_list")
    @Validation(required = true)
    public java.util.List<ConnectionDTO> connectionList;

    public static ConsumerGetConnectionDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGetConnectionDTO self = new ConsumerGetConnectionDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerGetConnectionDTO setConnectionList(java.util.List<ConnectionDTO> connectionList) {
        this.connectionList = connectionList;
        return this;
    }
    public java.util.List<ConnectionDTO> getConnectionList() {
        return this.connectionList;
    }

}
