// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户凭证信息
    public class CustomerDetail : TeaModel {
        // 用户标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;186123456789&quot;</para>
        /// </summary>
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 渠道参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;{&quot;name&quot;:&quot;苹果&quot;,&quot;code&quot;:&quot;5643&quot;,&quot;num&quot;:&quot;5&quot;}&quot;</para>
        /// </summary>
        [NameInMap("channel_params")]
        [Validation(Required=true)]
        public string ChannelParams { get; set; }

        // 用户透传字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;[{&quot;name&quot;:&quot;zhangshan&quot;}]&quot;</para>
        /// </summary>
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
