// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class RegisterBclMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商家实体名称
        // 要与证件的名称相同，会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商家实体别名
        // 会在用户签署代扣协议时或者支付宝扣款账单中展示，请规范填写，最大长度：128  
        // 如果need_proxy_withholding为true则必填
        [NameInMap("alias_name")]
        [Validation(Required=false)]
        public string AliasName { get; set; }

        // 商家实体类型：
        // 1.企业：ENTERPRISE
        // 当前暂时只支持企业
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public string MerchantType { get; set; }

        // 商家营业执照号
        // 最大长度20
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 法人名称
        // 最大长度64
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 法人身份证号
        // 最大长度18
        [NameInMap("legal_cert_no")]
        [Validation(Required=true)]
        public string LegalCertNo { get; set; }

        // 商家联系人信息
        // 当前只支持一个联系人
        [NameInMap("contact_infos")]
        [Validation(Required=false)]
        public List<BclContactInfo> ContactInfos { get; set; }

        // 商家实体支付宝账号
        // 用作结算账号。本字段支付宝账号实名信息要求与商户名称cert_name同名，且是实名认证支付宝企业账户，最大长度：64
        // 如果need_proxy_withholding为true则必填
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 租赁经营类型
        // 1.数码/娱乐设备租赁：DIGITAL_LEASE
        // 2.共享充电宝及其他共享租赁：SHARE_LEASE
        // 3.汽车租赁：CAR_LEASE
        [NameInMap("management_type")]
        [Validation(Required=true)]
        public string ManagementType { get; set; }

        // 是否需要使用租赁代扣
        // true 为需要使用
        // false 为不需要使用
        [NameInMap("need_proxy_withholding")]
        [Validation(Required=true)]
        public bool? NeedProxyWithholding { get; set; }

        // 客户端token：
        // 幂等号，用来保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
