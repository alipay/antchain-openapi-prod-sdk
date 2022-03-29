// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteRmsPluginRequest extends TeaModel {
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

    public static DeleteRmsPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsPluginRequest self = new DeleteRmsPluginRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRmsPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteRmsPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DeleteRmsPluginRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeleteRmsPluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteRmsPluginRequest setOutsideBizdomain(String outsideBizdomain) {
        this.outsideBizdomain = outsideBizdomain;
        return this;
    }
    public String getOutsideBizdomain() {
        return this.outsideBizdomain;
    }

    public DeleteRmsPluginRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public DeleteRmsPluginRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
