// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 解决方案应用发布配置
    public class AppReleaseConfig : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用镜像
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // commitID
        [NameInMap("commit_id")]
        [Validation(Required=true)]
        public string CommitId { get; set; }

        // 代码分支
        [NameInMap("commit_branch")]
        [Validation(Required=true)]
        public string CommitBranch { get; set; }

        // diff基准版本，上一次最新发布的版本
        [NameInMap("last_revision_id")]
        [Validation(Required=false)]
        public string LastRevisionId { get; set; }

        // 应用服务版本id
        [NameInMap("revision_id")]
        [Validation(Required=false)]
        public string RevisionId { get; set; }

        // 应用服务版本diff摘要信息
        [NameInMap("revision_diff")]
        [Validation(Required=false)]
        public string RevisionDiff { get; set; }

    }

}
