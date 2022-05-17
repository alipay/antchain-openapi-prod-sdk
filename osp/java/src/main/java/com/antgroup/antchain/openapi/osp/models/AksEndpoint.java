// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class AksEndpoint extends TeaModel {
    // access_key
    @NameInMap("access_key")
    @Validation(required = true)
    public String accessKey;

    // access_secret
    @NameInMap("access_secret")
    @Validation(required = true)
    public String accessSecret;

    // acvip的地址
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // 产品id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 租户名
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 工作区
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 表示mesh的配置信息, 用key/value的形式给出.
    @NameInMap("mesh")
    @Validation(required = true)
    public java.util.List<KeyValuePair> mesh;

    public static AksEndpoint build(java.util.Map<String, ?> map) throws Exception {
        AksEndpoint self = new AksEndpoint();
        return TeaModel.build(map, self);
    }

    public AksEndpoint setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public AksEndpoint setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public AksEndpoint setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AksEndpoint setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AksEndpoint setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public AksEndpoint setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AksEndpoint setMesh(java.util.List<KeyValuePair> mesh) {
        this.mesh = mesh;
        return this;
    }
    public java.util.List<KeyValuePair> getMesh() {
        return this.mesh;
    }

}
