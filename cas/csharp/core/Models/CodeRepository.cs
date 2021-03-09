// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 代码仓库
    public class CodeRepository : TeaModel {
        // 代码仓库ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // VCS源代码管理系统
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 负责人
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 源代码地址
        [NameInMap("source_location")]
        [Validation(Required=false)]
        public string SourceLocation { get; set; }

        // 被SCM管理的远程仓库ID
        [NameInMap("remote_repo_id")]
        [Validation(Required=false)]
        public string RemoteRepoId { get; set; }

        // 流程标记id(可选参数)
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 是否初始化目录(可选参数，目前金融云传与不传都不初始化)
        [NameInMap("is_init_standard_path")]
        [Validation(Required=false)]
        public bool? IsInitStandardPath { get; set; }

        // 代码库是否可复用(默认为不复用 0)
        [NameInMap("repo_reuse")]
        [Validation(Required=false)]
        public string RepoReuse { get; set; }

        // 父代码库名称(reposReuse为0时可以不传)
        [NameInMap("parent_repos_name")]
        [Validation(Required=false)]
        public string ParentReposName { get; set; }

        // 代码仓库状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 扩展参数，JSON字符串
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

        // 是否使用已有仓库
        [NameInMap("use_exist")]
        [Validation(Required=false)]
        public bool? UseExist { get; set; }

        // 分组名称
        [NameInMap("group_name")]
        [Validation(Required=false)]
        public string GroupName { get; set; }

    }

}
