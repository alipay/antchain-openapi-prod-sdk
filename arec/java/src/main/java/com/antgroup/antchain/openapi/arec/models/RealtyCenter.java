// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class RealtyCenter extends TeaModel {
    // 不动产中心地址
    @NameInMap("address")
    public String address;

    // 不动产中心名称 
    @NameInMap("name")
    public String name;

    // 外部不动产中心编号(不动产中心提供)
    @NameInMap("out_rtc_no")
    public String outRtcNo;

    // 蚂蚁链身份id
    @NameInMap("pdn_did")
    public String pdnDid;

    // 公钥
    @NameInMap("pub_key")
    public String pubKey;

    // 不动产中心编号
    @NameInMap("rtc_no")
    public String rtcNo;

    public static RealtyCenter build(java.util.Map<String, ?> map) throws Exception {
        RealtyCenter self = new RealtyCenter();
        return TeaModel.build(map, self);
    }

    public RealtyCenter setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public RealtyCenter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RealtyCenter setOutRtcNo(String outRtcNo) {
        this.outRtcNo = outRtcNo;
        return this;
    }
    public String getOutRtcNo() {
        return this.outRtcNo;
    }

    public RealtyCenter setPdnDid(String pdnDid) {
        this.pdnDid = pdnDid;
        return this;
    }
    public String getPdnDid() {
        return this.pdnDid;
    }

    public RealtyCenter setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

    public RealtyCenter setRtcNo(String rtcNo) {
        this.rtcNo = rtcNo;
        return this;
    }
    public String getRtcNo() {
        return this.rtcNo;
    }

}
