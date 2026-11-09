// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class BindAntchainAtoMerchantexpandSettlecardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 银行卡号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 银行账户名称
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 开户行所在省
        [NameInMap("bank_province")]
        [Validation(Required=true)]
        public string BankProvince { get; set; }

        // 开户行所在地-市
        [NameInMap("bank_city")]
        [Validation(Required=true)]
        public string BankCity { get; set; }

        // 账号使用类型
        // 对公: 01
        // 对私: 02
        [NameInMap("usage_type")]
        [Validation(Required=true)]
        public string UsageType { get; set; }

        // 卡类型
        // 借记卡: DC
        // 信用卡: CC
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 开户支行名
        [NameInMap("bank_branch_name")]
        [Validation(Required=true)]
        public string BankBranchName { get; set; }

        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 开户行简称缩写
        [NameInMap("bank_inst_id")]
        [Validation(Required=true)]
        public string BankInstId { get; set; }

        // 联行号
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

    }

}
