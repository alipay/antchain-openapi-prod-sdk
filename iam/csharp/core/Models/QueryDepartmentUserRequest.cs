// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryDepartmentUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部门唯一码
        [NameInMap("department_code")]
        [Validation(Required=false)]
        public string DepartmentCode { get; set; }

        // 用户 id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 部门成员类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

    }

}
