// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 主要人员
    public class EnterpriseStaff : TeaModel {
        // 主要人员名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 法人类型，1-人;2-公司
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 经理
        [NameInMap("type_join")]
        [Validation(Required=false)]
        public List<string> TypeJoin { get; set; }

    }

}
