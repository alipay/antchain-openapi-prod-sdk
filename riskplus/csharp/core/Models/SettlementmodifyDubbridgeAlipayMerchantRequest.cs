// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SettlementmodifyDubbridgeAlipayMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        // request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 门店唯一ID
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 004:数科入驻
        // 001:支付宝入驻
        // 没有默认：001
        [NameInMap("enter_type")]
        [Validation(Required=true)]
        public string EnterType { get; set; }

        // 社会统一信用代码
        // 配合traffic_platform
        [NameInMap("usci")]
        [Validation(Required=true)]
        public string Usci { get; set; }

        // 子品牌 配合usci
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 结算支付宝账户
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 对公-开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 对公-开户银行编码
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 对公-支行名称	STRING
        [NameInMap("branch_name")]
        [Validation(Required=false)]
        public string BranchName { get; set; }

        // 对公-联行号
        [NameInMap("cnaps_code")]
        [Validation(Required=false)]
        public string CnapsCode { get; set; }

        // 对公-银行账户名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 对公-银行账户号
        [NameInMap("account_number")]
        [Validation(Required=false)]
        public string AccountNumber { get; set; }

        // 对公-开户行所在省，浙江、北京
        [NameInMap("bank_province")]
        [Validation(Required=false)]
        public string BankProvince { get; set; }

        // 对公-开户行所在市，杭州、北京
        [NameInMap("bank_city")]
        [Validation(Required=false)]
        public string BankCity { get; set; }

        // 对私-银行卡号
        [NameInMap("payee_bank_card")]
        [Validation(Required=false)]
        public string PayeeBankCard { get; set; }

        // 对私-银行名称
        [NameInMap("payee_bank_name")]
        [Validation(Required=false)]
        public string PayeeBankName { get; set; }

        // 对私-银行编码
        [NameInMap("payee_bank_code")]
        [Validation(Required=false)]
        public string PayeeBankCode { get; set; }

        // 蚂蚁数科入驻账号
        [NameInMap("login_tenant")]
        [Validation(Required=false)]
        public string LoginTenant { get; set; }

        // 入驻时间，yyyy-MM-dd
        [NameInMap("login_date")]
        [Validation(Required=false)]
        public string LoginDate { get; set; }

    }

}
