// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateApplicationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用分组 id
        [NameInMap("app_domain_id")]
        [Validation(Required=false)]
        public string AppDomainId { get; set; }

        // 应用等级 id
        [NameInMap("app_level_id")]
        [Validation(Required=false)]
        public string AppLevelId { get; set; }

        // 页面请求用户无需自行填写此字段。此字段用于代码库的创建权限认证。为 iam 返回的 authorization 值。
        [NameInMap("authorization")]
        [Validation(Required=false)]
        public string Authorization { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 应用中文名称
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 使用已有的代码库。默认为否。
        [NameInMap("code_repository_existed")]
        [Validation(Required=false)]
        public bool? CodeRepositoryExisted { get; set; }

        // 代码库 group 名称
        [NameInMap("code_repository_group_name")]
        [Validation(Required=false)]
        public string CodeRepositoryGroupName { get; set; }

        // 默认无需填写。代码库名称。默认无需关联代码库。
        [NameInMap("code_repository_name")]
        [Validation(Required=false)]
        public string CodeRepositoryName { get; set; }

        // 默认为 GITLAB。无代码库时，无需填写。
        [NameInMap("code_repository_type")]
        [Validation(Required=false)]
        public string CodeRepositoryType { get; set; }

        // 应用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用负责人 id
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // 技术栈 id
        [NameInMap("stack_id")]
        [Validation(Required=false)]
        public string StackId { get; set; }

        // 当设置代码库时，需设置此字段
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
