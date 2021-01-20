// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateRmsPluginRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // body
    @NameInMap("body")
    public String body;

    // file_id
    @NameInMap("file_id")
    public Long fileId;

    // id
    @NameInMap("id")
    public Long id;

    // outside_bizdomain
    @NameInMap("outside_bizdomain")
    public String outsideBizdomain;

    // plugin_id
    @NameInMap("plugin_id")
    public Long pluginId;

    // table
    @NameInMap("table")
    public String table;

    public static UpdateRmsPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsPluginRequest self = new UpdateRmsPluginRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRmsPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRmsPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateRmsPluginRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateRmsPluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateRmsPluginRequest setOutsideBizdomain(String outsideBizdomain) {
        this.outsideBizdomain = outsideBizdomain;
        return this;
    }
    public String getOutsideBizdomain() {
        return this.outsideBizdomain;
    }

    public UpdateRmsPluginRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public UpdateRmsPluginRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
