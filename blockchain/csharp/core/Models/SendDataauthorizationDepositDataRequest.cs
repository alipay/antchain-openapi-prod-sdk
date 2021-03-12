// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SendDataauthorizationDepositDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通知人列表
        [NameInMap("notification_ids")]
        [Validation(Required=false)]
        public List<string> NotificationIds { get; set; }

        // 数据发送人
        [NameInMap("sender_id")]
        [Validation(Required=false)]
        public string SenderId { get; set; }

        // 存证交易内容
        [NameInMap("tx_data")]
        [Validation(Required=true)]
        public string TxData { get; set; }

    }

}
