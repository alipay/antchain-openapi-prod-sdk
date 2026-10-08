// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CustodyAddressItem extends TeaModel {
    // 钱包ID
    /**
     * <strong>example:</strong>
     * <p>钱包ID</p>
     */
    @NameInMap("wallet_id")
    @Validation(required = true)
    public String walletId;

    // 钱包地址
    /**
     * <strong>example:</strong>
     * <p>钱包地址</p>
     */
    @NameInMap("wallet_address")
    @Validation(required = true)
    public String walletAddress;

    // 钱包名称
    /**
     * <strong>example:</strong>
     * <p>钱包名称</p>
     */
    @NameInMap("wallet_name")
    @Validation(required = true)
    public String walletName;

    public static CustodyAddressItem build(java.util.Map<String, ?> map) throws Exception {
        CustodyAddressItem self = new CustodyAddressItem();
        return TeaModel.build(map, self);
    }

    public CustodyAddressItem setWalletId(String walletId) {
        this.walletId = walletId;
        return this;
    }
    public String getWalletId() {
        return this.walletId;
    }

    public CustodyAddressItem setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
        return this;
    }
    public String getWalletAddress() {
        return this.walletAddress;
    }

    public CustodyAddressItem setWalletName(String walletName) {
        this.walletName = walletName;
        return this;
    }
    public String getWalletName() {
        return this.walletName;
    }

}
