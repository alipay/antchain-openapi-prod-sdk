// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // AI外呼每个用户维度的参数信息
    public class RobotCallCustomerParam : TeaModel {
        // 手机号/手机号md5
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 用户维度透传字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("customer_out_info")]
        [Validation(Required=false)]
        public string CustomerOutInfo { get; set; }

        // 外呼话术变量字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;key1&quot;:&quot;v1&quot;}</para>
        /// </summary>
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
