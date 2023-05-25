// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class SubmitImagesReposcanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 镜像仓库ID
        [NameInMap("repo_id")]
        [Validation(Required=true)]
        public string RepoId { get; set; }

        // 项目列表
        [NameInMap("projects")]
        [Validation(Required=false)]
        public List<string> Projects { get; set; }

        // 仓库列表
        [NameInMap("repositories")]
        [Validation(Required=false)]
        public List<string> Repositories { get; set; }

        // 镜像起始时间
        [NameInMap("image_begin_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ImageBeginTime { get; set; }

        // 并发扫描数
        [NameInMap("concurrent_count")]
        [Validation(Required=false)]
        public long? ConcurrentCount { get; set; }

        // 扫描轮询间隔，单位s
        [NameInMap("poll_interval")]
        [Validation(Required=false)]
        public long? PollInterval { get; set; }

    }

}
