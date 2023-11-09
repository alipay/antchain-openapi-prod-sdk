// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class GetAntchainAtoFundOrderfulfillmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 租赁订单所属商家租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=49)]
        public string MerchantTenantId { get; set; }

        // 期数
        // 如果填入，获取term_idx下的履约记录
        // 如果不填入，获取order_id下的所有履约记录
        [NameInMap("term_idx")]
        [Validation(Required=false)]
        public long? TermIdx { get; set; }

    }

}
