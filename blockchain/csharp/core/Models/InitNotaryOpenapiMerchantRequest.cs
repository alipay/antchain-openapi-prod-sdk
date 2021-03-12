// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitNotaryOpenapiMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 认证来源，PC_AUTH或APP_AUTH
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 认证成功页面回跳地址（只在移动端跳转，PC暂不支持）
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业统一社会信用代码
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 企业证件类型，目前只支持企业营业执照类型，值为NATIONAL_LEGAL_MERGE
        [NameInMap("ep_cert_type")]
        [Validation(Required=true)]
        public string EpCertType { get; set; }

        // 认证类型，目前只支持企业认证信息，值为EP_CERT_INFO
        [NameInMap("identity_type")]
        [Validation(Required=true)]
        public string IdentityType { get; set; }

        // 法人姓名
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 法人身份证号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 法人认证证件类型，目前只支持身份证，值为IDENTITY_CARD
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=true)]
        public string LegalPersonCertType { get; set; }

        // 认证成功回调地址
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

    }

}
