// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class QueryItagAntitagTaskDownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // iTAG租户ID
    @NameInMap("tntinstid")
    public String tntinstid;

    // runinstid
    @NameInMap("runinstid")
    public String runinstid;

    // 任务ID
    @NameInMap("taskid")
    public String taskid;

    public static QueryItagAntitagTaskDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItagAntitagTaskDownloadRequest self = new QueryItagAntitagTaskDownloadRequest();
        return TeaModel.build(map, self);
    }

    public QueryItagAntitagTaskDownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryItagAntitagTaskDownloadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryItagAntitagTaskDownloadRequest setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

    public QueryItagAntitagTaskDownloadRequest setRuninstid(String runinstid) {
        this.runinstid = runinstid;
        return this;
    }
    public String getRuninstid() {
        return this.runinstid;
    }

    public QueryItagAntitagTaskDownloadRequest setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

}
