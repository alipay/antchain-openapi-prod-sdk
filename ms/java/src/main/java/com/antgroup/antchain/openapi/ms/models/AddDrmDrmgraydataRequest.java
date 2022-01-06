// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDrmDrmgraydataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资源ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 主机列表, 英文逗号隔开
    @NameInMap("hosts")
    @Validation(required = true)
    public String hosts;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 推送值
    @NameInMap("value")
    public String value;

    public static AddDrmDrmgraydataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDrmDrmgraydataRequest self = new AddDrmDrmgraydataRequest();
        return TeaModel.build(map, self);
    }

    public AddDrmDrmgraydataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDrmDrmgraydataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDrmDrmgraydataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddDrmDrmgraydataRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AddDrmDrmgraydataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDrmDrmgraydataRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
