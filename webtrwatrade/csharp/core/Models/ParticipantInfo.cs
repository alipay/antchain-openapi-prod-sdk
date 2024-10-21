// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 项目参与者信息
    public class ParticipantInfo : TeaModel {
        // 机构id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 二级机构类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 机构名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
