// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class QueryItagAntitagTaskProcessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TntInstId
    @NameInMap("tntinstid")
    public String tntinstid;

    // taskid
    @NameInMap("taskid")
    public String taskid;

    public static QueryItagAntitagTaskProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItagAntitagTaskProcessRequest self = new QueryItagAntitagTaskProcessRequest();
        return TeaModel.build(map, self);
    }

    public QueryItagAntitagTaskProcessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryItagAntitagTaskProcessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryItagAntitagTaskProcessRequest setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

    public QueryItagAntitagTaskProcessRequest setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

}
