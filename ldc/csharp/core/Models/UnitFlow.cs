// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署单元组的流量规则
    public class UnitFlow : TeaModel {
        // 部署单元组的名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部署单元组的类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 该部署单元组下的部署单元流量规则
        [NameInMap("cell_flows")]
        [Validation(Required=true)]
        public List<CellFlow> CellFlows { get; set; }

        // 该部署单元组下的部署单元 uid 分配
        [NameInMap("uid_ranges")]
        [Validation(Required=true)]
        public List<UidRange> UidRanges { get; set; }

        // 是否弹性部署单元组
        [NameInMap("elastic")]
        [Validation(Required=true)]
        public bool? Elastic { get; set; }

    }

}
