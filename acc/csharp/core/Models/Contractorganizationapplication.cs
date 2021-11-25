// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 合同企业主体
    public class Contractorganizationapplication : TeaModel {
        // 执照号码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 执照类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 法人名称
        [NameInMap("legal_person")]
        [Validation(Required=true)]
        public string LegalPerson { get; set; }

        // 法人证件号
        [NameInMap("legal_person_id")]
        [Validation(Required=true)]
        public string LegalPersonId { get; set; }

        // 企业名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 组织id
        [NameInMap("organization_id")]
        [Validation(Required=true)]
        public string OrganizationId { get; set; }

    }

}
