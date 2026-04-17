// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 品牌信息
    public class LetterInfo : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
