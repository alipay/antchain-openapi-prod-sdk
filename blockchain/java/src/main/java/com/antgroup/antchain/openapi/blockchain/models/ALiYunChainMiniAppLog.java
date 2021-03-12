// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppLog extends TeaModel {
    // access_count
    @NameInMap("access_count")
    public Long accessCount;

    // access_alipay_account_count
    @NameInMap("access_alipay_account_count")
    public Long accessAlipayAccountCount;

    public static ALiYunChainMiniAppLog build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppLog self = new ALiYunChainMiniAppLog();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppLog setAccessCount(Long accessCount) {
        this.accessCount = accessCount;
        return this;
    }
    public Long getAccessCount() {
        return this.accessCount;
    }

    public ALiYunChainMiniAppLog setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
        this.accessAlipayAccountCount = accessAlipayAccountCount;
        return this;
    }
    public Long getAccessAlipayAccountCount() {
        return this.accessAlipayAccountCount;
    }

}
