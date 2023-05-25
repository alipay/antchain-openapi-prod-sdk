// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class CreateImageRepoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 镜像仓库名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 镜像仓库类型
        [NameInMap("repo_type")]
        [Validation(Required=true)]
        public string RepoType { get; set; }

        // hub域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // API endpoint
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        // 用户名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 仓库密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

    }

}
