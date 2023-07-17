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
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 渠道参数
        [NameInMap("channel_params")]
        [Validation(Required=true)]
        public string ChannelParams { get; set; }

        // 用户透传字段
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
