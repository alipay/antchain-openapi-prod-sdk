// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CancelInsurancepolicyUniversalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 投保订单号
        [NameInMap("apply_trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string ApplyTradeNo { get; set; }

        // 保司, 01-华泰, 03-亚太
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalChannelCode { get; set; }

        // 险种, 01-承运人平台责任险
        // 
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 保单号
        [NameInMap("pol_no")]
        [Validation(Required=true, MaxLength=50)]
        public string PolNo { get; set; }

        // 退保全局唯一流水号
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

    }

}
