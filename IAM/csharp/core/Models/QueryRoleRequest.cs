// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryRoleRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 角色名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页,默认1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，取值范围[1~50],默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 是否分页，默认true
        [NameInMap("paging")]
        [Validation(Required=false)]
        public bool? Paging { get; set; }

        // 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
