// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class GetEcarPlaformauthtokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 三方平台客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    @NameInMap("carbon_account_no")
    public String carbonAccountNo;

    // 授权三方平台客户信登的TOKEN
    @NameInMap("access_token")
    public String accessToken;

    public static GetEcarPlaformauthtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEcarPlaformauthtokenResponse self = new GetEcarPlaformauthtokenResponse();
        return TeaModel.build(map, self);
    }

    public GetEcarPlaformauthtokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetEcarPlaformauthtokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetEcarPlaformauthtokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetEcarPlaformauthtokenResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetEcarPlaformauthtokenResponse setCarbonAccountNo(String carbonAccountNo) {
        this.carbonAccountNo = carbonAccountNo;
        return this;
    }
    public String getCarbonAccountNo() {
        return this.carbonAccountNo;
    }

    public GetEcarPlaformauthtokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
