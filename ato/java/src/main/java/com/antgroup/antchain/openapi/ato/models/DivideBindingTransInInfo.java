// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DivideBindingTransInInfo extends TeaModel {
    // 分账方支付宝pid
    @NameInMap("alipay_pid")
    @Validation(required = true)
    public String alipayPid;

    public static DivideBindingTransInInfo build(java.util.Map<String, ?> map) throws Exception {
        DivideBindingTransInInfo self = new DivideBindingTransInInfo();
        return TeaModel.build(map, self);
    }

    public DivideBindingTransInInfo setAlipayPid(String alipayPid) {
        this.alipayPid = alipayPid;
        return this;
    }
    public String getAlipayPid() {
        return this.alipayPid;
    }

}
