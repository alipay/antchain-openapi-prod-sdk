// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class CreateCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务渠道，需提前申请产品码
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 客户类型：ENTERPRISE-企业, PERSON-个人
        // 
        [NameInMap("customer_type")]
        [Validation(Required=true)]
        public string CustomerType { get; set; }

        // 客户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 客户证件号码，企业/个人均可
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人姓名
        // 
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 法人证件号码
        // 
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        [NameInMap("legal_person_cert_no_type")]
        [Validation(Required=true)]
        public string LegalPersonCertNoType { get; set; }

        // 是否需要先认证再注册，默认不认证。
        [NameInMap("is_auth")]
        [Validation(Required=true)]
        public bool? IsAuth { get; set; }

        // 业务角色： 买方，卖方，机构，合作伙伴
        [NameInMap("business_role")]
        [Validation(Required=false)]
        public string BusinessRole { get; set; }

        // 客户支付宝ID，如有则填。
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

    }

}
