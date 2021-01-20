// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsPluginRequest extends TeaModel {
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

    public static QueryRmsPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsPluginRequest self = new QueryRmsPluginRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public QueryRmsPluginRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public QueryRmsPluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryRmsPluginRequest setOutsideBizdomain(String outsideBizdomain) {
        this.outsideBizdomain = outsideBizdomain;
        return this;
    }
    public String getOutsideBizdomain() {
        return this.outsideBizdomain;
    }

    public QueryRmsPluginRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public QueryRmsPluginRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
