// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class GetTradeMerchantfulfillmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantId { get; set; }

        // 履约期数，不填返回为所有履约期的履约信息
        // - 如果有填写，返回当前期数的履约信息，列表长度为1
        [NameInMap("term_idx")]
        [Validation(Required=false)]
        public long? TermIdx { get; set; }

    }

}
