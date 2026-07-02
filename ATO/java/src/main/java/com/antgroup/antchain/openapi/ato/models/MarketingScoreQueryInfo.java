// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MarketingScoreQueryInfo extends TeaModel {
    // 手机号码
    /**
     * <strong>example:</strong>
     * <p>16677778888</p>
     */
    @NameInMap("phone_num")
    public String phoneNum;

    public static MarketingScoreQueryInfo build(java.util.Map<String, ?> map) throws Exception {
        MarketingScoreQueryInfo self = new MarketingScoreQueryInfo();
        return TeaModel.build(map, self);
    }

    public MarketingScoreQueryInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
