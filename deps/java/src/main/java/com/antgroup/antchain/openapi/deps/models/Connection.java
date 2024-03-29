// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Connection extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // identity
    @NameInMap("identity")
    public String identity;

    // name
    @NameInMap("name")
    public String name;

    // plug
    @NameInMap("plug")
    public ConnectionStub plug;

    // socket
    @NameInMap("socket")
    public ConnectionStub socket;

    // accessKey
    @NameInMap("access_key")
    public String accessKey;

    // accessSecret
    @NameInMap("access_secret")
    public String accessSecret;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // executor
    @NameInMap("executor")
    public String executor;

    // status
    @NameInMap("status")
    public String status;

    public static Connection build(java.util.Map<String, ?> map) throws Exception {
        Connection self = new Connection();
        return TeaModel.build(map, self);
    }

    public Connection setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Connection setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Connection setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Connection setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Connection setPlug(ConnectionStub plug) {
        this.plug = plug;
        return this;
    }
    public ConnectionStub getPlug() {
        return this.plug;
    }

    public Connection setSocket(ConnectionStub socket) {
        this.socket = socket;
        return this;
    }
    public ConnectionStub getSocket() {
        return this.socket;
    }

    public Connection setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public Connection setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public Connection setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Connection setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public Connection setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public Connection setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
