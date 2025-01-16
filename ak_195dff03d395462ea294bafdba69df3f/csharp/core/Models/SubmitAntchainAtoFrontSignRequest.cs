// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SubmitAntchainAtoFrontSignRequest : TeaModel {
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

        // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
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

        // 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
        [NameInMap("third_signer")]
        [Validation(Required=false)]
        public string ThirdSigner { get; set; }

        // 用户在支付宝开放平台下应用的 open_id
        [NameInMap("user_open_id")]
        [Validation(Required=false, MaxLength=64)]
        public string UserOpenId { get; set; }

        // 商户支付宝应用 id
        [NameInMap("merchant_app_id")]
        [Validation(Required=false, MaxLength=32)]
        public string MerchantAppId { get; set; }

        // 用户类型，个人或企业，默认是个人
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // (企业作为消费者时)公司证件号，无需加密
        [NameInMap("user_org_id_number")]
        [Validation(Required=false)]
        public string UserOrgIdNumber { get; set; }

        // (企业作为消费者时)公司证件类型
        [NameInMap("user_org_id_type")]
        [Validation(Required=false)]
        public string UserOrgIdType { get; set; }

        // (企业作为消费者时)公司名称
        [NameInMap("user_org_name")]
        [Validation(Required=false)]
        public string UserOrgName { get; set; }

        // 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
        [NameInMap("need_face")]
        [Validation(Required=false)]
        public bool? NeedFace { get; set; }

    }

}
