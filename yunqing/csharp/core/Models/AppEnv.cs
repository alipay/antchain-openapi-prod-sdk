// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // AAP 应用实例环境变量值
    public class AppEnv : TeaModel {
        // 应用部署时用于渲染的值，渲染为value
        [NameInMap("render_value")]
        [Validation(Required=true)]
        public string RenderValue { get; set; }

        // 参数的值，部署的时候会被render_value的渲染结果覆盖
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 参数的key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

    }

}
