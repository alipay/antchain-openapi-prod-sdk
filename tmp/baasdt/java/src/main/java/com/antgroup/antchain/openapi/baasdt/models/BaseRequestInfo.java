// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BaseRequestInfo extends TeaModel {
    // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 场景码(入驻时申请)(长度不超过50个字符)
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static BaseRequestInfo build(java.util.Map<String, ?> map) throws Exception {
        BaseRequestInfo self = new BaseRequestInfo();
        return TeaModel.build(map, self);
    }

    public BaseRequestInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BaseRequestInfo setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public BaseRequestInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
