// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 结算银行卡信息
    public class SettleCardInfo : TeaModel {
        // 开户支行名
        [NameInMap("account_branch_name")]
        [Validation(Required=true)]
        public string AccountBranchName { get; set; }

        // 卡户名
        [NameInMap("account_holder_name")]
        [Validation(Required=true)]
        public string AccountHolderName { get; set; }

        // 开户行所在地-市
        [NameInMap("account_inst_city")]
        [Validation(Required=true)]
        public string AccountInstCity { get; set; }

        // 开户行简称缩写
        [NameInMap("account_inst_id")]
        [Validation(Required=true)]
        public string AccountInstId { get; set; }

        // 银行名称
        [NameInMap("account_inst_name")]
        [Validation(Required=true)]
        public string AccountInstName { get; set; }

        // 开户行所在地-省
        [NameInMap("account_inst_province")]
        [Validation(Required=true)]
        public string AccountInstProvince { get; set; }

        // 银行卡号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 卡类型
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 账号使用类型
        [NameInMap("usage_type")]
        [Validation(Required=true)]
        public string UsageType { get; set; }

    }

}
