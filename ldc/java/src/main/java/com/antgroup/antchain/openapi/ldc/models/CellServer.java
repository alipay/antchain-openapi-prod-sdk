// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellServer extends TeaModel {
    // 单元名字
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // server或pod组
    @NameInMap("servers")
    public java.util.List<String> servers;

    // cell中host的数量
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // servers列表对应的服务器/pod ip地址列表，目前仅在antcloud.ldc.opsplan.stages.export方法中返回
    @NameInMap("server_ips")
    public java.util.List<String> serverIps;

    public static CellServer build(java.util.Map<String, ?> map) throws Exception {
        CellServer self = new CellServer();
        return TeaModel.build(map, self);
    }

    public CellServer setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CellServer setServers(java.util.List<String> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<String> getServers() {
        return this.servers;
    }

    public CellServer setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public CellServer setServerIps(java.util.List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

}
