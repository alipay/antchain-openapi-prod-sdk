// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunDownloadPath extends TeaModel {
    // client_crt_url
    @NameInMap("client_crt_url")
    public String clientCrtUrl;

    // trust_ca_url
    @NameInMap("trust_ca_url")
    public String trustCaUrl;

    // ca_crt_url
    @NameInMap("ca_crt_url")
    public String caCrtUrl;

    // sdk_url
    @NameInMap("sdk_url")
    public String sdkUrl;

    public static ALiYunDownloadPath build(java.util.Map<String, ?> map) throws Exception {
        ALiYunDownloadPath self = new ALiYunDownloadPath();
        return TeaModel.build(map, self);
    }

    public ALiYunDownloadPath setClientCrtUrl(String clientCrtUrl) {
        this.clientCrtUrl = clientCrtUrl;
        return this;
    }
    public String getClientCrtUrl() {
        return this.clientCrtUrl;
    }

    public ALiYunDownloadPath setTrustCaUrl(String trustCaUrl) {
        this.trustCaUrl = trustCaUrl;
        return this;
    }
    public String getTrustCaUrl() {
        return this.trustCaUrl;
    }

    public ALiYunDownloadPath setCaCrtUrl(String caCrtUrl) {
        this.caCrtUrl = caCrtUrl;
        return this;
    }
    public String getCaCrtUrl() {
        return this.caCrtUrl;
    }

    public ALiYunDownloadPath setSdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }
    public String getSdkUrl() {
        return this.sdkUrl;
    }

}
