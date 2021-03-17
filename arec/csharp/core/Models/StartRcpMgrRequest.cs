// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRcpMgrRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=true)]
        public string LoanAssistPlatform { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 外部业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 不动产颁发的他项权证号
        [NameInMap("other_right_cert_no")]
        [Validation(Required=true)]
        public string OtherRightCertNo { get; set; }

        // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
        [NameInMap("wipe_mortgage_reason")]
        [Validation(Required=true)]
        public string WipeMortgageReason { get; set; }

        // 解抵押的房产信息
        [NameInMap("house")]
        [Validation(Required=true)]
        public House House { get; set; }

        // 办理业务分支行
        [NameInMap("branch_bank")]
        [Validation(Required=true)]
        public Bank BranchBank { get; set; }

    }

}
