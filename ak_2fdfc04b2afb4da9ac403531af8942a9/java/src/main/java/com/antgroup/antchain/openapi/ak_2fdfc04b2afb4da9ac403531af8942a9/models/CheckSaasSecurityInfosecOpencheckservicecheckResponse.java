// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class CheckSaasSecurityInfosecOpencheckservicecheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 大安全内容检测接口返回参数
    @NameInMap("data")
    public ResultModel data;

    public static CheckSaasSecurityInfosecOpencheckservicecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasSecurityInfosecOpencheckservicecheckResponse self = new CheckSaasSecurityInfosecOpencheckservicecheckResponse();
        return TeaModel.build(map, self);
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckSaasSecurityInfosecOpencheckservicecheckResponse setData(ResultModel data) {
        this.data = data;
        return this;
    }
    public ResultModel getData() {
        return this.data;
    }

}
