// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class UpdateDubbridgeAccountCustomRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 渠道编码
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 新渠道id
        [NameInMap("new_open_id")]
        [Validation(Required=true)]
        public string NewOpenId { get; set; }

        // 原渠道id
        [NameInMap("source_open_id")]
        [Validation(Required=true)]
        public string SourceOpenId { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=true)]
        public string CustomerNo { get; set; }

    }

}
