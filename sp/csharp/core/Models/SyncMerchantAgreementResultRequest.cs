// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class SyncMerchantAgreementResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 签约请求单据号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 代扣产品码
        // 代扣：GENERAL_WITHHOLDING_P
        [NameInMap("personal_product_code")]
        [Validation(Required=true)]
        public string PersonalProductCode { get; set; }

        // 代扣签约主体2088号(即代扣收款方)
        [NameInMap("merchant_user_id")]
        [Validation(Required=true)]
        public string MerchantUserId { get; set; }

        // 签约客户支付宝uid
        [NameInMap("customer_alipay_user_id")]
        [Validation(Required=true)]
        public string CustomerAlipayUserId { get; set; }

        // 实际生效时间
        [NameInMap("valid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ValidTime { get; set; }

        // 失效时间
        [NameInMap("invalid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvalidTime { get; set; }

        // 签约时间
        [NameInMap("sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignTime { get; set; }

        // 签约状态
        // TEMP-暂存
        // NORMAL-正常
        // STOP-暂停
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
