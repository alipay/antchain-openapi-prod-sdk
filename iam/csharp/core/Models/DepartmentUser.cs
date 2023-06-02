// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 部门用户关系
    public class DepartmentUser : TeaModel {
        // 部门唯一码
        [NameInMap("department_code")]
        [Validation(Required=false)]
        public string DepartmentCode { get; set; }

        // 用户 id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 部门成员类型，
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
