// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class GrantOrderDetail extends TeaModel {
    // 券编码
    /**
     * <strong>example:</strong>
     * <p>1798234932684395</p>
     */
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 发放扩展信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;supplierSettlePrice&quot;: 10.00,&quot;supplierChannelNo&quot;: &quot;alipay&quot;,&quot;rightsName&quot;: &quot;28元抵扣券&quot;,&quot;outRightsCode&quot;: &quot;1767506545030770701&quot;}</p>
     */
    @NameInMap("ext_info")
    public String extInfo;

    public static GrantOrderDetail build(java.util.Map<String, ?> map) throws Exception {
        GrantOrderDetail self = new GrantOrderDetail();
        return TeaModel.build(map, self);
    }

    public GrantOrderDetail setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public GrantOrderDetail setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
