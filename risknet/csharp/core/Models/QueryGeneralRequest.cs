// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKNET.Models
{
    public class QueryGeneralRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用服务名
        [NameInMap("service")]
        [Validation(Required=true)]
        public string Service { get; set; }

        // 服务模式
        [NameInMap("service_mode")]
        [Validation(Required=true)]
        public string ServiceMode { get; set; }

        // 用于标记是否获得用户授权  1:获得授权（默认）
        // 0:未获得授权
        [NameInMap("user_authorization")]
        [Validation(Required=true)]
        public string UserAuthorization { get; set; }

        // 经过RSA加密的用于AES加密的随机数密钥
        [NameInMap("encrypted_random_no")]
        [Validation(Required=false)]
        public string EncryptedRandomNo { get; set; }

        // 记录外部调用ISV
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 支付宝id	用于输入用户支付宝的 2088 账号
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 电话号码
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 用于输入用户产生交易时的地理位置信息
        [NameInMap("lbs")]
        [Validation(Required=false)]
        public string Lbs { get; set; }

        // 用户购买或使用服务时产生的具体金额
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public string SalesAmount { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 企业工商注册ID
        [NameInMap("guid")]
        [Validation(Required=false)]
        public string Guid { get; set; }

        // 统一信用代码
        [NameInMap("biz_license_no")]
        [Validation(Required=false)]
        public string BizLicenseNo { get; set; }

        // 压测标
        [NameInMap("sec_load_test")]
        [Validation(Required=false)]
        public string SecLoadTest { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=false)]
        public string SceneId { get; set; }

    }

}
