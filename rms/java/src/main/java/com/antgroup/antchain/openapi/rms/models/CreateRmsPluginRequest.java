// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateRmsPluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // body
    @NameInMap("body")
    @Validation(required = true)
    public String body;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public Long fileId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // outside_bizdomain
    @NameInMap("outside_bizdomain")
    @Validation(required = true)
    public String outsideBizdomain;

    // plugin_id
    @NameInMap("plugin_id")
    @Validation(required = true)
    public Long pluginId;

    // table
    @NameInMap("table")
    @Validation(required = true)
    public String table;

    public static CreateRmsPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRmsPluginRequest self = new CreateRmsPluginRequest();
        return TeaModel.build(map, self);
    }

    public CreateRmsPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRmsPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateRmsPluginRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public CreateRmsPluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateRmsPluginRequest setOutsideBizdomain(String outsideBizdomain) {
        this.outsideBizdomain = outsideBizdomain;
        return this;
    }
    public String getOutsideBizdomain() {
        return this.outsideBizdomain;
    }

    public CreateRmsPluginRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public CreateRmsPluginRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
