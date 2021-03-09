// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class OperationTask extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // computer id
    @NameInMap("computer_id")
    public String computerId;

    // computer ip
    @NameInMap("computer_ip")
    public String computerIp;

    // command
    @NameInMap("command")
    public String command;

    // 状态取值：INIT，PROCESSING，SUCCEEDED，FAILED，TIMEOUT，NOT_FOUND
    @NameInMap("status")
    public String status;

    // errorCode
    @NameInMap("error_code")
    public String errorCode;

    // resultMsg
    @NameInMap("result_msg")
    public String resultMsg;

    public static OperationTask build(java.util.Map<String, ?> map) throws Exception {
        OperationTask self = new OperationTask();
        return TeaModel.build(map, self);
    }

    public OperationTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OperationTask setComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }
    public String getComputerId() {
        return this.computerId;
    }

    public OperationTask setComputerIp(String computerIp) {
        this.computerIp = computerIp;
        return this;
    }
    public String getComputerIp() {
        return this.computerIp;
    }

    public OperationTask setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public OperationTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperationTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OperationTask setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
