// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 参与人
    public class Participant : TeaModel {
        // 参与人角色
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // 参与人工号
        [NameInMap("work_no")]
        [Validation(Required=true)]
        public string WorkNo { get; set; }

    }

}
