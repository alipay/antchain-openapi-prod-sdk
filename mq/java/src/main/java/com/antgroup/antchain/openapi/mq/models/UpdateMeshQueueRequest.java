// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueueRequest extends TeaModel {
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

    // 队列id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

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

    public static UpdateMeshQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueueRequest self = new UpdateMeshQueueRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueueRequest setAssoApp(String assoApp) {
        this.assoApp = assoApp;
        return this;
    }
    public String getAssoApp() {
        return this.assoApp;
    }

    public UpdateMeshQueueRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UpdateMeshQueueRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueueRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateMeshQueueRequest setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public UpdateMeshQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMeshQueueRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public UpdateMeshQueueRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
