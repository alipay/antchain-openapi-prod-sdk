// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class QueryAntsaasStaffingcContractCaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署流程ID,传值默认查询签署流程下全部任务状态
    @NameInMap("sign_flow_id")
    @Validation(required = true)
    public String signFlowId;

    // 签署任务id
    @NameInMap("sign_task_id")
    @Validation(required = true)
    public String signTaskId;

    // 业务唯一流水号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryAntsaasStaffingcContractCaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsaasStaffingcContractCaRequest self = new QueryAntsaasStaffingcContractCaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsaasStaffingcContractCaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsaasStaffingcContractCaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsaasStaffingcContractCaRequest setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public QueryAntsaasStaffingcContractCaRequest setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public QueryAntsaasStaffingcContractCaRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
