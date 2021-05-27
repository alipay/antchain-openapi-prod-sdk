// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 角色
    public class Role : TeaModel {
        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 蚂蚁金融科技租户ID
        [NameInMap("open_tenant")]
        [Validation(Required=false)]
        public string OpenTenant { get; set; }

        // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=false)]
        public string RoleType { get; set; }

    }

}
