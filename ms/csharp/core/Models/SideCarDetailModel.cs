// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // sidecar实例
    public class SideCarDetailModel : TeaModel {
        // 应用服务名
        [NameInMap("app_service_name")]
        [Validation(Required=true)]
        public string AppServiceName { get; set; }

        // 集群名
        [NameInMap("clustername")]
        [Validation(Required=true)]
        public string Clustername { get; set; }

        // pod创建时间
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // pod ip
        [NameInMap("pod_ip")]
        [Validation(Required=true)]
        public string PodIp { get; set; }

        // pod实例名
        [NameInMap("pod_name")]
        [Validation(Required=true)]
        public string PodName { get; set; }

        // pod状态
        [NameInMap("pod_status")]
        [Validation(Required=true)]
        public string PodStatus { get; set; }

        // sidecar状态
        [NameInMap("sidecar_status")]
        [Validation(Required=true)]
        public string SidecarStatus { get; set; }

        // sidecar类型(mosn/odp/mist)
        [NameInMap("sidecar_type")]
        [Validation(Required=true)]
        public string SidecarType { get; set; }

        // sidecar版本
        [NameInMap("sidecar_version")]
        [Validation(Required=true)]
        public string SidecarVersion { get; set; }

    }

}
