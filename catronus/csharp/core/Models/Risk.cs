// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 风险详情
    public class Risk : TeaModel {
        // 风险ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 风险名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 类型
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 等级
        [NameInMap("priority")]
        [Validation(Required=true)]
        public string Priority { get; set; }

        // 风险唯一标识
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

    }

}
