// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class BizInfo extends TeaModel {
    // 业务码
    @NameInMap("bizcode")
    public String bizcode;

    // 可使用时间戳来防止重复
    @NameInMap("bizno")
    public Long bizno;

    public static BizInfo build(java.util.Map<String, ?> map) throws Exception {
        BizInfo self = new BizInfo();
        return TeaModel.build(map, self);
    }

    public BizInfo setBizcode(String bizcode) {
        this.bizcode = bizcode;
        return this;
    }
    public String getBizcode() {
        return this.bizcode;
    }

    public BizInfo setBizno(Long bizno) {
        this.bizno = bizno;
        return this;
    }
    public Long getBizno() {
        return this.bizno;
    }

}
