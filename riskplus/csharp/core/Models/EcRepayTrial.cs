// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-还款试算结果
    public class EcRepayTrial : TeaModel {
        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        // 数字格式,精确到分。借据已结清,会返回还款总金额为0
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 利息数字格式,精确到分
        [NameInMap("interest_amount")]
        [Validation(Required=false)]
        public string InterestAmount { get; set; }

        // 本金 数字格式,精确到分
        [NameInMap("principal_amount")]
        [Validation(Required=false)]
        public string PrincipalAmount { get; set; }

        // 罚息 数字格式,精确到分
        [NameInMap("penalty_interest_amount")]
        [Validation(Required=false)]
        public string PenaltyInterestAmount { get; set; }

        // 复利 数字格式,精确到分
        [NameInMap("compound_interest_amount")]
        [Validation(Required=false)]
        public string CompoundInterestAmount { get; set; }

    }

}
