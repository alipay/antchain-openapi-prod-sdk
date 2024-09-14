// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 司机签约信息列表
    public class SignInfo : TeaModel {
        // 司机证件号
        [NameInMap("employee_cert_no")]
        [Validation(Required=true)]
        public string EmployeeCertNo { get; set; }

        // 灵工卡号
        [NameInMap("employee_card_no")]
        [Validation(Required=true)]
        public string EmployeeCardNo { get; set; }

        // 借贷专户ID，用于后续资金相关操作
        [NameInMap("account_book_id")]
        [Validation(Required=true)]
        public string AccountBookId { get; set; }

        // 签约状态，枚举值
        // ● SIGNED：已签约【灵工卡状态正常，可入金出金】
        // ● TERMINATED：已解约【不可入金出金】
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 签约时间 "yyyy-MM-dd HH:mm:ss"
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 解约时间 "yyyy-MM-dd HH:mm:ss"
        [NameInMap("terminate_time")]
        [Validation(Required=false)]
        public string TerminateTime { get; set; }

        // 月租金额：单位为元
        [NameInMap("payment_amount")]
        [Validation(Required=true)]
        public string PaymentAmount { get; set; }

    }

}
