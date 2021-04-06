// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class UpdateCustomerIdentityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 企业名称或个人名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人姓名
        [NameInMap("real_name")]
        [Validation(Required=false)]
        public string RealName { get; set; }

        // 法人证件号码
        [NameInMap("artificial_person_cert_no")]
        [Validation(Required=false)]
        public string ArtificialPersonCertNo { get; set; }

        // 法人证件类型
        [NameInMap("artificial_person_cert_type")]
        [Validation(Required=false)]
        public string ArtificialPersonCertType { get; set; }

        // 业务场景码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 业务角色
        [NameInMap("bussiness_role")]
        [Validation(Required=false)]
        public string BussinessRole { get; set; }

    }

}
