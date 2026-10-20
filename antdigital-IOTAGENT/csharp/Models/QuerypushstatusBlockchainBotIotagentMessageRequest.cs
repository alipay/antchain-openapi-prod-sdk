// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class QuerypushstatusBlockchainBotIotagentMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // push接口返回的受理标识，与message_id至少填一个
        [NameInMap("receipt_id")]
        [Validation(Required=false)]
        public string ReceiptId { get; set; }

        // 消息ID，与receipt_id至少填一个
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

    }

}
