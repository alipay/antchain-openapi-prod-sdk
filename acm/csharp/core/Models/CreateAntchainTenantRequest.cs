// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CreateAntchainTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 企业名称或个人名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 客户类型
        // PERSON("个人","1"),
        // ENTERPRISE("企业","2")
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 法人姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 法人证件号
        [NameInMap("artificial_person_cert_no")]
        [Validation(Required=false)]
        public string ArtificialPersonCertNo { get; set; }

        // 法人证件类型
        [NameInMap("artificial_person_cert_type")]
        [Validation(Required=false)]
        public string ArtificialPersonCertType { get; set; }

        // 支付宝登录号
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 支付宝uid(租户id)
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 业务场景码
        [NameInMap("bussiness_code")]
        [Validation(Required=true)]
        public string BussinessCode { get; set; }

        // 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
        [NameInMap("bussiness_role")]
        [Validation(Required=false)]
        public string BussinessRole { get; set; }

        // 是否支付宝账户入驻
        [NameInMap("is_alipay_tenant")]
        [Validation(Required=true)]
        public bool? IsAlipayTenant { get; set; }

        // 是否认证过，不填默认未认证
        [NameInMap("antchain_certified")]
        [Validation(Required=false)]
        public bool? AntchainCertified { get; set; }

    }

}
