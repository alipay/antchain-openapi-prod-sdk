// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryLogisticFinanceOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=false)]
        public string PlatformDid { get; set; }

        // 运单ID
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

    }

}
