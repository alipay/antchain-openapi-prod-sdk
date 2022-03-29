// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 联动的UI控件模型
    public class UnionControlModel : TeaModel {
        // 具体的联动 控件模型
        [NameInMap("control")]
        [Validation(Required=true)]
        public UIControlModel Control { get; set; }

        // 本联动控件对应的父控件的名称，例如本联动控件是input，父控件是select，想要做到select选择某个特定选项后展示input控件，那么本字段就是 select控件的name。
        [NameInMap("union_control")]
        [Validation(Required=true)]
        public string UnionControl { get; set; }

        // 对应父控件的value为本字段的值时，本联动控件会展示出来。例如：当topicConfig这个select控件的值是 customized时，本联动控件input就能展示了。
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
