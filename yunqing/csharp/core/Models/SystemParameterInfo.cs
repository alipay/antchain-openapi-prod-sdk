// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 系统参数
    public class SystemParameterInfo : TeaModel {
        // 参数名
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 参数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 环境Id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 参数描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 记录id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
