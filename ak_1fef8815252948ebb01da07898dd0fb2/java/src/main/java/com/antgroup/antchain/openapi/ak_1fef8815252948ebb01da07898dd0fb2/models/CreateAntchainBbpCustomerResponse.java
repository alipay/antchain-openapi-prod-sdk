// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1fef8815252948ebb01da07898dd0fb2.models;

import com.aliyun.tea.*;

public class CreateAntchainBbpCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统一客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 统一账户ID
    @NameInMap("acc_id")
    public String accId;

    // 客户认证结果
    @NameInMap("auth_four_elements_response")
    public CustomerAuthResult authFourElementsResponse;

    public static CreateAntchainBbpCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainBbpCustomerResponse self = new CreateAntchainBbpCustomerResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntchainBbpCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntchainBbpCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntchainBbpCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntchainBbpCustomerResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateAntchainBbpCustomerResponse setAccId(String accId) {
        this.accId = accId;
        return this;
    }
    public String getAccId() {
        return this.accId;
    }

    public CreateAntchainBbpCustomerResponse setAuthFourElementsResponse(CustomerAuthResult authFourElementsResponse) {
        this.authFourElementsResponse = authFourElementsResponse;
        return this;
    }
    public CustomerAuthResult getAuthFourElementsResponse() {
        return this.authFourElementsResponse;
    }

}
