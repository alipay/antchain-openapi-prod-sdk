// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractMerchantorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请单id，通过twc.notary.contract.merchant.apply或者twc.notary.contract.merchantindirectzft.create接口返回的order_id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

    }

}
