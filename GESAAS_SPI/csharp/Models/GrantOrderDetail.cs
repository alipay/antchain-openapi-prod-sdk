// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    // 发放订单明细
    public class GrantOrderDetail : TeaModel {
        // 券编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1798234932684395</para>
        /// </summary>
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

        // 发放扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;supplierSettlePrice&quot;: 10.00,&quot;supplierChannelNo&quot;: &quot;alipay&quot;,&quot;rightsName&quot;: &quot;28元抵扣券&quot;,&quot;outRightsCode&quot;: &quot;1767506545030770701&quot;}</para>
        /// </summary>
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
