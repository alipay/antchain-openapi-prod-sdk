// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个运维操作单元。
    public class OpsUnit : TeaModel {
        // 单元所属部署区
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 包含在此单元中进行运维操作的计算容器列表
        [NameInMap("computers")]
        [Validation(Required=false)]
        public List<OpsComputer> Computers { get; set; }

        // 单元所属地域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 单元所属可用区
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
