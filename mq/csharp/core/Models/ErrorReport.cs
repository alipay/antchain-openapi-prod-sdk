// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 错误报告，包含了错误码，排查指南，请求上下文，支持链接等
    public class ErrorReport : TeaModel {
        // 组件 数组
        [NameInMap("components")]
        [Validation(Required=true)]
        public List<UIComponent> Components { get; set; }

    }

}
