// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 数据源接口出参定义
    public class InterfaceOutput : TeaModel {
        // 接口出参名称
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=50)]
        public string Name { get; set; }

        // 接口出参类型
        [NameInMap("type")]
        [Validation(Required=false, MaxLength=50)]
        public string Type { get; set; }

        // 接口出参描述
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=100)]
        public string Description { get; set; }

    }

}
