// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SyncAntchainAtoFrontTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 类型
        // 1. orderFullInfo ， 订单所有信息同步
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // json.toString
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

    }

}
