// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ClientValue extends TeaModel {
    // 客户端内存里的值
    @NameInMap("data")
    public String data;

    // 客户端 IP
    @NameInMap("ip")
    public String ip;

    // 是否查询成功
    @NameInMap("success")
    public Boolean success;

    public static ClientValue build(java.util.Map<String, ?> map) throws Exception {
        ClientValue self = new ClientValue();
        return TeaModel.build(map, self);
    }

    public ClientValue setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ClientValue setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ClientValue setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
