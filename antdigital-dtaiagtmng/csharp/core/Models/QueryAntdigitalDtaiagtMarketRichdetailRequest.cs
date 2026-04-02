// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGTMNG.Models
{
    public class QueryAntdigitalDtaiagtMarketRichdetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 市场条目 ID，必填
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 当前空间 ID（用于判断订阅状态），非必填
        [NameInMap("bot_id")]
        [Validation(Required=false)]
        public long? BotId { get; set; }

    }

}
