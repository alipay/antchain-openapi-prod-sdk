// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAccountCustomRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 渠道号
        [NameInMap("channel_code")]
        [Validation(Required=false)]
        public string ChannelCode { get; set; }

        // 客户编码
        [NameInMap("custom_no")]
        [Validation(Required=true)]
        public string CustomNo { get; set; }

    }

}
