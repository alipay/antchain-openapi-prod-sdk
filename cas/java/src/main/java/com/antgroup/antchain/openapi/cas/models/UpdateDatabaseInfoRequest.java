// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateDatabaseInfoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static UpdateDatabaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseInfoRequest self = new UpdateDatabaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDatabaseInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDatabaseInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatabaseInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
