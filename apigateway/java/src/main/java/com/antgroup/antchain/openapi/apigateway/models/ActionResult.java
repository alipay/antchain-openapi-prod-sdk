// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ActionResult extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 报错信息
    @NameInMap("error_message")
    public String errorMessage;

    // id
    @NameInMap("id")
    public String id;

    // 是否挂载成功
    @NameInMap("success")
    public Boolean success;

    public static ActionResult build(java.util.Map<String, ?> map) throws Exception {
        ActionResult self = new ActionResult();
        return TeaModel.build(map, self);
    }

    public ActionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActionResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ActionResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ActionResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
