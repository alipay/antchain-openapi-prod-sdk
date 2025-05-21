// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class SaveAoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建者的工号
    @NameInMap("author")
    @Validation(required = true)
    public String author;

    // versionIds
    @NameInMap("version_ids")
    @Validation(required = true)
    public java.util.List<Long> versionIds;

    // assignedTo
    @NameInMap("assigned_to")
    @Validation(required = true)
    public String assignedTo;

    public static SaveAoneRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAoneRequest self = new SaveAoneRequest();
        return TeaModel.build(map, self);
    }

    public SaveAoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveAoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveAoneRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public SaveAoneRequest setVersionIds(java.util.List<Long> versionIds) {
        this.versionIds = versionIds;
        return this;
    }
    public java.util.List<Long> getVersionIds() {
        return this.versionIds;
    }

    public SaveAoneRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

}
