// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class QuerySaasSecurityInfosecOpencheckservicequeryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大安全内容检测接口返回结果
    @NameInMap("data")
    public ContentQueryResultModel data;

    public static QuerySaasSecurityInfosecOpencheckservicequeryResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasSecurityInfosecOpencheckservicequeryResponse self = new QuerySaasSecurityInfosecOpencheckservicequeryResponse();
        return TeaModel.build(map, self);
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryResponse setData(ContentQueryResultModel data) {
        this.data = data;
        return this;
    }
    public ContentQueryResultModel getData() {
        return this.data;
    }

}
