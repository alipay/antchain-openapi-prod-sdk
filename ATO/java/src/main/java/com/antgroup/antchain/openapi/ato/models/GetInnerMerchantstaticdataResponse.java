// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerMerchantstaticdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户入驻静态数据
    @NameInMap("static_data_list")
    public java.util.List<StaticData> staticDataList;

    public static GetInnerMerchantstaticdataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerMerchantstaticdataResponse self = new GetInnerMerchantstaticdataResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerMerchantstaticdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetInnerMerchantstaticdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetInnerMerchantstaticdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetInnerMerchantstaticdataResponse setStaticDataList(java.util.List<StaticData> staticDataList) {
        this.staticDataList = staticDataList;
        return this;
    }
    public java.util.List<StaticData> getStaticDataList() {
        return this.staticDataList;
    }

}
