// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateWithholdAgreementRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信总金额，单位元
        [NameInMap("credit_amount")]
        [Validation(Required=true)]
        public string CreditAmount { get; set; }

        // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

        // 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 对服务产品的描述
        [NameInMap("merchant_service_description")]
        [Validation(Required=false)]
        public string MerchantServiceDescription { get; set; }

        // 商户的服务名称，滴滴出行免密支付
        [NameInMap("merchant_service_name")]
        [Validation(Required=true)]
        public string MerchantServiceName { get; set; }

        // 姓名和身份证号拼接sha256的hash
        [NameInMap("name_cert_hash")]
        [Validation(Required=true)]
        public string NameCertHash { get; set; }

        // 还款计划的链接
        [NameInMap("repayment_url")]
        [Validation(Required=true)]
        public string RepaymentUrl { get; set; }

        // 签约成功后回调的地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 第三方用户id
        [NameInMap("third_party_id")]
        [Validation(Required=true)]
        public string ThirdPartyId { get; set; }

    }

}
