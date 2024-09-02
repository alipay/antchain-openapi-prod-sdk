// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 静态数据模块详情
    public class StaticDataModuleDetail : TeaModel {
        // 描述
        [NameInMap("property_text")]
        [Validation(Required=true)]
        public string PropertyText { get; set; }

        // 商户类型
        [NameInMap("property_value")]
        [Validation(Required=true)]
        public string PropertyValue { get; set; }

    }

}
