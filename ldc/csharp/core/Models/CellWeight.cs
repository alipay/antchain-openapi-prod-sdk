// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署单元权重
    public class CellWeight : TeaModel {
        // 统一接入或负载均衡名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部署单元权重详情
        [NameInMap("cell_weight_infos")]
        [Validation(Required=true)]
        public List<CellWeightInfo> CellWeightInfos { get; set; }

    }

}
