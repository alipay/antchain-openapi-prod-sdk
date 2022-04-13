// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用信息
    public class Application : TeaModel {
        // 应用部署时指定的自定义参数
        [NameInMap("custom_params")]
        [Validation(Required=false)]
        public List<OpsParam> CustomParams { get; set; }

        // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
        [NameInMap("depends")]
        [Validation(Required=false)]
        public List<string> Depends { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 指定应用下的应用服务实例
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<AppService> Services { get; set; }

        // 应用包版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
