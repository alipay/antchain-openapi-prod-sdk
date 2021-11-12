// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 巡检使用的pod信息
    public class PodInfo : TeaModel {
        // podname
        [NameInMap("pod_name")]
        [Validation(Required=true)]
        public string PodName { get; set; }

        // 容器name
        [NameInMap("container_name")]
        [Validation(Required=true)]
        public string ContainerName { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // host ip
        [NameInMap("host_ip")]
        [Validation(Required=true)]
        public string HostIp { get; set; }

        // hostname
        [NameInMap("host_name")]
        [Validation(Required=false)]
        public string HostName { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public string Cpu { get; set; }

        // 内存
        [NameInMap("memory")]
        [Validation(Required=false)]
        public string Memory { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
