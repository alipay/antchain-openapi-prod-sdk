// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SaleDigestData extends TeaModel {
    // 商品hash值
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 物料置信度
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    public static SaleDigestData build(java.util.Map<String, ?> map) throws Exception {
        SaleDigestData self = new SaleDigestData();
        return TeaModel.build(map, self);
    }

    public SaleDigestData setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public SaleDigestData setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
