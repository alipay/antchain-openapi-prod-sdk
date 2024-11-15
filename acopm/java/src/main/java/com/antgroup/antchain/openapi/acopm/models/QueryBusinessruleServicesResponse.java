// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryBusinessruleServicesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // api服务列表
    @NameInMap("service_list")
    public java.util.List<ApiInfoModel> serviceList;

    public static QueryBusinessruleServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessruleServicesResponse self = new QueryBusinessruleServicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessruleServicesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessruleServicesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessruleServicesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessruleServicesResponse setServiceList(java.util.List<ApiInfoModel> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<ApiInfoModel> getServiceList() {
        return this.serviceList;
    }

}
