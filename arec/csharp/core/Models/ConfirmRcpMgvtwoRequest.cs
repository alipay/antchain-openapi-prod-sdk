// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class ConfirmRcpMgvtwoRequest : TeaModel {
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

        // 房产链抵押单号
        [NameInMap("mg_order_no")]
        [Validation(Required=true)]
        public string MgOrderNo { get; set; }

        // 确认抵押结果，Y:继续抵押,N:终止抵押
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 终止抵押原因code
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 终止抵押原因desc
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 借款人
        [NameInMap("borrower")]
        [Validation(Required=true)]
        public Person Borrower { get; set; }

        // 婚姻状况,MARRIED=已婚
        [NameInMap("marital_status")]
        [Validation(Required=true)]
        public string MaritalStatus { get; set; }

        // 借款人配偶
        [NameInMap("spouse")]
        [Validation(Required=false)]
        public Person Spouse { get; set; }

        // 银行签署完成的合同列表
        [NameInMap("agreements")]
        [Validation(Required=true)]
        public List<Agreement> Agreements { get; set; }

        // 确认抵押需要的影印材料列表
        [NameInMap("archives")]
        [Validation(Required=true)]
        public List<Archive> Archives { get; set; }

        // 登记权利类型，MORTGAGE_RIGHTS=抵押权
        [NameInMap("reg_rights")]
        [Validation(Required=true)]
        public string RegRights { get; set; }

        // 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
        [NameInMap("reg_type")]
        [Validation(Required=true)]
        public string RegType { get; set; }

        // 登记设立原因,LOAN=借贷
        [NameInMap("reg_reason")]
        [Validation(Required=true)]
        public string RegReason { get; set; }

        // 登记设立原因备注
        [NameInMap("reg_reason_remark")]
        [Validation(Required=true)]
        public string RegReasonRemark { get; set; }

    }

}
