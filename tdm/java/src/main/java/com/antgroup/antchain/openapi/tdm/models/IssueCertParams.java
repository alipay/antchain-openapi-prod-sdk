// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class IssueCertParams extends TeaModel {
    // 贷款合同编号
    @NameInMap("dkhtbh")
    public String dkhtbh;

    public static IssueCertParams build(java.util.Map<String, ?> map) throws Exception {
        IssueCertParams self = new IssueCertParams();
        return TeaModel.build(map, self);
    }

    public IssueCertParams setDkhtbh(String dkhtbh) {
        this.dkhtbh = dkhtbh;
        return this;
    }
    public String getDkhtbh() {
        return this.dkhtbh;
    }

}
