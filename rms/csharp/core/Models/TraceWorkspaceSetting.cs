// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 链路工作空间配置
    public class TraceWorkspaceSetting : TeaModel {
        // 工作空间名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 是否开启采样率，false代表全采
        [NameInMap("sample_enabled")]
        [Validation(Required=false)]
        public bool? SampleEnabled { get; set; }

        // 采样率
        [NameInMap("sample_rate")]
        [Validation(Required=false)]
        public string SampleRate { get; set; }

        // 是否开启链路
        [NameInMap("trace_enabled")]
        [Validation(Required=false)]
        public bool? TraceEnabled { get; set; }

        // 是否开启异常链路全采样
        [NameInMap("error_trace_enabled")]
        [Validation(Required=false)]
        public bool? ErrorTraceEnabled { get; set; }

        // 是否开启链路瘦身
        [NameInMap("narrow_span_enabled")]
        [Validation(Required=false)]
        public bool? NarrowSpanEnabled { get; set; }

    }

}
