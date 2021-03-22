// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡数据
    public class BlockConsumeCardInfo : TeaModel {
        // 外部系统对该个人/机构用户的内部编号,用于唯一识别该用户
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 消费卡开通绑定的银行卡卡号
        [NameInMap("bank_card_id")]
        [Validation(Required=true)]
        public string BankCardId { get; set; }

        // 开户名称
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 账户余额(元)
        [NameInMap("debit_amount")]
        [Validation(Required=true)]
        public string DebitAmount { get; set; }

        // 信用余额(元)
        [NameInMap("credit_amount")]
        [Validation(Required=true)]
        public string CreditAmount { get; set; }

        // 资产的来源<来源账户ID_余额/信用额, 数量>, 例如: "accountId1_Debit": 11000表示这笔资产来源于accountId1,是accountId1这个账户通过Debit余额发行的资产。
        [NameInMap("asset_map")]
        [Validation(Required=true)]
        public string AssetMap { get; set; }

    }

}
