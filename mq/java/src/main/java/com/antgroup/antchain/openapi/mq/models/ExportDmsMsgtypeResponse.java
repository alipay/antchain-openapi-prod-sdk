// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExportDmsMsgtypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的导出结果具体数据
    @NameInMap("msg_type_list")
    public java.util.List<MsgTypeDTO> msgTypeList;

    public static ExportDmsMsgtypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsMsgtypeResponse self = new ExportDmsMsgtypeResponse();
        return TeaModel.build(map, self);
    }

    public ExportDmsMsgtypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExportDmsMsgtypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportDmsMsgtypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExportDmsMsgtypeResponse setMsgTypeList(java.util.List<MsgTypeDTO> msgTypeList) {
        this.msgTypeList = msgTypeList;
        return this;
    }
    public java.util.List<MsgTypeDTO> getMsgTypeList() {
        return this.msgTypeList;
    }

}
