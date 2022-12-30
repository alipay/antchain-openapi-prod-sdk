// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class FormParam extends TeaModel {
    //  
    @NameInMap("oss_access_key_id")
    @Validation(required = true)
    public String ossAccessKeyId;

    //  
    @NameInMap("callback")
    @Validation(required = true)
    public String callback;

    //  
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    //  
    @NameInMap("policy")
    @Validation(required = true)
    public String policy;

    //  
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    //  
    @NameInMap("success_action_status")
    @Validation(required = true)
    public String successActionStatus;

    //  
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static FormParam build(java.util.Map<String, ?> map) throws Exception {
        FormParam self = new FormParam();
        return TeaModel.build(map, self);
    }

    public FormParam setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public FormParam setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public FormParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public FormParam setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public FormParam setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public FormParam setSuccessActionStatus(String successActionStatus) {
        this.successActionStatus = successActionStatus;
        return this;
    }
    public String getSuccessActionStatus() {
        return this.successActionStatus;
    }

    public FormParam setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
