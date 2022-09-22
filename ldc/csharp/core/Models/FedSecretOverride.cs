// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦保密字典数据在不同 cell 下的自定义覆盖配置
    public class FedSecretOverride : TeaModel {
        // 要覆盖的保密字典数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SecretData> Data { get; set; }

        // 部署单元的名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 覆盖的名称，必须为：保密字典名称-cell-部署单元名称
        [NameInMap("name_override")]
        [Validation(Required=true)]
        public string NameOverride { get; set; }

    }

}
