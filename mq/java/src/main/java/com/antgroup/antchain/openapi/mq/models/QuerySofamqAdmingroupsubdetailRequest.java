// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqAdmingroupsubdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cell名
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 需查询的 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需查询的 Topic 所对应的实例 ID。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QuerySofamqAdmingroupsubdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqAdmingroupsubdetailRequest self = new QuerySofamqAdmingroupsubdetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqAdmingroupsubdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqAdmingroupsubdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqAdmingroupsubdetailRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqAdmingroupsubdetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QuerySofamqAdmingroupsubdetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
