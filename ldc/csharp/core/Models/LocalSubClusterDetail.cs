// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 描述本地spanner集群一组容器的详细信息
    public class LocalSubClusterDetail : TeaModel {
        // 可用实例数
        [NameInMap("available")]
        [Validation(Required=false)]
        public long? Available { get; set; }

        // 期望实例数
        [NameInMap("desired")]
        [Validation(Required=false)]
        public long? Desired { get; set; }

        // 容器镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 发布容器带的标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // 可能存在的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 健康实例数
        [NameInMap("ready")]
        [Validation(Required=false)]
        public long? Ready { get; set; }

        // 实际sub cluster 状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 已更新实例数
        [NameInMap("updated")]
        [Validation(Required=false)]
        public long? Updated { get; set; }

        // 容器版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 多个机房下的覆盖配置项
        [NameInMap("overrides")]
        [Validation(Required=false)]
        public List<SpannerSubClusterOverrides> Overrides { get; set; }

    }

}
