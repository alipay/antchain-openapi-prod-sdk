// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationAvailableDatamodelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据模型列表
    @NameInMap("data_models")
    public java.util.List<DataModel> dataModels;

    public static ListDataauthorizationAvailableDatamodelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationAvailableDatamodelResponse self = new ListDataauthorizationAvailableDatamodelResponse();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationAvailableDatamodelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataauthorizationAvailableDatamodelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataauthorizationAvailableDatamodelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataauthorizationAvailableDatamodelResponse setDataModels(java.util.List<DataModel> dataModels) {
        this.dataModels = dataModels;
        return this;
    }
    public java.util.List<DataModel> getDataModels() {
        return this.dataModels;
    }

}
