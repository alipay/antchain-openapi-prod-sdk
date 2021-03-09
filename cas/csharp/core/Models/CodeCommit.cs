// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 代码提交
    public class CodeCommit : TeaModel {
        // 作者
        [NameInMap("author")]
        [Validation(Required=false)]
        public string Author { get; set; }

        // 分支
        [NameInMap("branch")]
        [Validation(Required=false)]
        public string Branch { get; set; }

        // 代码版本
        [NameInMap("code_version")]
        [Validation(Required=false)]
        public string CodeVersion { get; set; }

        // 时间
        [NameInMap("date")]
        [Validation(Required=false)]
        public string Date { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 消息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 仓库名称
        [NameInMap("repo_name")]
        [Validation(Required=false)]
        public string RepoName { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

    }

}
