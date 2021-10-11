// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证代扣计划信息
    public class ContractNotaryDeductPlanInfo : TeaModel {
        // PAYERIDNUMBER
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // “总金额：”+总金额“+”“总期数：”+总期数，“+”每期金额时间（X期金额，时间）
        [NameInMap("deduct_plan_info")]
        [Validation(Required=true)]
        public string DeductPlanInfo { get; set; }

        // AGREEMEND_ID_NUMBER
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

        // 代扣计划发起时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

    }

}
