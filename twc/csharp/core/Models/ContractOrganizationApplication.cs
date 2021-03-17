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

        // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
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

    }

}
