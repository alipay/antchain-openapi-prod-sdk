// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class NetValueInfo extends TeaModel {
    // 净值
    /**
     * <strong>example:</strong>
     * <p>3.14</p>
     */
    @NameInMap("net_value")
    @Validation(required = true)
    public String netValue;

    // 币种（目前支持USD、HKD）
    /**
     * <strong>example:</strong>
     * <p>HKD</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 更新时间戳
    /**
     * <strong>example:</strong>
     * <p>1726292715000</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    public static NetValueInfo build(java.util.Map<String, ?> map) throws Exception {
        NetValueInfo self = new NetValueInfo();
        return TeaModel.build(map, self);
    }

    public NetValueInfo setNetValue(String netValue) {
        this.netValue = netValue;
        return this;
    }
    public String getNetValue() {
        return this.netValue;
    }

    public NetValueInfo setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public NetValueInfo setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
