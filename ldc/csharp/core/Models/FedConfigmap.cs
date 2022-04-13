// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed configmap struct
    public class FedConfigmap : TeaModel {
        // fed configmap annotations
        [NameInMap("annotations")]
        [Validation(Required=true)]
        public List<Annotation> Annotations { get; set; }

        // Fed资源集群Cell状态
        [NameInMap("cell_status")]
        [Validation(Required=false)]
        public List<ClusteCellStatus> CellStatus { get; set; }

        // fed clusters
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // fed configmap data
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ConfigMapData> Data { get; set; }

        // fed configmap labels
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<Label> Labels { get; set; }

        // fed configmap name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // fed configmap namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // fed configmap override
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public List<FedConfigmapOverride> Overrides { get; set; }

        // 原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // propagation状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
