// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueDescDTO extends TeaModel {
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

    // 队列名
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

    public static QueueDescDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueDescDTO self = new QueueDescDTO();
        return TeaModel.build(map, self);
    }

    public QueueDescDTO setAssoApp(String assoApp) {
        this.assoApp = assoApp;
        return this;
    }
    public String getAssoApp() {
        return this.assoApp;
    }

    public QueueDescDTO setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueueDescDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueueDescDTO setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueueDescDTO setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public QueueDescDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueDescDTO setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public QueueDescDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
