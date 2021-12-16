// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 政策信息扩展
    public class PolicyDTO : TeaModel {
        // 政策信息
        [NameInMap("policy")]
        [Validation(Required=true)]
        public Policy Policy { get; set; }

        // 政策关联商品
        [NameInMap("policy_commodity")]
        [Validation(Required=true)]
        public PolicyCommodity PolicyCommodity { get; set; }

        // 合同id
        [NameInMap("agreement_id")]
        [Validation(Required=false)]
        public string AgreementId { get; set; }

        // 签约状态
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

    }

}
