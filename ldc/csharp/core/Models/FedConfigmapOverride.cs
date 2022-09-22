// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦配置项数据在不同 cell 下的自定义覆盖配置
    public class FedConfigmapOverride : TeaModel {
        // 要覆盖的配置项数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ConfigMapData> Data { get; set; }

        // 部署单元名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 覆盖的名称，必须为：配置项名称-cell-部署单元名称
        [NameInMap("name_override")]
        [Validation(Required=true)]
        public string NameOverride { get; set; }

    }

}
