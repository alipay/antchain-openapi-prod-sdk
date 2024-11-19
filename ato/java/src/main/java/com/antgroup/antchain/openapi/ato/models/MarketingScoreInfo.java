// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MarketingScoreInfo extends TeaModel {
    // 手机号
    @NameInMap("phone_num")
    public String phoneNum;

    // 营销分
    @NameInMap("score")
    public String score;

    public static MarketingScoreInfo build(java.util.Map<String, ?> map) throws Exception {
        MarketingScoreInfo self = new MarketingScoreInfo();
        return TeaModel.build(map, self);
    }

    public MarketingScoreInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public MarketingScoreInfo setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
