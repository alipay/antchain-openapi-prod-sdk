// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦配置项
    public class FedConfigmap : TeaModel {
        // 配置项的注解
        [NameInMap("annotations")]
        [Validation(Required=true)]
        public List<Annotation> Annotations { get; set; }

        // 分发状态
        [NameInMap("cell_status")]
        [Validation(Required=false)]
        public List<ClusteCellStatus> CellStatus { get; set; }

        // 分发的 cell 列表
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // 配置项数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ConfigMapData> Data { get; set; }

        // 配置项的标签
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<Label> Labels { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 配置项数据在不同 cell 下的自定义覆盖配置
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public List<FedConfigmapOverride> Overrides { get; set; }

        // 导致该分发状态的原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 分发状态，成功 True，失败 False，删除中 Deleting
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
