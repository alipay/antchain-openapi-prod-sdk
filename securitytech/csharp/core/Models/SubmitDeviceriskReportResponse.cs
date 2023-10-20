// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class SubmitDeviceriskReportResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // apdid
        [NameInMap("apdid")]
        [Validation(Required=false)]
        public string Apdid { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // current_time
        [NameInMap("current_time")]
        [Validation(Required=false)]
        public string CurrentTime { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // vkey_switch
        [NameInMap("vkey_switch")]
        [Validation(Required=false)]
        public string VkeySwitch { get; set; }

        // bug_track_switch
        [NameInMap("bug_track_switch")]
        [Validation(Required=false)]
        public string BugTrackSwitch { get; set; }

        // app_list_ver
        [NameInMap("app_list_ver")]
        [Validation(Required=false)]
        public string AppListVer { get; set; }

        // dynamic_key
        [NameInMap("dynamic_key")]
        [Validation(Required=false)]
        public string DynamicKey { get; set; }

        // result_data
        [NameInMap("result_data")]
        [Validation(Required=false)]
        public DeviceRiskReportResultData ResultData { get; set; }

    }

}
