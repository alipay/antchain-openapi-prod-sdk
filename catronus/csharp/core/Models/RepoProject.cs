// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 仓库项目
    public class RepoProject : TeaModel {
        // project id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
