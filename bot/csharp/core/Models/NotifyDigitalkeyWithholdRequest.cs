// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class NotifyDigitalkeyWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 代扣协议号, 对应于签约时，支付宝返回的协议
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

    }

}
