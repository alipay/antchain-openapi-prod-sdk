// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 设备信息上报
    public class DeviceRiskReportResult : TeaModel {
        // success
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // result_code
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // result_status
        [NameInMap("result_status")]
        [Validation(Required=true)]
        public string ResultStatus { get; set; }

        // apdid
        [NameInMap("apdid")]
        [Validation(Required=true)]
        public string Apdid { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // current_time
        [NameInMap("current_time")]
        [Validation(Required=true)]
        public string CurrentTime { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // vkey_switch
        [NameInMap("vkey_switch")]
        [Validation(Required=true)]
        public string VkeySwitch { get; set; }

        // bug_track_switch
        [NameInMap("bug_track_switch")]
        [Validation(Required=true)]
        public string BugTrackSwitch { get; set; }

        // app_list_ver
        [NameInMap("app_list_ver")]
        [Validation(Required=true)]
        public string AppListVer { get; set; }

        // dynamic_key
        [NameInMap("dynamic_key")]
        [Validation(Required=true)]
        public string DynamicKey { get; set; }

        // result_data
        [NameInMap("result_data")]
        [Validation(Required=true)]
        public DeviceRiskReportResultData ResultData { get; set; }

    }

}
