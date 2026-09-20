// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustCheckInfo extends TeaModel {
    // 签约结果,01 - 处理中，02 - 成功，03 失败（当超过链接有效期却还未收到前端给出的跳端成功结果后，会将此次跳端结果设置为失败）
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("sign_result")
    @Validation(required = true)
    public String signResult;

    public static CustCheckInfo build(java.util.Map<String, ?> map) throws Exception {
        CustCheckInfo self = new CustCheckInfo();
        return TeaModel.build(map, self);
    }

    public CustCheckInfo setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

}
