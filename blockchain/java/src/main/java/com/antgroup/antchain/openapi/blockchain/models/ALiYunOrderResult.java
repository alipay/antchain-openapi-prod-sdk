// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunOrderResult extends TeaModel {
    // request_id
    @NameInMap("request_id")
    public String requestId;

    // data
    @NameInMap("data")
    public String data;

    // success
    @NameInMap("success")
    public Boolean success;

    // code
    @NameInMap("code")
    public String code;

    // message
    @NameInMap("message")
    public String message;

    // synchro
    @NameInMap("synchro")
    public Boolean synchro;

    public static ALiYunOrderResult build(java.util.Map<String, ?> map) throws Exception {
        ALiYunOrderResult self = new ALiYunOrderResult();
        return TeaModel.build(map, self);
    }

    public ALiYunOrderResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ALiYunOrderResult setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ALiYunOrderResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ALiYunOrderResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ALiYunOrderResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ALiYunOrderResult setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
