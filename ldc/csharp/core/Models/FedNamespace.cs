// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed namespace
    public class FedNamespace : TeaModel {
        // fed namespace annotations
        [NameInMap("annotations")]
        [Validation(Required=true)]
        public List<Annotation> Annotations { get; set; }

        // fed namespace clusters
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // fed namespace cluster state map
        [NameInMap("cluster_state_map")]
        [Validation(Required=true)]
        public List<ClusterState> ClusterStateMap { get; set; }

        // fed namespace labels
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<Label> Labels { get; set; }

        // fed namespace name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Fed CRD namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // fed 资源的状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 导致 fed 资源处于该状态的原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
