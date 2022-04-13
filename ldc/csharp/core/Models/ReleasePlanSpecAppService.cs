// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // V1ReleasePlanSpec appService
    public class ReleasePlanSpecAppService : TeaModel {
        // 依赖的应用服务名字列表
        [NameInMap("dependencies")]
        [Validation(Required=true)]
        public List<string> Dependencies { get; set; }

        // 应用服务名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // container service revision
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

    }

}
