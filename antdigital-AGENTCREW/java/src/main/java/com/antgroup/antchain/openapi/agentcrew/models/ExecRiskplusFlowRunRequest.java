// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agentcrew.models;

import com.aliyun.tea.*;

public class ExecRiskplusFlowRunRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要执行的任务唯一 code
    @NameInMap("flow_code")
    @Validation(required = true)
    public String flowCode;

    // 调用方生成的业务订单号，用于请求幂等。同一云租户内必须唯一；请求重试时须使用相同订单号。可使用调用方已有业务单号或 UUID。大小写敏感，建议统一使用大写。
    @NameInMap("client_order_no")
    @Validation(required = true)
    public String clientOrderNo;

    // Flow 执行入参，使用 JSON 字符串传递，顶层必须为 JSON Object。具体字段、类型和必填要求由已发布 Flow 的输入定义决定。无入参的 Flow 可不传或传 {}，未传时服务端按 {} 处理；如果 Flow 定义了必填字段但实际未提供，将返回参数校验错误。
    @NameInMap("input_json")
    public String inputJson;

    public static ExecRiskplusFlowRunRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRiskplusFlowRunRequest self = new ExecRiskplusFlowRunRequest();
        return TeaModel.build(map, self);
    }

    public ExecRiskplusFlowRunRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRiskplusFlowRunRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecRiskplusFlowRunRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public ExecRiskplusFlowRunRequest setClientOrderNo(String clientOrderNo) {
        this.clientOrderNo = clientOrderNo;
        return this;
    }
    public String getClientOrderNo() {
        return this.clientOrderNo;
    }

    public ExecRiskplusFlowRunRequest setInputJson(String inputJson) {
        this.inputJson = inputJson;
        return this;
    }
    public String getInputJson() {
        return this.inputJson;
    }

}
