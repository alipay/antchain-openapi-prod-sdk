// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTxtransactionChaindataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上链hash值，和request_id必须有一个有值
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上链请求消息id，和tx_hash必须有一个有值
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
