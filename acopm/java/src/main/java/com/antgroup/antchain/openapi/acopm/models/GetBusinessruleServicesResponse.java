// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class GetBusinessruleServicesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // api元数据（参照facade包中的cn.com.antcloud.opm.service.model.apimng.response.ExportApiResponse结构）
    @NameInMap("api_meta")
    public String apiMeta;

    public static GetBusinessruleServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessruleServicesResponse self = new GetBusinessruleServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessruleServicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBusinessruleServicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBusinessruleServicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBusinessruleServicesResponse setApiMeta(String apiMeta) {
        this.apiMeta = apiMeta;
        return this;
    }
    public String getApiMeta() {
        return this.apiMeta;
    }

}
