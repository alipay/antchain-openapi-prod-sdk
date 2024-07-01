// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAccountUsecreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 渠道号
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 客户编码
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

    }

}
