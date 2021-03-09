// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // description
    @NameInMap("description")
    public String description;

    public static UpdateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseRequest self = new UpdateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
