// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦保密字典
    public class FedSecret : TeaModel {
        // 保密字典的注解
        // 
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

        // 分发状态
        [NameInMap("cell_status")]
        [Validation(Required=true)]
        public List<ClusteCellStatus> CellStatus { get; set; }

        // 分发的 cell 列表
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // 创建时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true)]
        public string CreateTimeStamp { get; set; }

        // 保密字典数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SecretData> Data { get; set; }

        // 保密字典的标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        // 
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 保密字典数据在不同 cell 下的自定义覆盖配置
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public List<FedSecretOverride> Overrides { get; set; }

        // 导致该分发状态的原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 分发状态，成功 True，失败 False，删除中 Deleting
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 保密字典类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
