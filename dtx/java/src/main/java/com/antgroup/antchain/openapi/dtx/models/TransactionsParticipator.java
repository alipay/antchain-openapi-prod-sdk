// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionsParticipator extends TeaModel {
    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // method_name
    @NameInMap("method_name")
    @Validation(required = true)
    public String methodName;

    // method_type
    @NameInMap("method_type")
    @Validation(required = true)
    public String methodType;

    // rsDesc
    @NameInMap("rs_desc")
    @Validation(required = true)
    public String rsDesc;

    // rs_type
    @NameInMap("rs_type")
    @Validation(required = true)
    public String rsType;

    public static TransactionsParticipator build(java.util.Map<String, ?> map) throws Exception {
        TransactionsParticipator self = new TransactionsParticipator();
        return TeaModel.build(map, self);
    }

    public TransactionsParticipator setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TransactionsParticipator setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TransactionsParticipator setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public TransactionsParticipator setMethodType(String methodType) {
        this.methodType = methodType;
        return this;
    }
    public String getMethodType() {
        return this.methodType;
    }

    public TransactionsParticipator setRsDesc(String rsDesc) {
        this.rsDesc = rsDesc;
        return this;
    }
    public String getRsDesc() {
        return this.rsDesc;
    }

    public TransactionsParticipator setRsType(String rsType) {
        this.rsType = rsType;
        return this;
    }
    public String getRsType() {
        return this.rsType;
    }

}
