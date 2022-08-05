// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateResourcePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    // 上传文件名，实际服务端文件名称会使用随机字符串，这里需上传指定后缀的文件
    @NameInMap("file_name")
    @Validation(required = true, minLength = 1)
    public String fileName;

    public static CreateResourcePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePolicyRequest self = new CreateResourcePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourcePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourcePolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateResourcePolicyRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateResourcePolicyRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
