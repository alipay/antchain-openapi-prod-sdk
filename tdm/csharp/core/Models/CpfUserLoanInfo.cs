// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 用户贷款信息
    public class CpfUserLoanInfo : TeaModel {
        // 用户证件号码
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 证件类型
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 配偶证件号码
        [NameInMap("po_id")]
        [Validation(Required=true)]
        public string PoId { get; set; }

        // 配偶姓名
        [NameInMap("po_name")]
        [Validation(Required=true)]
        public string PoName { get; set; }

        // 贷款合同编号
        [NameInMap("loan_id")]
        [Validation(Required=true)]
        public string LoanId { get; set; }

        // 贷款余额
        [NameInMap("loan_balance")]
        [Validation(Required=true)]
        public string LoanBalance { get; set; }

        // 贷款合同状态
        [NameInMap("loan_status")]
        [Validation(Required=true)]
        public string LoanStatus { get; set; }

    }

}
