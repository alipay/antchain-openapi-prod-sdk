// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class CreateDepartmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部门唯一码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 部门名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部门描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 父部门 code，如果需要创建根部门，需填：ROOT
        [NameInMap("parent_code")]
        [Validation(Required=true)]
        public string ParentCode { get; set; }

    }

}
