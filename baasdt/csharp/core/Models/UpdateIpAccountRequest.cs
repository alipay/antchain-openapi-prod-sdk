// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateIpAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 链上账户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 商户账户名称
        [NameInMap("merchant_alias_name")]
        [Validation(Required=false)]
        public string MerchantAliasName { get; set; }

        // 商户类型(本期仅支持: 1:企业, 6:个人商户)
        [NameInMap("merchant_type")]
        [Validation(Required=false)]
        public long? MerchantType { get; set; }

        // 商户证件类型，201--统一社会信用证--营业执照号；
        [NameInMap("merchant_cert_type")]
        [Validation(Required=false)]
        public long? MerchantCertType { get; set; }

        // 本期支持统一社会信用证代码
        [NameInMap("merchant_cert_number")]
        [Validation(Required=false)]
        public string MerchantCertNumber { get; set; }

        // 联系人信息
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public IPContactInfo ContactInfo { get; set; }

        // 商户经营地址
        [NameInMap("contact_address")]
        [Validation(Required=false)]
        public IPAddressInfo ContactAddress { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 店铺名称
        [NameInMap("shop_name")]
        [Validation(Required=false)]
        public string ShopName { get; set; }

        // 更多联系信息，用于运营联系商家
        // 注：更新时如果为空，则联系人信息被覆盖为空，更新时为空相当于删除功能
        [NameInMap("additional_contact_info")]
        [Validation(Required=false)]
        public List<SimpleContactInfo> AdditionalContactInfo { get; set; }

    }

}
