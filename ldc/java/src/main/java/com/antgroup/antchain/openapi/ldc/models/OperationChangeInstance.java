// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OperationChangeInstance extends TeaModel {
    // 主机名
    @NameInMap("hostname")
    public String hostname;

    // 部署单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // ip
    @NameInMap("ip")
    public String ip;

    // 资源ID
    @NameInMap("id")
    public String id;

    public static OperationChangeInstance build(java.util.Map<String, ?> map) throws Exception {
        OperationChangeInstance self = new OperationChangeInstance();
        return TeaModel.build(map, self);
    }

    public OperationChangeInstance setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public OperationChangeInstance setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public OperationChangeInstance setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public OperationChangeInstance setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
