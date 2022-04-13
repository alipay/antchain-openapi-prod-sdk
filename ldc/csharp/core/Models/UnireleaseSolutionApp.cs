// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一解决方案App信息
    public class UnireleaseSolutionApp : TeaModel {
        // 应用名称
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 应用依赖信息
        [NameInMap("depends_on")]
        [Validation(Required=true)]
        public List<string> DependsOn { get; set; }

        // 应用发布配置
        [NameInMap("release_config")]
        [Validation(Required=true)]
        public AppReleaseConfig ReleaseConfig { get; set; }

        // 中间件配置
        [NameInMap("middleware_configs")]
        [Validation(Required=true)]
        public List<string> MiddlewareConfigs { get; set; }

        // 机构/租户信息
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
