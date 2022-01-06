// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务鉴权表单配置
    public class AuthRuleConfig : TeaModel {
        // 字段信息
        [NameInMap("fields")]
        [Validation(Required=true)]
        public List<ConfigEntity> Fields { get; set; }

        // 操作符集合
        [NameInMap("operations")]
        [Validation(Required=true)]
        public List<ConfigEntity> Operations { get; set; }

        // 类型，系统内置或者是自定义
        [NameInMap("types")]
        [Validation(Required=true)]
        public List<ConfigEntity> Types { get; set; }

    }

}
