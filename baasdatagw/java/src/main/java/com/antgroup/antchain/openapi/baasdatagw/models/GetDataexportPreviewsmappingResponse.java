// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class GetDataexportPreviewsmappingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 映射关系列表
    @NameInMap("data")
    public java.util.List<DataExportTableField> data;

    public static GetDataexportPreviewsmappingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataexportPreviewsmappingResponse self = new GetDataexportPreviewsmappingResponse();
        return TeaModel.build(map, self);
    }

    public GetDataexportPreviewsmappingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDataexportPreviewsmappingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDataexportPreviewsmappingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDataexportPreviewsmappingResponse setData(java.util.List<DataExportTableField> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DataExportTableField> getData() {
        return this.data;
    }

}
