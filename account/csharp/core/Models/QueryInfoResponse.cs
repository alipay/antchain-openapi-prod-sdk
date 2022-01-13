// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    public class QueryInfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 用户的银行打款卡号
        [NameInMap("card_id")]
        [Validation(Required=false)]
        public string CardId { get; set; }

        // 银行户名
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 开户银行
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 网点/支行 （客资特有）
        [NameInMap("branch_bank_name")]
        [Validation(Required=false)]
        public string BranchBankName { get; set; }

        // 联行号（客资特有）
        [NameInMap("bank_line_number")]
        [Validation(Required=false)]
        public string BankLineNumber { get; set; }

        // 开户地（客资特有）
        [NameInMap("bank_location")]
        [Validation(Required=false)]
        public string BankLocation { get; set; }

        // ALIPAY-客资账户 FINANCE-财资账户
        [NameInMap("account_type")]
        [Validation(Required=false)]
        public string AccountType { get; set; }

    }

}
