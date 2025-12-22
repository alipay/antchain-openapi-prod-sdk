// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseIotItemInfo extends TeaModel {
    // 证据的时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    // 证据的txHash
    /**
     * <strong>example:</strong>
     * <p>0xaaaaabbbbbcccc</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("raw_data")
    @Validation(required = true)
    public String rawData;

    public static LeaseIotItemInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseIotItemInfo self = new LeaseIotItemInfo();
        return TeaModel.build(map, self);
    }

    public LeaseIotItemInfo setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public LeaseIotItemInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public LeaseIotItemInfo setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

}
