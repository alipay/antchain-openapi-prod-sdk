// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryWithholdAgreementResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 总授信金额
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public string CreditAmount { get; set; }

        // 商家的支付宝uid
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 商户的服务名称
        [NameInMap("merchant_service_name")]
        [Validation(Required=false)]
        public string MerchantServiceName { get; set; }

        // 姓名身份证号拼接后的hash
        [NameInMap("name_cert_hash")]
        [Validation(Required=false)]
        public string NameCertHash { get; set; }

        // 还款计划的超链接
        [NameInMap("repayment_url")]
        [Validation(Required=false)]
        public string RepaymentUrl { get; set; }

        // 协议的状态，如果签署成功返回success,未签是空
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 第三方的用户id
        [NameInMap("third_party_id")]
        [Validation(Required=false)]
        public string ThirdPartyId { get; set; }

        // 商家请求的协议号
        [NameInMap("external_agreement_no")]
        [Validation(Required=false)]
        public string ExternalAgreementNo { get; set; }

    }

}
