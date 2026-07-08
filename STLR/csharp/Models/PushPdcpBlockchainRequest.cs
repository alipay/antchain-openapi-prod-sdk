// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class PushPdcpBlockchainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 消息ID
        [NameInMap("tx_msg_id")]
        [Validation(Required=true)]
        public string TxMsgId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 数据类型，枚举定义
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 密文类型
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 待存证数据，根据数据类型序列化为json。并加密传输
        [NameInMap("deposit_data")]
        [Validation(Required=true)]
        public string DepositData { get; set; }

    }

}
