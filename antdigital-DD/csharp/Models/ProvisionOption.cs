// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 履约开通参数
    public class ProvisionOption : TeaModel {
        // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-08-22T07:05:49.441Z</para>
        /// </summary>
        [NameInMap("order_start_time")]
        [Validation(Required=false)]
        public string OrderStartTime { get; set; }

    }

}
