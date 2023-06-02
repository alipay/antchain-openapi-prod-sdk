// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class PagequeryDepartmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部门唯一码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 部门名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部门描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 父部门唯一码
        [NameInMap("parent_code")]
        [Validation(Required=false)]
        public string ParentCode { get; set; }

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
