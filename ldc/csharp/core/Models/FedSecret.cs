// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed secret struct
    // 
    public class FedSecret : TeaModel {
        // fed secret annotations
        // 
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

        // FedSecret Cell Cluster Status
        [NameInMap("cell_status")]
        [Validation(Required=true)]
        public List<ClusteCellStatus> CellStatus { get; set; }

        // fed clusters
        // 
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // fed secret data
        // 
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SecretData> Data { get; set; }

        // fed secret labels
        // 
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // fed secret name
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // fed secret namespace
        // 
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // fed secret override
        // 
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public List<FedSecretOverride> Overrides { get; set; }

        // 原因描述
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // FedSecret同步状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // opaque
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
