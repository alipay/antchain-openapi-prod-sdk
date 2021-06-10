// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    // 银行卡信息
    public class CardInfo : TeaModel {
        // 卡户名
        [NameInMap("account_holder_name")]
        [Validation(Required=true)]
        public string AccountHolderName { get; set; }

        // 卡号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 银行名称
        [NameInMap("account_inst_name")]
        [Validation(Required=true)]
        public string AccountInstName { get; set; }

        // 银行缩写
        [NameInMap("account_inst_id")]
        [Validation(Required=true)]
        public string AccountInstId { get; set; }

        // 账号使用类型
        // 对公-01
        // 对私-02
        [NameInMap("usage_type")]
        [Validation(Required=true)]
        public string UsageType { get; set; }

        // 联行号
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 开户行所在省份
        [NameInMap("account_inst_province")]
        [Validation(Required=true)]
        public string AccountInstProvince { get; set; }

        // 开户行所在城市
        [NameInMap("account_inst_city")]
        [Validation(Required=true)]
        public string AccountInstCity { get; set; }

        // 开户行支行名称
        [NameInMap("account_branch_name")]
        [Validation(Required=true)]
        public string AccountBranchName { get; set; }

    }

}
