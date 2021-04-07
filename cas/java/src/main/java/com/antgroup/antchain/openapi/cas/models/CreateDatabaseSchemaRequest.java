// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateDatabaseSchemaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // char_set
    @NameInMap("char_set")
    @Validation(required = true)
    public String charSet;

    // description
    @NameInMap("description")
    public String description;

    // grant_map
    @NameInMap("grant_map")
    public java.util.List<MapStringToStringEntity> grantMap;

    // 数据库id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CreateDatabaseSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseSchemaRequest self = new CreateDatabaseSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDatabaseSchemaRequest setCharSet(String charSet) {
        this.charSet = charSet;
        return this;
    }
    public String getCharSet() {
        return this.charSet;
    }

    public CreateDatabaseSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatabaseSchemaRequest setGrantMap(java.util.List<MapStringToStringEntity> grantMap) {
        this.grantMap = grantMap;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getGrantMap() {
        return this.grantMap;
    }

    public CreateDatabaseSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDatabaseSchemaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
