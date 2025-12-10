// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossChainSubUserAccountInfoBO extends TeaModel {
    // 跨链账号Id
    /**
     * <strong>example:</strong>
     * <p>34814bfc9b2a40d3889222013228dd02</p>
     */
    @NameInMap("cross_chain_user_account_id")
    public String crossChainUserAccountId;

    // 跨链账号地址
    /**
     * <strong>example:</strong>
     * <p>0x9f18be920360500f216495cd589895d3917cd9f2</p>
     */
    @NameInMap("target_user_address")
    public String targetUserAddress;

    // 目标链所在链
    /**
     * <strong>example:</strong>
     * <p>CONFLUX_TEST_NET</p>
     */
    @NameInMap("target_chain_name")
    public String targetChainName;

    public static CrossChainSubUserAccountInfoBO build(java.util.Map<String, ?> map) throws Exception {
        CrossChainSubUserAccountInfoBO self = new CrossChainSubUserAccountInfoBO();
        return TeaModel.build(map, self);
    }

    public CrossChainSubUserAccountInfoBO setCrossChainUserAccountId(String crossChainUserAccountId) {
        this.crossChainUserAccountId = crossChainUserAccountId;
        return this;
    }
    public String getCrossChainUserAccountId() {
        return this.crossChainUserAccountId;
    }

    public CrossChainSubUserAccountInfoBO setTargetUserAddress(String targetUserAddress) {
        this.targetUserAddress = targetUserAddress;
        return this;
    }
    public String getTargetUserAddress() {
        return this.targetUserAddress;
    }

    public CrossChainSubUserAccountInfoBO setTargetChainName(String targetChainName) {
        this.targetChainName = targetChainName;
        return this;
    }
    public String getTargetChainName() {
        return this.targetChainName;
    }

}
