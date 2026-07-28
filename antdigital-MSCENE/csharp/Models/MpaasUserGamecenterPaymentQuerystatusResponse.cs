// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MSCENE.Models
{
    // 查询订单响应参数
    public class MpaasUserGamecenterPaymentQuerystatusResponse : TeaModel {
        // 订单状态。1-订单已创建。2-订单交易支付成功。3-订单交易支付失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 扩展参数。biz_order_id-平台侧订单号，payment-金额（单位：分），open_uid-开放平台用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;payment&quot;:1200,&quot;open_uid&quot;:&quot;ez1Vz2gl/izliBRJxcPYTd2m8G3NE=&quot;,&quot;biz_order_id&quot;:&quot;5124555xxx&quot;}&quot;,&quot;orderStatus&quot;:&quot;2&quot;}</para>
        /// </summary>
        [NameInMap("cp_extra")]
        [Validation(Required=false)]
        public string CpExtra { get; set; }

    }

}
