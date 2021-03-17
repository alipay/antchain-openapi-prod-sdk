// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 案件进度查询返回结果
    public class MediationCaseDetailInfo : TeaModel {
        // 案件编码
        [NameInMap("case_number")]
        [Validation(Required=true)]
        public string CaseNumber { get; set; }

        // 案号
        [NameInMap("case_code")]
        [Validation(Required=true)]
        public string CaseCode { get; set; }

        // 案由
        [NameInMap("cause_action_name")]
        [Validation(Required=true)]
        public string CauseActionName { get; set; }

        // 案件状态
        [NameInMap("case_tatus")]
        [Validation(Required=true)]
        public string CaseTatus { get; set; }

        // 调解平台
        [NameInMap("mediation_platform")]
        [Validation(Required=true)]
        public string MediationPlatform { get; set; }

        // 调解机构
        [NameInMap("mediation_org")]
        [Validation(Required=true)]
        public string MediationOrg { get; set; }

        // 调解员
        [NameInMap("mediator")]
        [Validation(Required=true)]
        public string Mediator { get; set; }

        // 申请时间
        [NameInMap("apply_time")]
        [Validation(Required=true)]
        public long? ApplyTime { get; set; }

        // 调解结果
        [NameInMap("mediation_result")]
        [Validation(Required=true)]
        public string MediationResult { get; set; }

        // 申请人意向金额
        [NameInMap("accuser_intent_amount")]
        [Validation(Required=true)]
        public long? AccuserIntentAmount { get; set; }

        // 被申请人意向金额
        [NameInMap("accused_intent_amount")]
        [Validation(Required=true)]
        public long? AccusedIntentAmount { get; set; }

        // 和解金额
        [NameInMap("mediation_amount")]
        [Validation(Required=true)]
        public long? MediationAmount { get; set; }

        // 已确认事实
        [NameInMap("confirm_fact")]
        [Validation(Required=true)]
        public string ConfirmFact { get; set; }

        // 调解协议（已达成调解协议或未达成原因）
        [NameInMap("mediation_agreement")]
        [Validation(Required=true)]
        public string MediationAgreement { get; set; }

    }

}
