// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 智能合同机构账户创建申请信息
    public class ContractOrganizationApplication : TeaModel {
        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://antchain.antgroup.com/docs/2/424437#）
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 企业法人名称
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 企业法人证件号
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 机构唯一标识，可传入第三方平台的机构用户id等
        [NameInMap("organization_id")]
        [Validation(Required=false)]
        public string OrganizationId { get; set; }

        // 机构子类型：ENTERPRISE（企业）、SELF-EMPLOYED（个体工商户）、SUBSIDIARY（分公司）、OTHERORG（其他机构）。若填入这些类型，将会进行相应参数校验，例如：企业类型要求进行企业四要素校验，企业证件号必须是91开头，并且企业类型在签署时会需要授权后才可进行签署；个体工商户要求证件号必须是92开头，其余类型无其他校验。不填入此参数不会进行校验。
        [NameInMap("org_type")]
        [Validation(Required=false)]
        public string OrgType { get; set; }

    }

}
