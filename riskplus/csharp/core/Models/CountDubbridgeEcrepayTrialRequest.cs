// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CountDubbridgeEcrepayTrialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 申请流水
        [NameInMap("apply_no")]
        [Validation(Required=true)]
        public string ApplyNo { get; set; }

        // 借据号
        [NameInMap("loan_acct_no")]
        [Validation(Required=true)]
        public string LoanAcctNo { get; set; }

        // 借款人证件类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 借款人证件号码
        [NameInMap("id_no")]
        [Validation(Required=true)]
        public string IdNo { get; set; }

        // 本次还款总金额(含本金、利息、复利、罚息),不送默认全额还款
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public string RepayAmount { get; set; }

    }

}
