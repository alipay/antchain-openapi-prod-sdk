// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryCreditTransferBalanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货主分布式数字身份
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 需发行信用流转的运费，运费最多精确到小数点后2位
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 业务发起方分布式数字身
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

    }

}
