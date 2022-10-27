// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 账号
    public class AccountVO : TeaModel {
        // 账号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 户名
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 开户网点
        [NameInMap("offical_name")]
        [Validation(Required=true)]
        public string OfficalName { get; set; }

        // 联行号
        [NameInMap("offical_number")]
        [Validation(Required=true)]
        public string OfficalNumber { get; set; }

        // 账号状态
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 分类 BUYER付款账户； SELLER收款账户
        [NameInMap("category")]
        [Validation(Required=false)]
        public List<string> Category { get; set; }

        // 上次支付是否失败
        [NameInMap("last_pay_fail")]
        [Validation(Required=false)]
        public bool? LastPayFail { get; set; }

        // 支付方式 BALANCE余额账户；BILL票据账户
        [NameInMap("pay_method")]
        [Validation(Required=false)]
        public List<string> PayMethod { get; set; }

        // 账户类型 MAIN 对公账户；ECOLLECTION e收宝
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
