// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitFrontSignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=64)]
        public string OrderId { get; set; }

        // CRED_PSN_CH_IDCARD： 大陆身份证 
        // CRED_PSN_CH_TWCARD：台湾来往大陆通行证 
        // CRED_PSN_CH_MACAO"：澳门来往大陆通行证 
        // CRED_PSN_CH_HONGKONG：香港来往大陆通行证 
        // CRED_PSN_PASSPORT：护照
        [NameInMap("user_id_type")]
        [Validation(Required=true, MaxLength=40)]
        public string UserIdType { get; set; }

        // 用户证件号，需要采用RSA加密传输
        [NameInMap("user_id_number")]
        [Validation(Required=true)]
        public string UserIdNumber { get; set; }

        // 姓名，需要采用RSA加密传输
        // 
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户手机号，可不传；传的话需要采用RSA加密传输
        // 
        [NameInMap("user_mobile")]
        [Validation(Required=false)]
        public string UserMobile { get; set; }

        // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        // 
        [NameInMap("user_email")]
        [Validation(Required=false)]
        public string UserEmail { get; set; }

        // 签署有效期，时间戳，例如：new Date().getTime()
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public string SignValidity { get; set; }

        // 1-短信；2-邮件
        [NameInMap("flow_notify_type")]
        [Validation(Required=false)]
        public string FlowNotifyType { get; set; }

        // 业务场景，电子合同签署协议的时候的标题
        // 
        [NameInMap("business_scene")]
        [Validation(Required=true, MaxLength=200)]
        public string BusinessScene { get; set; }

        // 签署完成跳转链接
        // 
        [NameInMap("signed_redirect_url")]
        [Validation(Required=false)]
        public string SignedRedirectUrl { get; set; }

        // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
        [NameInMap("template_list")]
        [Validation(Required=true)]
        public string TemplateList { get; set; }

        // 用户的支付宝uid
        [NameInMap("alipay_user_id")]
        [Validation(Required=false, MaxLength=24)]
        public string AlipayUserId { get; set; }

        // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        [NameInMap("merchant_tag")]
        [Validation(Required=false, MaxLength=32)]
        public string MerchantTag { get; set; }

        // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        [NameInMap("merchant_sign_order")]
        [Validation(Required=false)]
        public long? MerchantSignOrder { get; set; }

        // 商户需要盖的印章ID
        [NameInMap("merchant_seal_id")]
        [Validation(Required=false)]
        public string MerchantSealId { get; set; }

        // CRED_ORG_USCC：统一社会信用代码，
        // CRED_ORG_REGCODE：工商注册号，
        // 只支持这两个值
        [NameInMap("merchant_id_type")]
        [Validation(Required=true, MaxLength=32)]
        public string MerchantIdType { get; set; }

        // 商户证件号，需要采用RSA加密传输
        [NameInMap("merchant_id_number")]
        [Validation(Required=true)]
        public string MerchantIdNumber { get; set; }

        // 法人姓名，需要RSA加密传输
        // 
        [NameInMap("merchant_legal_name")]
        [Validation(Required=false)]
        public string MerchantLegalName { get; set; }

        // 法人证件号，需要采用RSA加密传输
        // 
        [NameInMap("merchant_legal_id_number")]
        [Validation(Required=false)]
        public string MerchantLegalIdNumber { get; set; }

        // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
        [NameInMap("third_signer")]
        [Validation(Required=false)]
        public string ThirdSigner { get; set; }

    }

}
