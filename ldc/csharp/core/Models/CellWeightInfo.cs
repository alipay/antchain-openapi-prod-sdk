// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署单元权重
    public class CellWeightInfo : TeaModel {
        // 部署单元所属工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // 部署单元名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 部署单元所占单元组流量比重
        [NameInMap("weight")]
        [Validation(Required=true)]
        public long? Weight { get; set; }

    }

}
