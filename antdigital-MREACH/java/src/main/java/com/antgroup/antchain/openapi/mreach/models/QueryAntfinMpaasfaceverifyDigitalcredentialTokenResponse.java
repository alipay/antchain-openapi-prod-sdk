// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询状态：SUCCESS-已生成；PROCESSING-生成中
    @NameInMap("query_status")
    public String queryStatus;

    // mPaaS数字凭证查询单据号；query_status为SUCCESS时返回，用于后续查询加密VP
    @NameInMap("certify_no")
    public String certifyNo;

    // 扩展信息，建议使用JSON字符串，用于返回扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse self = new QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
        return this;
    }
    public String getQueryStatus() {
        return this.queryStatus;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setCertifyNo(String certifyNo) {
        this.certifyNo = certifyNo;
        return this;
    }
    public String getCertifyNo() {
        return this.certifyNo;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
