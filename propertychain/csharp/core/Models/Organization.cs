// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 组织信息
    public class Organization : TeaModel {
        // 企业编号
        [NameInMap("role_company_no")]
        [Validation(Required=true)]
        public string RoleCompanyNo { get; set; }

        // 企业名称
        [NameInMap("role_company_name")]
        [Validation(Required=true)]
        public string RoleCompanyName { get; set; }

    }

}
