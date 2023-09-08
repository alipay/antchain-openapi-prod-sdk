// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class HitResults extends TeaModel {
    // Reason for the screening decision. See more details in API-specific result codes. 
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // Result status. Possible values and their meanings are as below: 
    // 
    // "S": successful
    // 
    // "F": failed
    // 
    // "U": unknown issue
    @NameInMap("result_status")
    @Validation(required = true)
    public String resultStatus;

    // Result message.
    // 
    // See more details in API-specific result codes.
    @NameInMap("result_message")
    @Validation(required = true)
    public String resultMessage;

    public static HitResults build(java.util.Map<String, ?> map) throws Exception {
        HitResults self = new HitResults();
        return TeaModel.build(map, self);
    }

    public HitResults setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public HitResults setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public String getResultStatus() {
        return this.resultStatus;
    }

    public HitResults setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
