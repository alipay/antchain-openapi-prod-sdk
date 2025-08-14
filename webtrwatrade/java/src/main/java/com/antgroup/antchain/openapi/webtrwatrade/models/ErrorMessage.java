// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ErrorMessage extends TeaModel {
    // 错误码
    /**
     * <strong>example:</strong>
     * <p>W3S-000-5-O001</p>
     */
    @NameInMap("displayed_code")
    public String displayedCode;

    // 错误描述
    /**
     * <strong>example:</strong>
     * <p>param error [id is null]</p>
     */
    @NameInMap("displayed_message")
    public String displayedMessage;

    public static ErrorMessage build(java.util.Map<String, ?> map) throws Exception {
        ErrorMessage self = new ErrorMessage();
        return TeaModel.build(map, self);
    }

    public ErrorMessage setDisplayedCode(String displayedCode) {
        this.displayedCode = displayedCode;
        return this;
    }
    public String getDisplayedCode() {
        return this.displayedCode;
    }

    public ErrorMessage setDisplayedMessage(String displayedMessage) {
        this.displayedMessage = displayedMessage;
        return this;
    }
    public String getDisplayedMessage() {
        return this.displayedMessage;
    }

}
