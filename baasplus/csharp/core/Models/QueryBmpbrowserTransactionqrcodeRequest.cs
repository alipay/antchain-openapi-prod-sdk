// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBmpbrowserTransactionqrcodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 蚂蚁区块链的唯一链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 链上合约id
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 蚂蚁区块链的链上交易hash值
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

    }

}
