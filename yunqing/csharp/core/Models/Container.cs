// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 容器信息。
    public class Container : TeaModel {
        // 应用版本
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // cpu核数，单位C。
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 宿主机ip。
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // 宿主机名称。
        [NameInMap("host_name")]
        [Validation(Required=false)]
        public string HostName { get; set; }

        // 容器id。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 容器镜像。
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 容器ip。
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 内存大小，单位M。
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // 容器名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 容器所在的pod。
        [NameInMap("pod")]
        [Validation(Required=false)]
        public string Pod { get; set; }

        // 资源所属的资源池的唯一标识。
        [NameInMap("resource_pool_id")]
        [Validation(Required=false)]
        public string ResourcePoolId { get; set; }

        // 容器状态。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

    }

}
