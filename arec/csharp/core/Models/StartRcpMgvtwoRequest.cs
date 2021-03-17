// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRcpMgvtwoRequest : TeaModel {
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
        [Validation(Required=false)]
        public string LoanAssistPlatform { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 外部业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 借款人
        [NameInMap("borrower")]
        [Validation(Required=false)]
        public Person Borrower { get; set; }

        // 婚姻状况
        [NameInMap("marital_status")]
        [Validation(Required=false)]
        public string MaritalStatus { get; set; }

        // 借款人配偶
        [NameInMap("spouse")]
        [Validation(Required=false)]
        public Person Spouse { get; set; }

        // 房产信息
        [NameInMap("house")]
        [Validation(Required=false)]
        public House House { get; set; }

        // 待签合同列表
        [NameInMap("agreements")]
        [Validation(Required=false)]
        public List<Agreement> Agreements { get; set; }

        // 客户签署合同过期时间
        [NameInMap("ar_expire_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ArExpireTime { get; set; }

        // 抵押担保信息
        [NameInMap("mg_order_mort_guarantee")]
        [Validation(Required=false)]
        public MortGuaranteeInfo MgOrderMortGuarantee { get; set; }

        // 办理业务分支行
        [NameInMap("branch_bank")]
        [Validation(Required=false)]
        public Bank BranchBank { get; set; }

    }

}
