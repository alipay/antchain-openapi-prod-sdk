// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class VerifyAntchainBbpMetaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 预留业务code
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业证件号码
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        [NameInMap("ep_cert_no_type")]
        [Validation(Required=true)]
        public string EpCertNoType { get; set; }

        // 法人姓名
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 法人证件号码
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        [NameInMap("legal_person_cert_no_type")]
        [Validation(Required=false)]
        public string LegalPersonCertNoType { get; set; }

        // 系统名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 系统租户ID
        [NameInMap("owner_uid")]
        [Validation(Required=false)]
        public string OwnerUid { get; set; }

        // 业务唯一ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务渠道，需提前申请产品码
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 认证类型：ENTERPRISE-企业, PERSON-个人
        [NameInMap("certify_enum")]
        [Validation(Required=true)]
        public string CertifyEnum { get; set; }

        // 客户支付宝ID
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

        // 个人姓名，用于个人认证
        [NameInMap("person_name")]
        [Validation(Required=false)]
        public string PersonName { get; set; }

        // 个人证件号码
        [NameInMap("person_cert_no")]
        [Validation(Required=false)]
        public string PersonCertNo { get; set; }

        // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        [NameInMap("person_cert_type")]
        [Validation(Required=false)]
        public string PersonCertType { get; set; }

        // 扩展信息
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public NameValuePair ExtensionInfo { get; set; }

    }

}
