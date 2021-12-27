// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class RegisterRpgwUserEinvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业标识，固定值
        [NameInMap("company_code")]
        [Validation(Required=true)]
        public string CompanyCode { get; set; }

        // 调用方平台用户id
        [NameInMap("platform_user_identification")]
        [Validation(Required=true)]
        public string PlatformUserIdentification { get; set; }

        // 身份证号码
        [NameInMap("identification_number")]
        [Validation(Required=true)]
        public string IdentificationNumber { get; set; }

        // 用户手机号
        [NameInMap("mobile_phone")]
        [Validation(Required=true)]
        public string MobilePhone { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 身份证照片人像面照片url
        [NameInMap("identity_front_pic")]
        [Validation(Required=true)]
        public string IdentityFrontPic { get; set; }

        // 身份证照片国徽面url
        [NameInMap("identity_back_pic")]
        [Validation(Required=true)]
        public string IdentityBackPic { get; set; }

        // 身份证有效期开始时间，格式yyyy-MM-dd
        [NameInMap("idcard_validity_start")]
        [Validation(Required=true)]
        public string IdcardValidityStart { get; set; }

        // 身份证有效期结束时间，格式yyyy-MM-dd
        [NameInMap("idcard_validity_end")]
        [Validation(Required=true)]
        public string IdcardValidityEnd { get; set; }

        // 实名认证时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("identity_time")]
        [Validation(Required=true)]
        public string IdentityTime { get; set; }

        // 注册模式，固定值
        [NameInMap("register_mode")]
        [Validation(Required=true)]
        public string RegisterMode { get; set; }

        // 注册时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public string RegisterTime { get; set; }

        // 用户人脸照片url
        [NameInMap("face_pic")]
        [Validation(Required=false)]
        public string FacePic { get; set; }

        // 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

        // 微信支付个人账户（openid）
        [NameInMap("wxpay_account")]
        [Validation(Required=false)]
        public string WxpayAccount { get; set; }

        // 银行卡号，标准一类或二类卡格式，持卡人为本用户
        [NameInMap("bankcard_no")]
        [Validation(Required=false)]
        public string BankcardNo { get; set; }

        // 开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 开户行归属地省市
        [NameInMap("bankcard_city")]
        [Validation(Required=false)]
        public string BankcardCity { get; set; }

        // 用户所在省市
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 拓展信息
        [NameInMap("ext_json")]
        [Validation(Required=false)]
        public string ExtJson { get; set; }

    }

}
