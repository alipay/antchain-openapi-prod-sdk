// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Client extends TeaModel {
    // 所属的 cell
    @NameInMap("cell")
    public String cell;

    // 客户端内存里的值
    @NameInMap("data")
    public String data;

    // 客户端 IP
    @NameInMap("ip")
    public String ip;

    // 推送的值
    @NameInMap("push_data")
    public String pushData;

    public static Client build(java.util.Map<String, ?> map) throws Exception {
        Client self = new Client();
        return TeaModel.build(map, self);
    }

    public Client setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public Client setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Client setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public Client setPushData(String pushData) {
        this.pushData = pushData;
        return this;
    }
    public String getPushData() {
        return this.pushData;
    }

}
