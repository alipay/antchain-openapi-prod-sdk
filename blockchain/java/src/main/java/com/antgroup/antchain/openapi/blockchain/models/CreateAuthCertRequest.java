// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 证书的字段标题列表
    @NameInMap("titles")
    @Validation(required = true)
    public java.util.List<String> titles;

    // 证书的字段内容数组
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<String> data;

    public static CreateAuthCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCertRequest self = new CreateAuthCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAuthCertRequest setTitles(java.util.List<String> titles) {
        this.titles = titles;
        return this;
    }
    public java.util.List<String> getTitles() {
        return this.titles;
    }

    public CreateAuthCertRequest setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
