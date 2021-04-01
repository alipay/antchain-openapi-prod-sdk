// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitIdentificationEnterpriseFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用于内部统计的参数，外部用户请忽略
        [NameInMap("biz_info")]
        [Validation(Required=false)]
        public BizInfo BizInfo { get; set; }

        // 回调通知地址
        [NameInMap("call_back_url")]
        [Validation(Required=false)]
        public string CallBackUrl { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业证件号
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        [NameInMap("ep_cert_type")]
        [Validation(Required=true)]
        public string EpCertType { get; set; }

        // 企业法人姓名
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 企业法人身份证号（目前只支持身份证号）
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 认证完成后回跳地址
        [NameInMap("merchant_url")]
        [Validation(Required=false)]
        public string MerchantUrl { get; set; }

    }

}
