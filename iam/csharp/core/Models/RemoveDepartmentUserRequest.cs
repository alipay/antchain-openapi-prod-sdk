// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class RemoveDepartmentUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待删除的部门成员关系列表
        [NameInMap("department_users")]
        [Validation(Required=true)]
        public List<DepartmentUser> DepartmentUsers { get; set; }

    }

}
