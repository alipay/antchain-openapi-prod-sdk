// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ImportIpAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础入参
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 支付宝的登陆用户名(必须实名制)
        [NameInMap("alipay_login_name")]
        [Validation(Required=true)]
        public string AlipayLoginName { get; set; }

        // 商户类型(本期仅支持: 1:企业, 6:个人商户)	
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public long? MerchantType { get; set; }

        // 商户别名, 会展示在账单以及支付结果页中
        [NameInMap("merchant_alias_name")]
        [Validation(Required=true)]
        public string MerchantAliasName { get; set; }

        // 商户法人名称, merchant_type = 1时必填	
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 商户法人身份证号码, merchant_type = 1时必填	
        [NameInMap("legal_cert_no")]
        [Validation(Required=false)]
        public string LegalCertNo { get; set; }

        // 结算目标账户(银行卡/支付宝)
        [NameInMap("settle_target")]
        [Validation(Required=true)]
        public string SettleTarget { get; set; }

    }

}
