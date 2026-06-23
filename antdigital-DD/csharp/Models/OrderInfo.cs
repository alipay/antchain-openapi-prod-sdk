// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 订单信息
    public class OrderInfo : TeaModel {
        // 订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORD001</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("detail")]
        [Validation(Required=false)]
        public OrderDetail Detail { get; set; }

    }

}
