// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryItemRelationsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标模型id
    @NameInMap("destination_model_id")
    @Validation(required = true)
    public String destinationModelId;

    // item_id
    @NameInMap("item_id")
    @Validation(required = true)
    public String itemId;

    // 1
    @NameInMap("page_size")
    public Long pageSize;

    // page_number
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // display_fields
    @NameInMap("display_fields")
    public java.util.List<String> displayFields;

    // 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
    @NameInMap("drill_up")
    public Boolean drillUp;

    public static QueryItemRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemRelationsRequest self = new QueryItemRelationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemRelationsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryItemRelationsRequest setDestinationModelId(String destinationModelId) {
        this.destinationModelId = destinationModelId;
        return this;
    }
    public String getDestinationModelId() {
        return this.destinationModelId;
    }

    public QueryItemRelationsRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryItemRelationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemRelationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemRelationsRequest setDisplayFields(java.util.List<String> displayFields) {
        this.displayFields = displayFields;
        return this;
    }
    public java.util.List<String> getDisplayFields() {
        return this.displayFields;
    }

    public QueryItemRelationsRequest setDrillUp(Boolean drillUp) {
        this.drillUp = drillUp;
        return this;
    }
    public Boolean getDrillUp() {
        return this.drillUp;
    }

}
