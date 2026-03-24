// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ydindustry.models;

import com.aliyun.tea.*;

public class RetailScore extends TeaModel {
    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 评分
    /**
     * <strong>example:</strong>
     * <p>13.21</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 拓展数据
    /**
     * <strong>example:</strong>
     * <p>json格式</p>
     */
    @NameInMap("ext_param")
    @Validation(required = true)
    public String extParam;

    public static RetailScore build(java.util.Map<String, ?> map) throws Exception {
        RetailScore self = new RetailScore();
        return TeaModel.build(map, self);
    }

    public RetailScore setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RetailScore setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public RetailScore setExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }
    public String getExtParam() {
        return this.extParam;
    }

}
