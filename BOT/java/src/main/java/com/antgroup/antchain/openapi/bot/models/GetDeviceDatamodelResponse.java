// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDeviceDatamodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据模型
    @NameInMap("data_model")
    public DataModel dataModel;

    public static GetDeviceDatamodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceDatamodelResponse self = new GetDeviceDatamodelResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceDatamodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDeviceDatamodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDeviceDatamodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDeviceDatamodelResponse setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
        return this;
    }
    public DataModel getDataModel() {
        return this.dataModel;
    }

}
