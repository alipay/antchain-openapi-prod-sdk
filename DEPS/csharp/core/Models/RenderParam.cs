// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用参数配置管理-某个参数在不同环境中渲染后的值
    public class RenderParam : TeaModel {
        // 参数名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 参数值，可能是一个常量或者表达式
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 参数值类型，CONST/EXPR
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 参数描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 数据保密级别，L1,L2,L3
        [NameInMap("data_level")]
        [Validation(Required=false)]
        public string DataLevel { get; set; }

        // 参数渲染后的值
        [NameInMap("render_vals")]
        [Validation(Required=false)]
        public List<ParamVal> RenderVals { get; set; }

    }

}
