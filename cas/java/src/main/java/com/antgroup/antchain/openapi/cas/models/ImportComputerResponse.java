// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportComputerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 导入的 computer 序列号
    @NameInMap("computer_id_mapping")
    public String computerIdMapping;

    public static ImportComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportComputerResponse self = new ImportComputerResponse();
        return TeaModel.build(map, self);
    }

    public ImportComputerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportComputerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportComputerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportComputerResponse setComputerIdMapping(String computerIdMapping) {
        this.computerIdMapping = computerIdMapping;
        return this;
    }
    public String getComputerIdMapping() {
        return this.computerIdMapping;
    }

}
