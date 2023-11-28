// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_e94e2404d4b449ba90e0886673004f6b.models;

import com.aliyun.tea.*;

public class QueryAntcloudTapchainprodDataproducttemplateApiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // json结果，具体出参结构根据模板接口的出参的配置。
    @NameInMap("data")
    public String data;

    public static QueryAntcloudTapchainprodDataproducttemplateApiResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudTapchainprodDataproducttemplateApiResponse self = new QueryAntcloudTapchainprodDataproducttemplateApiResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudTapchainprodDataproducttemplateApiResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
