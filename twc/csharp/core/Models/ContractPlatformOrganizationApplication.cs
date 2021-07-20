// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 平台方企业信息
    public class ContractPlatformOrganizationApplication : TeaModel {
        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 企业法人名称
        [NameInMap("org_legal_name")]
        [Validation(Required=false)]
        public string OrgLegalName { get; set; }

        // 企业法人证件号
        [NameInMap("org_legal_id_number")]
        [Validation(Required=false)]
        public string OrgLegalIdNumber { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
