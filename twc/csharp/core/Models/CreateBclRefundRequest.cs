// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateBclRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 例如：PROD202312312321301
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // 代扣成功的期数, 1,5,7,12
        [NameInMap("term_no")]
        [Validation(Required=true)]
        public long? TermNo { get; set; }

        // 退款金额: 单位分, 最小值1, 最大值不能超过当前代扣的总金额, 如果多次退款,本次退款金额加已退款成功的金额不大于当前代扣总金额
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public long? RefundAmount { get; set; }

        // 幂等号，用来保证请求幂等性.
        // 注意：
        // ● clientToken只支持ASCII字符，且不能超过64个字符；
        [NameInMap("client_token")]
        [Validation(Required=true, MaxLength=64)]
        public string ClientToken { get; set; }

    }

}
