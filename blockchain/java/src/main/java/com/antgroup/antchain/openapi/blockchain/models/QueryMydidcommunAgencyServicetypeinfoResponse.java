// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunAgencyServicetypeinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 对应算法的入口函数名
    @NameInMap("method")
    public String method;

    // 服务对应的具体的Tapp或者算法名
    @NameInMap("name")
    public String name;

    // 表示服务的实际处理类型，目前是Data_Tapp
    // 
    @NameInMap("service_model")
    public String serviceModel;

    // 对应name的算法当前版本
    @NameInMap("version")
    public Long version;

    // serviceType所对应版本的publickey
    @NameInMap("public_key")
    public String publicKey;

    public static QueryMydidcommunAgencyServicetypeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunAgencyServicetypeinfoResponse self = new QueryMydidcommunAgencyServicetypeinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setServiceModel(String serviceModel) {
        this.serviceModel = serviceModel;
        return this;
    }
    public String getServiceModel() {
        return this.serviceModel;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public QueryMydidcommunAgencyServicetypeinfoResponse setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
