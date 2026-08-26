// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 组合订单支付配置项
    public class ComboOrderPayOptions : TeaModel {
        // 支付中的订单是否自动取消。false：不会自动取消；true：自动取消(兜底时间=支付链接超时时间+3m)
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("auto_cancel_paying_order")]
        [Validation(Required=false)]
        public bool? AutoCancelPayingOrder { get; set; }

    }

}
