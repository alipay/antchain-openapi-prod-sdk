// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // result.resultData
    public class DeviceRiskReportResultData : TeaModel {
        // webrtc_url
        [NameInMap("webrtc_url")]
        [Validation(Required=true)]
        public string WebrtcUrl { get; set; }

        // a_dynamic_swi
        [NameInMap("a_dynamic_swi")]
        [Validation(Required=true)]
        public string ADynamicSwi { get; set; }

        // dynamic_interval
        [NameInMap("dynamic_interval")]
        [Validation(Required=true)]
        public string DynamicInterval { get; set; }

        // color
        [NameInMap("color")]
        [Validation(Required=true)]
        public string Color { get; set; }

        // os
        [NameInMap("os")]
        [Validation(Required=true)]
        public string Os { get; set; }

        // dynamic_cmd
        [NameInMap("dynamic_cmd")]
        [Validation(Required=true)]
        public string DynamicCmd { get; set; }

        // time_interval
        [NameInMap("time_interval")]
        [Validation(Required=true)]
        public string TimeInterval { get; set; }

        // dynamic_trace
        [NameInMap("dynamic_trace")]
        [Validation(Required=true)]
        public string DynamicTrace { get; set; }

        // dynamic_num
        [NameInMap("dynamic_num")]
        [Validation(Required=true)]
        public string DynamicNum { get; set; }

        // result_type
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

    }

}
