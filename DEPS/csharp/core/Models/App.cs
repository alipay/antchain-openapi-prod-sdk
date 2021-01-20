// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用管理-应用模型
    public class App : TeaModel {
        // 应用所属分组 id
        [NameInMap("app_group_id")]
        [Validation(Required=false)]
        public string AppGroupId { get; set; }

        // 应用分组名称
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

        // 技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // 允许访问公网
        [NameInMap("default_route")]
        [Validation(Required=false)]
        public bool? DefaultRoute { get; set; }

        // 应用发布模式，发布包，发布镜像，混合发布。
        // 默认为空 - 表示包发布模式
        [NameInMap("deploy_type")]
        [Validation(Required=false)]
        public string DeployType { get; set; }

        // 应用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 域内应用全局唯一名称
        [NameInMap("global_name")]
        [Validation(Required=false)]
        public string GlobalName { get; set; }

        // 应用 id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用负责人显示名称
        [NameInMap("owner_display_name")]
        [Validation(Required=false)]
        public string OwnerDisplayName { get; set; }

        // 应用负责人登录名称
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 技术栈id
        [NameInMap("stack_id")]
        [Validation(Required=false)]
        public string StackId { get; set; }

        // 应用状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用额外信息（应用标签）
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<Tag> Tags { get; set; }

        // 应用负责人id
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

    }

}
