// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class UpdateImageRepoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 仓库ID
        [NameInMap("repo_id")]
        [Validation(Required=true)]
        public string RepoId { get; set; }

        // 用户名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 密码
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // 仓库名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
