// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class Additional extends TeaModel {
    // 骑手标识；1-骑手
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deliveryman")
    public String deliveryman;

    // 关键词
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("key_word")
    public String keyWord;

    public static Additional build(java.util.Map<String, ?> map) throws Exception {
        Additional self = new Additional();
        return TeaModel.build(map, self);
    }

    public Additional setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman;
        return this;
    }
    public String getDeliveryman() {
        return this.deliveryman;
    }

    public Additional setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

}
