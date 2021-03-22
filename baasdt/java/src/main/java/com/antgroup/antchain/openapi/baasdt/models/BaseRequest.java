// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BaseRequest extends TeaModel {
    // 用户的链上账户Id(长度不超过256个字符)
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 备注信息(不要超过500个字符)。
    // 部分接口要求memo必填，以接口返回信息为准。
    @NameInMap("memo")
    public String memo;

    // 场景码(入驻时申请)(长度不超过50个字符)
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static BaseRequest build(java.util.Map<String, ?> map) throws Exception {
        BaseRequest self = new BaseRequest();
        return TeaModel.build(map, self);
    }

    public BaseRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BaseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BaseRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public BaseRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public BaseRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
