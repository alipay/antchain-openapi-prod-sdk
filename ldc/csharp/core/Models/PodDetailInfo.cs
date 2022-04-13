// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // pod detail info
    public class PodDetailInfo : TeaModel {
        // 集群名称
        // 
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // pod created time
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 已经具备的finalizers
        [NameInMap("finalizers")]
        [Validation(Required=false)]
        public List<string> Finalizers { get; set; }

        // pod的生命周期当前阶段
        [NameInMap("lifecycle_stage")]
        [Validation(Required=false)]
        public string LifecycleStage { get; set; }

        // pod name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // pod namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // pod ip
        [NameInMap("pod_ip")]
        [Validation(Required=true)]
        public string PodIp { get; set; }

        // pod的版本
        [NameInMap("revision")]
        [Validation(Required=false)]
        public string Revision { get; set; }

        // pod status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // pod uid
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // 描述Pod当前状态的信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
