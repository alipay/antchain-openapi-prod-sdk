// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDataauthorizationSyncDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 枚举值：
        // DATAENTITY：数据目录
        // PARTICIPANT：参与方
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 接收同步数据的DID
        [NameInMap("receiver_id")]
        [Validation(Required=true)]
        public string ReceiverId { get; set; }

    }

}
