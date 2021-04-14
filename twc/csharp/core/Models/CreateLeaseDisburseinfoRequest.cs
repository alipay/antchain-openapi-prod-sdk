// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseDisburseinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 共管账户，网商清分
        [NameInMap("active_account")]
        [Validation(Required=true)]
        public string ActiveAccount { get; set; }

        // 对结果的简要描述信息
        [NameInMap("active_result_desc")]
        [Validation(Required=true)]
        public string ActiveResultDesc { get; set; }

        // 成功/失败 0表示失败，1表示成功
        [NameInMap("active_result_status")]
        [Validation(Required=true)]
        public long? ActiveResultStatus { get; set; }

        // 授信成功日期，格式为"2019-07-31 12:00:00"
        [NameInMap("active_return_date")]
        [Validation(Required=true)]
        public string ActiveReturnDate { get; set; }

        // 本金+利息，精确到毫厘，即123400表示12.34元
        [NameInMap("active_return_money")]
        [Validation(Required=true)]
        public long? ActiveReturnMoney { get; set; }

        // 支用期限，精确到毫秒
        [NameInMap("disburse_limit")]
        [Validation(Required=true)]
        public long? DisburseLimit { get; set; }

        // 支用金额，精确到毫厘，即123400表示12.34元
        [NameInMap("disburse_money")]
        [Validation(Required=true)]
        public long? DisburseMoney { get; set; }

        // 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
        [NameInMap("disburse_service")]
        [Validation(Required=true)]
        public long? DisburseService { get; set; }

        // 逾期天数，支用到期日开始计算，天数为单位
        [NameInMap("exceed_duration")]
        [Validation(Required=true)]
        public long? ExceedDuration { get; set; }

        // 1未还款，2已还款
        [NameInMap("exceed_pay_back_status")]
        [Validation(Required=true)]
        public long? ExceedPayBackStatus { get; set; }

        // 逾期利率，精确到小数点后四位 12.34% 表示为1234
        [NameInMap("exceed_rate")]
        [Validation(Required=true)]
        public long? ExceedRate { get; set; }

        // 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
        [NameInMap("exceed_return_money")]
        [Validation(Required=true)]
        public long? ExceedReturnMoney { get; set; }

        // 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
        [NameInMap("loan_rate")]
        [Validation(Required=true)]
        public long? LoanRate { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
        [NameInMap("pay_back_date")]
        [Validation(Required=true)]
        public string PayBackDate { get; set; }

        // 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
        [NameInMap("pay_back_money")]
        [Validation(Required=true)]
        public long? PayBackMoney { get; set; }

        // 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
        [NameInMap("return_interest")]
        [Validation(Required=true)]
        public long? ReturnInterest { get; set; }

    }

}
