// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 单元化管理中的单元组对象
    public class FlowCellGroup : TeaModel {
        // 单元组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 单元组类型，枚举，GZG、RZG
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 默认GZone，一般为 GZ00
        [NameInMap("default_gzone")]
        [Validation(Required=false)]
        public string DefaultGzone { get; set; }

        // 单元组是否有效
        [NameInMap("valid")]
        [Validation(Required=true)]
        public bool? Valid { get; set; }

        // 单元组容灾状态，枚举，NORMAL（正常）、LOCAL（同城容灾）、REMOTE（异地容灾）
        [NameInMap("disaster_state")]
        [Validation(Required=false)]
        public string DisasterState { get; set; }

    }

}
