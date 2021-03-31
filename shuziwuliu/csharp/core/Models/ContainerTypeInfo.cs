// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 航运集装箱类型信息
    public class ContainerTypeInfo : TeaModel {
        // 箱型
        [NameInMap("container_type")]
        [Validation(Required=false)]
        public string ContainerType { get; set; }

        // 箱量
        [NameInMap("container_volume")]
        [Validation(Required=false)]
        public string ContainerVolume { get; set; }

    }

}
