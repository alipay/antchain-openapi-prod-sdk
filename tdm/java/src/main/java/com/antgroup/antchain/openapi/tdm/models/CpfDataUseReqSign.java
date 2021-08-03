// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfDataUseReqSign extends TeaModel {
    // 机构签名ID
    @NameInMap("m_sy_app_id")
    @Validation(required = true)
    public String mSyAppId;

    // 签名service, 需要颁发
    @NameInMap("m_sy_service")
    @Validation(required = true)
    public String mSyService;

    // 签名信息
    @NameInMap("m_sy_sign")
    @Validation(required = true)
    public String mSySign;

    public static CpfDataUseReqSign build(java.util.Map<String, ?> map) throws Exception {
        CpfDataUseReqSign self = new CpfDataUseReqSign();
        return TeaModel.build(map, self);
    }

    public CpfDataUseReqSign setMSyAppId(String mSyAppId) {
        this.mSyAppId = mSyAppId;
        return this;
    }
    public String getMSyAppId() {
        return this.mSyAppId;
    }

    public CpfDataUseReqSign setMSyService(String mSyService) {
        this.mSyService = mSyService;
        return this;
    }
    public String getMSyService() {
        return this.mSyService;
    }

    public CpfDataUseReqSign setMSySign(String mSySign) {
        this.mSySign = mSySign;
        return this;
    }
    public String getMSySign() {
        return this.mSySign;
    }

}
