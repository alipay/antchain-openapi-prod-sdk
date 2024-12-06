// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryInsureResultResponse : TeaModel {
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

        // 通知单号
        [NameInMap("notice_no")]
        [Validation(Required=false)]
        public string NoticeNo { get; set; }

        // 付款状态
        [NameInMap("payment_status")]
        [Validation(Required=false)]
        public string PaymentStatus { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 保额(人民币)
        [NameInMap("insurance_amount")]
        [Validation(Required=false)]
        public string InsuranceAmount { get; set; }

        // 保费(人民币)
        [NameInMap("insurance_premium")]
        [Validation(Required=false)]
        public string InsurancePremium { get; set; }

        // 保险起期
        [NameInMap("effect_date")]
        [Validation(Required=false)]
        public string EffectDate { get; set; }

        // 保险止期
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 电子保单URL
        [NameInMap("out_policy_url")]
        [Validation(Required=false)]
        public string OutPolicyUrl { get; set; }

        // 投保申请号-外部
        [NameInMap("insurance_application_no")]
        [Validation(Required=false)]
        public string InsuranceApplicationNo { get; set; }

        // 交易流水号
        [NameInMap("insurance_application_no_inner")]
        [Validation(Required=false)]
        public string InsuranceApplicationNoInner { get; set; }

    }

}
