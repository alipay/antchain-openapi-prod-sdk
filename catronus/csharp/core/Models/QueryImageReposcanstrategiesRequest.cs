// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryImageReposcanstrategiesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 仓库ID
        [NameInMap("repo_id")]
        [Validation(Required=true)]
        public string RepoId { get; set; }

        // 当前页
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
