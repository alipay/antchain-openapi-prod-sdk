// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class GetDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 元数据编码
        [NameInMap("metadata_code")]
        [Validation(Required=true)]
        public string MetadataCode { get; set; }

        // 交易hash，与identify两者必须至少传入一个，两者都输入时，以tx_hash为准
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 数据标识，与交易hash（tx_hash）两者必须至少传入一个，两者都输入时，以tx_hash为准
        [NameInMap("identify")]
        [Validation(Required=false)]
        public string Identify { get; set; }

    }

}
