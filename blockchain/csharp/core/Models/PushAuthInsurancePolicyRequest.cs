// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PushAuthInsurancePolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 投保人证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 投保人证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 投保人的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 保单失效时间
        [NameInMap("effect_end_time")]
        [Validation(Required=true)]
        public string EffectEndTime { get; set; }

        // 保单生效时间
        [NameInMap("effect_start_time")]
        [Validation(Required=true)]
        public string EffectStartTime { get; set; }

        // 投保时间
        [NameInMap("insured_time")]
        [Validation(Required=true)]
        public string InsuredTime { get; set; }

        // 出单时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public string IssueTime { get; set; }

        // 投保人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 保单编号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保单类型
        [NameInMap("policy_type")]
        [Validation(Required=false)]
        public string PolicyType { get; set; }

        // 产品名称
        [NameInMap("prod_name")]
        [Validation(Required=true)]
        public string ProdName { get; set; }

        // 产品编号
        [NameInMap("prod_no")]
        [Validation(Required=true)]
        public string ProdNo { get; set; }

        // 行为回溯的整体编号
        [NameInMap("user_trace_code")]
        [Validation(Required=true)]
        public string UserTraceCode { get; set; }

    }

}
