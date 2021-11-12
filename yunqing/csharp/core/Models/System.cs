// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 云游系统信息
    public class System : TeaModel {
        // 系统的代码commit
        [NameInMap("commit_id")]
        [Validation(Required=true)]
        public string CommitId { get; set; }

        // 管理的环境列表
        [NameInMap("envs")]
        [Validation(Required=true)]
        public List<Env> Envs { get; set; }

        // 支持的OpenAPI列表
        [NameInMap("open_apis")]
        [Validation(Required=true)]
        public List<OpenAPI> OpenApis { get; set; }

        // 云游的产品版本号, 该值可能为空
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
