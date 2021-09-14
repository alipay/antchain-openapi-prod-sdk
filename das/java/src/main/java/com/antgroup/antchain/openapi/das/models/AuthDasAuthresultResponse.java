// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthDasAuthresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权实例biz_uuid
    @NameInMap("auth_instance_biz_uuid")
    public String authInstanceBizUuid;

    // 授权详情biz_uuid
    @NameInMap("auth_result_biz_uuid")
    public String authResultBizUuid;

    // VC 完整信息
    @NameInMap("vc")
    public String vc;

    public static AuthDasAuthresultResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthDasAuthresultResponse self = new AuthDasAuthresultResponse();
        return TeaModel.build(map, self);
    }

    public AuthDasAuthresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthDasAuthresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthDasAuthresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthDasAuthresultResponse setAuthInstanceBizUuid(String authInstanceBizUuid) {
        this.authInstanceBizUuid = authInstanceBizUuid;
        return this;
    }
    public String getAuthInstanceBizUuid() {
        return this.authInstanceBizUuid;
    }

    public AuthDasAuthresultResponse setAuthResultBizUuid(String authResultBizUuid) {
        this.authResultBizUuid = authResultBizUuid;
        return this;
    }
    public String getAuthResultBizUuid() {
        return this.authResultBizUuid;
    }

    public AuthDasAuthresultResponse setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

}
