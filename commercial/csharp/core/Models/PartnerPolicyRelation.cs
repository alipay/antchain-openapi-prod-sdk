// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 签约信息
    public class PartnerPolicyRelation : TeaModel {
        // 合同id
        [NameInMap("agreement_id")]
        [Validation(Required=true)]
        public string AgreementId { get; set; }

        // 服务商id
        [NameInMap("sp_id")]
        [Validation(Required=true)]
        public string SpId { get; set; }

        // 合同生效时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 合同失效时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 合同取消时间
        [NameInMap("cancel_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CancelTime { get; set; }

        // 政策id
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

        // 政策名称
        [NameInMap("policy_name")]
        [Validation(Required=true)]
        public string PolicyName { get; set; }

        // 政策类型
        [NameInMap("policy_type")]
        [Validation(Required=true)]
        public string PolicyType { get; set; }

        // 政策link
        [NameInMap("policy_link")]
        [Validation(Required=false)]
        public string PolicyLink { get; set; }

        // 政策所属ou
        [NameInMap("policy_ou")]
        [Validation(Required=false)]
        public string PolicyOu { get; set; }

        // 结算类型
        [NameInMap("settle_type")]
        [Validation(Required=true)]
        public string SettleType { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

    }

}
