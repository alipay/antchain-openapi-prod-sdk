// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class QueryMerchantAgreementResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 协议产品code
        [NameInMap("personal_product_code")]
        [Validation(Required=false)]
        public string PersonalProductCode { get; set; }

        // 签约主体
        [NameInMap("merchant_user_id")]
        [Validation(Required=false)]
        public string MerchantUserId { get; set; }

        // 签约客户支付宝uid
        [NameInMap("customer_alipay_user_id")]
        [Validation(Required=false)]
        public string CustomerAlipayUserId { get; set; }

        // 商户签约协议号
        [NameInMap("merchant_agreement_no")]
        [Validation(Required=false)]
        public string MerchantAgreementNo { get; set; }

        // 签约协议号，仅签约成功后有
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 实际签约时间，仅签约成功后有
        [NameInMap("sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignTime { get; set; }

        // 实际生效时间，仅签约成功后有
        [NameInMap("valid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

        // 实际失效时间，仅签约成功后有
        [NameInMap("invalid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvalidTime { get; set; }

        // 协议状态
        // TEMP-暂存
        // NORMAL-正常
        // STOP-暂停
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
