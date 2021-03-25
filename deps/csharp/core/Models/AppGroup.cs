// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用分组。
    public class AppGroup : TeaModel {
        // 应用依赖规划
        [NameInMap("app_scheme")]
        [Validation(Required=false)]
        public List<AppDepend> AppScheme { get; set; }

        // 应用分组描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 应用分组ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用分组名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用分组负责人登录名
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 父应用分组ID
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 应用分组层级，从1开始，1代表一级分组，2代表二级分组
        [NameInMap("layer")]
        [Validation(Required=false)]
        public long? Layer { get; set; }

    }

}
