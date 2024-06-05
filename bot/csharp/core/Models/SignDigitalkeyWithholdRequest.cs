// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SignDigitalkeyWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 个人签约产品码
        [NameInMap("personal_product_code")]
        [Validation(Required=true)]
        public string PersonalProductCode { get; set; }

        // 销售产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
        [NameInMap("return_url")]
        [Validation(Required=true)]
        public string ReturnUrl { get; set; }

        // 用户在商户网站的登录账号，用于在签约页面展示
        [NameInMap("external_logon_id")]
        [Validation(Required=true)]
        public string ExternalLogonId { get; set; }

        // 支付宝用户ID
        [NameInMap("alipay_user_id")]
        [Validation(Required=false)]
        public string AlipayUserId { get; set; }

        // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
        [NameInMap("sign_scene")]
        [Validation(Required=true)]
        public string SignScene { get; set; }

        // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

        // 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
        [NameInMap("sign_validity_period")]
        [Validation(Required=false)]
        public string SignValidityPeriod { get; set; }

        // 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
        [NameInMap("effect_time")]
        [Validation(Required=false)]
        public long? EffectTime { get; set; }

    }

}
