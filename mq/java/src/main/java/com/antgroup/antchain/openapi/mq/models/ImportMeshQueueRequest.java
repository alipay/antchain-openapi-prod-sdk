// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ImportMeshQueueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关联应用名
    @NameInMap("asso_app")
    @Validation(required = true)
    public String assoApp;

    // 通道名
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 队列管理器ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // 队列管理器名
    @NameInMap("manager")
    @Validation(required = true)
    public String manager;

    // 队列名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 队列管理器端口
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    // 队列类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ImportMeshQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMeshQueueRequest self = new ImportMeshQueueRequest();
        return TeaModel.build(map, self);
    }

    public ImportMeshQueueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportMeshQueueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportMeshQueueRequest setAssoApp(String assoApp) {
        this.assoApp = assoApp;
        return this;
    }
    public String getAssoApp() {
        return this.assoApp;
    }

    public ImportMeshQueueRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ImportMeshQueueRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ImportMeshQueueRequest setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public ImportMeshQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportMeshQueueRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ImportMeshQueueRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
