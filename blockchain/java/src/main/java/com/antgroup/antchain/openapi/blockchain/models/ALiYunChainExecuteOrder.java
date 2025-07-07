// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainExecuteOrder extends TeaModel {
    // user_request_id
    /**
     * <strong>example:</strong>
     * <p>user_request_id</p>
     */
    @NameInMap("user_request_id")
    public String userRequestId;

    // data
    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("data")
    public String data;

    // success
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    public Boolean success;

    // code
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    public String code;

    // message
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    public String message;

    // synchro
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("synchro")
    public Boolean synchro;

    public static ALiYunChainExecuteOrder build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainExecuteOrder self = new ALiYunChainExecuteOrder();
        return TeaModel.build(map, self);
    }

    public ALiYunChainExecuteOrder setUserRequestId(String userRequestId) {
        this.userRequestId = userRequestId;
        return this;
    }
    public String getUserRequestId() {
        return this.userRequestId;
    }

    public ALiYunChainExecuteOrder setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ALiYunChainExecuteOrder setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ALiYunChainExecuteOrder setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ALiYunChainExecuteOrder setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ALiYunChainExecuteOrder setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
