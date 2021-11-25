// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateAuthCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 通过上传领取人明细文件接口返回的csv文件名
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    public static BatchcreateAuthCertRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAuthCertRequest self = new BatchcreateAuthCertRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAuthCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAuthCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAuthCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchcreateAuthCertRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
