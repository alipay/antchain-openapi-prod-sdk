// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDrmDrmresourcetplinstancesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源信息列表
    @NameInMap("params")
    public String params;

    // tpl id
    @NameInMap("tpl_id")
    public Long tplId;

    public static AddDrmDrmresourcetplinstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDrmDrmresourcetplinstancesRequest self = new AddDrmDrmresourcetplinstancesRequest();
        return TeaModel.build(map, self);
    }

    public AddDrmDrmresourcetplinstancesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDrmDrmresourcetplinstancesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDrmDrmresourcetplinstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDrmDrmresourcetplinstancesRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public AddDrmDrmresourcetplinstancesRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
