// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 创建订单失败的返回结构体
    public class InsertPurchaseOrderFailInfo : TeaModel {
        // 订单ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>safsafafafa</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单保存失败的原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>fasfasfasfa</para>
        /// </summary>
        [NameInMap("fail_reason")]
        [Validation(Required=true)]
        public string FailReason { get; set; }

    }

}
