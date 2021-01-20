// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsPlugintestRequest extends TeaModel {
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

    public static QueryRmsPlugintestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsPlugintestRequest self = new QueryRmsPlugintestRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsPlugintestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsPlugintestRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public QueryRmsPlugintestRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public QueryRmsPlugintestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryRmsPlugintestRequest setOutsideBizdomain(String outsideBizdomain) {
        this.outsideBizdomain = outsideBizdomain;
        return this;
    }
    public String getOutsideBizdomain() {
        return this.outsideBizdomain;
    }

    public QueryRmsPlugintestRequest setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public QueryRmsPlugintestRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
