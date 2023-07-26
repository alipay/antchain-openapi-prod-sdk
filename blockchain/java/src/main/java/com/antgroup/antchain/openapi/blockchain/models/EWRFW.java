// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class EWRFW extends TeaModel {
    // FFF
    @NameInMap("sdf")
    @Validation(required = true)
    public java.util.List<DidDocServicesInfo> sdf;

    // www
    @NameInMap("www")
    @Validation(required = true)
    public String www;

    // ss
    @NameInMap("list_string")
    @Validation(required = true)
    public java.util.List<String> listString;

    // aaa
    @NameInMap("aaa")
    @Validation(required = true)
    public DidDocServicesInfo aaa;

    public static EWRFW build(java.util.Map<String, ?> map) throws Exception {
        EWRFW self = new EWRFW();
        return TeaModel.build(map, self);
    }

    public EWRFW setSdf(java.util.List<DidDocServicesInfo> sdf) {
        this.sdf = sdf;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getSdf() {
        return this.sdf;
    }

    public EWRFW setWww(String www) {
        this.www = www;
        return this;
    }
    public String getWww() {
        return this.www;
    }

    public EWRFW setListString(java.util.List<String> listString) {
        this.listString = listString;
        return this;
    }
    public java.util.List<String> getListString() {
        return this.listString;
    }

    public EWRFW setAaa(DidDocServicesInfo aaa) {
        this.aaa = aaa;
        return this;
    }
    public DidDocServicesInfo getAaa() {
        return this.aaa;
    }

}
