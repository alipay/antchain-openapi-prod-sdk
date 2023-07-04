// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用元数据
    public class ApplicationMeta : TeaModel {
        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 应用版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 所属产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 应用之间的依赖
        [NameInMap("dependencies")]
        [Validation(Required=false)]
        public List<string> Dependencies { get; set; }

        // 应用类型    STANDARD("standard"),
        //     JOB("job"),
        //     SIDECAR("sidecar"),
        //     DAEMON("daemon");
        [NameInMap("kind")]
        [Validation(Required=true)]
        public string Kind { get; set; }

    }

}
