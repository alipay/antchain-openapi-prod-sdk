// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveAuthCertInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书内容，json格式，可以根据证书模板增加自定义字段
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 需要编辑的证书实例id，如果是新增场景则传null
    @NameInMap("instance_id")
    public String instanceId;

    // 创建证书实例后的状态，新增和修改场景默认为3 
    // 3: 编辑中 
    // 2: 待审核
    // 
    // 只有3: 编辑中 状态可以对证书实例进行修改
    @NameInMap("status")
    public Long status;

    public static SaveAuthCertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAuthCertInstanceRequest self = new SaveAuthCertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SaveAuthCertInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveAuthCertInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveAuthCertInstanceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveAuthCertInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveAuthCertInstanceRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
