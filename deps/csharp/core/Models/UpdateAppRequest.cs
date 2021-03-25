// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateAppRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
        [NameInMap("appgroup_name")]
        [Validation(Required=false)]
        public string AppgroupName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 应用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用额外信息（应用标签）
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<Tag> Tags { get; set; }

    }

}
