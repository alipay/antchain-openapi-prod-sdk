// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // display_fields
    @NameInMap("display_fields")
    public java.util.List<String> displayFields;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // page_number
    @NameInMap("page_number")
    public Long pageNumber;

    // sort_fields
    @NameInMap("sort_fields")
    public java.util.List<String> sortFields;

    // conditions
    @NameInMap("conditions")
    @Validation(required = true)
    public java.util.List<Condition> conditions;

    // filter
    @NameInMap("filter")
    public Filter filter;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static QueryItemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemRequest self = new QueryItemRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryItemRequest setDisplayFields(java.util.List<String> displayFields) {
        this.displayFields = displayFields;
        return this;
    }
    public java.util.List<String> getDisplayFields() {
        return this.displayFields;
    }

    public QueryItemRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryItemRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryItemRequest setSortFields(java.util.List<String> sortFields) {
        this.sortFields = sortFields;
        return this;
    }
    public java.util.List<String> getSortFields() {
        return this.sortFields;
    }

    public QueryItemRequest setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public QueryItemRequest setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }
    public Filter getFilter() {
        return this.filter;
    }

    public QueryItemRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
