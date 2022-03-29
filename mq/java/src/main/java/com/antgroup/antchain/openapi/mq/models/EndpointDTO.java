// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class EndpointDTO extends TeaModel {
    // endpoint接口相关的文档
    @NameInMap("doc")
    public String doc;

    // https类型公网的endpoint接入点
    @NameInMap("https_internet")
    public String httpsInternet;

    // http类型内网的endpoint接口
    @NameInMap("http_internal")
    public String httpInternal;

    // http类型的公网接入点
    @NameInMap("http_internet")
    public String httpInternet;

    // tcp类型的endpoint接口
    @NameInMap("tcp")
    public String tcp;

    public static EndpointDTO build(java.util.Map<String, ?> map) throws Exception {
        EndpointDTO self = new EndpointDTO();
        return TeaModel.build(map, self);
    }

    public EndpointDTO setDoc(String doc) {
        this.doc = doc;
        return this;
    }
    public String getDoc() {
        return this.doc;
    }

    public EndpointDTO setHttpsInternet(String httpsInternet) {
        this.httpsInternet = httpsInternet;
        return this;
    }
    public String getHttpsInternet() {
        return this.httpsInternet;
    }

    public EndpointDTO setHttpInternal(String httpInternal) {
        this.httpInternal = httpInternal;
        return this;
    }
    public String getHttpInternal() {
        return this.httpInternal;
    }

    public EndpointDTO setHttpInternet(String httpInternet) {
        this.httpInternet = httpInternet;
        return this;
    }
    public String getHttpInternet() {
        return this.httpInternet;
    }

    public EndpointDTO setTcp(String tcp) {
        this.tcp = tcp;
        return this;
    }
    public String getTcp() {
        return this.tcp;
    }

}
