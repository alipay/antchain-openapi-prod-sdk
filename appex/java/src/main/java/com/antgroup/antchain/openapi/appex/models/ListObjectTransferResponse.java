// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListObjectTransferResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据归属权流转列表
    // 
    @NameInMap("data_transfer_list")
    public java.util.List<DataTransferObject> dataTransferList;

    public static ListObjectTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        ListObjectTransferResponse self = new ListObjectTransferResponse();
        return TeaModel.build(map, self);
    }

    public ListObjectTransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListObjectTransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListObjectTransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListObjectTransferResponse setDataTransferList(java.util.List<DataTransferObject> dataTransferList) {
        this.dataTransferList = dataTransferList;
        return this;
    }
    public java.util.List<DataTransferObject> getDataTransferList() {
        return this.dataTransferList;
    }

}
