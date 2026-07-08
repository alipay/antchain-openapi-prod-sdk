// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryActiveDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否查询成功
    @NameInMap("success")
    public Boolean success;

    // 填报维度
    @NameInMap("data_dimension")
    public String dataDimension;

    // 是否按照单元过程录入
    @NameInMap("input_by_process")
    public Boolean inputByProcess;

    // 过程模型列表
    @NameInMap("process_list")
    public java.util.List<ProcessDetail> processList;

    public static QueryActiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActiveDataResponse self = new QueryActiveDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryActiveDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryActiveDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryActiveDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryActiveDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryActiveDataResponse setDataDimension(String dataDimension) {
        this.dataDimension = dataDimension;
        return this;
    }
    public String getDataDimension() {
        return this.dataDimension;
    }

    public QueryActiveDataResponse setInputByProcess(Boolean inputByProcess) {
        this.inputByProcess = inputByProcess;
        return this;
    }
    public Boolean getInputByProcess() {
        return this.inputByProcess;
    }

    public QueryActiveDataResponse setProcessList(java.util.List<ProcessDetail> processList) {
        this.processList = processList;
        return this;
    }
    public java.util.List<ProcessDetail> getProcessList() {
        return this.processList;
    }

}
