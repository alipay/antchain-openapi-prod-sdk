// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 具体实体的身份信息
    public class EntityInfo : TeaModel {
        // 0，身份证；1，电话；2，email，3，企业营业执照号
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 具体号码
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
