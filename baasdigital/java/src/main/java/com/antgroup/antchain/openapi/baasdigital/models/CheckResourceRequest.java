// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CheckResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    // 创建资源上传规则url时生成的服务端文件名称
    @NameInMap("real_name")
    @Validation(required = true, minLength = 1)
    public String realName;

    public static CheckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRequest self = new CheckResourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckResourceRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CheckResourceRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

}
