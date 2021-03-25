// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用信息
    public class Application : TeaModel {
        // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
        [NameInMap("depends")]
        [Validation(Required=false)]
        public List<string> Depends { get; set; }

        // 执行部署操作的目标应用名称，应用名称最大60个UTF-8字符
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 执行部署操作的目标应用服务名称，应用服务名称最大60个UTF-8字符
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 执行部署操作的目标应用版本。如果某个应用未指定版本，则使用最新版本部署。
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 自定义参数 jsonStr Map<String,List<String>>
        [NameInMap("custom_params_map")]
        [Validation(Required=false)]
        public string CustomParamsMap { get; set; }

    }

}
