// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateAppGroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用依赖规划
        [NameInMap("app_scheme")]
        [Validation(Required=false)]
        public List<AppDepend> AppScheme { get; set; }

        // 应用分组描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 应用分组名称，支持中文
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用分组负责人登录名
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 父应用分组 id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

    }

}
