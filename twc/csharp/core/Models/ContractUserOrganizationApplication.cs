// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 机构信息
    public class ContractUserOrganizationApplication : TeaModel {
        // 证件号，该字段只有为空才允许修改
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 证件类型 ，默认CRED_ORG_USCC
        [NameInMap("id_type")]
        [Validation(Required=false)]
        public string IdType { get; set; }

        // 企业法定代表人名称
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 企业法定代表人证件号
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 机构账号id
        [NameInMap("organization_id")]
        [Validation(Required=true)]
        public string OrganizationId { get; set; }

    }

}
