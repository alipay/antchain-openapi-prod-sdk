// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class SyncKmVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 树 id
    @NameInMap("tree_id")
    @Validation(required = true)
    public String treeId;

    // 树版本号
    @NameInMap("tree_version")
    @Validation(required = true)
    public String treeVersion;

    public static SyncKmVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncKmVersionRequest self = new SyncKmVersionRequest();
        return TeaModel.build(map, self);
    }

    public SyncKmVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncKmVersionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncKmVersionRequest setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }
    public String getTreeId() {
        return this.treeId;
    }

    public SyncKmVersionRequest setTreeVersion(String treeVersion) {
        this.treeVersion = treeVersion;
        return this;
    }
    public String getTreeVersion() {
        return this.treeVersion;
    }

}
