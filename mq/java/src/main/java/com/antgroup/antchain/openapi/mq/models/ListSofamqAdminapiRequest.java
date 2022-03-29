// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqAdminapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否显示创建接口
    @NameInMap("show_create")
    public Boolean showCreate;

    // 是否显示删除接口
    @NameInMap("show_delete")
    public Boolean showDelete;

    // 是否显示查询接口
    @NameInMap("show_retrieve")
    public Boolean showRetrieve;

    // 是否显示更新接口
    @NameInMap("show_update")
    public Boolean showUpdate;

    // 是否显示操作类接口
    @NameInMap("show_operation")
    public Boolean showOperation;

    public static ListSofamqAdminapiRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqAdminapiRequest self = new ListSofamqAdminapiRequest();
        return TeaModel.build(map, self);
    }

    public ListSofamqAdminapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSofamqAdminapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSofamqAdminapiRequest setShowCreate(Boolean showCreate) {
        this.showCreate = showCreate;
        return this;
    }
    public Boolean getShowCreate() {
        return this.showCreate;
    }

    public ListSofamqAdminapiRequest setShowDelete(Boolean showDelete) {
        this.showDelete = showDelete;
        return this;
    }
    public Boolean getShowDelete() {
        return this.showDelete;
    }

    public ListSofamqAdminapiRequest setShowRetrieve(Boolean showRetrieve) {
        this.showRetrieve = showRetrieve;
        return this;
    }
    public Boolean getShowRetrieve() {
        return this.showRetrieve;
    }

    public ListSofamqAdminapiRequest setShowUpdate(Boolean showUpdate) {
        this.showUpdate = showUpdate;
        return this;
    }
    public Boolean getShowUpdate() {
        return this.showUpdate;
    }

    public ListSofamqAdminapiRequest setShowOperation(Boolean showOperation) {
        this.showOperation = showOperation;
        return this;
    }
    public Boolean getShowOperation() {
        return this.showOperation;
    }

}
