// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SyncAntchainAtoFundMerchantpromiseRequest : TeaModel {
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

        // json字符串,填入「MerchantPromiseReq」的json字符串
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 资方公司社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false, MaxLength=64)]
        public string FundId { get; set; }

    }

}
