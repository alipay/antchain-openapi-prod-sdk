// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveDataauthorizationDepositDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证内容
        [NameInMap("tx_data")]
        [Validation(Required=true)]
        public string TxData { get; set; }

        // 发送数据上链的DID
        [NameInMap("sender_id")]
        [Validation(Required=false)]
        public string SenderId { get; set; }

    }

}
