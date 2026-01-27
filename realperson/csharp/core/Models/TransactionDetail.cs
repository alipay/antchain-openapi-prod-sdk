// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 银行卡代扣二级租户收支明细
    public class TransactionDetail : TeaModel {
        // 交易类型：RECHARGE 入金，TRANSFER 划拨 ，WITHDRAW 出金
        [NameInMap("trans_type")]
        [Validation(Required=false)]
        public string TransType { get; set; }

        // 余额方向：CR-贷款（收入）/ DR-借款（支出）
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

        // 币种 CNY人民币
        [NameInMap("ccy")]
        [Validation(Required=false)]
        public string Ccy { get; set; }

        // 交易金额，单位：元，整数部分最长10位数，保留两位小数
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 交易后余额，单位：元，整数部分最长10位数，保留两位小数
        [NameInMap("after_amount")]
        [Validation(Required=false)]
        public string AfterAmount { get; set; }

        // 创建时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("creat_time")]
        [Validation(Required=false)]
        public string CreatTime { get; set; }

        // SHARE-分账
        // OFFSET_SHARE-差额分账
        // REFUND-退款
        // TRANSFER-转账
        // WITHDRAW-提现
        // CLEAR-资金清算
        // OTHER-其他
        // WITHDRAW_CANCEL-提现退回
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

    }

}
