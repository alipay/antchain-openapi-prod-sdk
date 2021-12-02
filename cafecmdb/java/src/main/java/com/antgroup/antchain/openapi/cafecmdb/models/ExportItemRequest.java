// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class ExportItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // model_id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // display_fields
    @NameInMap("display_fields")
    @Validation(required = true)
    public java.util.List<String> displayFields;

    // conditions
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    public static ExportItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportItemRequest self = new ExportItemRequest();
        return TeaModel.build(map, self);
    }

    public ExportItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportItemRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ExportItemRequest setDisplayFields(java.util.List<String> displayFields) {
        this.displayFields = displayFields;
        return this;
    }
    public java.util.List<String> getDisplayFields() {
        return this.displayFields;
    }

    public ExportItemRequest setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

}
