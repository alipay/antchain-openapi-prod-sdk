// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // drm 推送记录
    public class DrmOpsRecord : TeaModel {
        // 应用
        [NameInMap("apps")]
        [Validation(Required=false)]
        public List<string> Apps { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 推送时间
        [NameInMap("push_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PushTime { get; set; }

        // 推送结果，包括（SUCCESS，FAILED，INVALID_REQUEST，NO_RECORD，SYSTEM_EXCEPTION，PARAM_QUERY_ERROR，PARAM_INVALID）
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // 结果信息
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 推送目标
        [NameInMap("targets")]
        [Validation(Required=false)]
        public List<string> Targets { get; set; }

        // 推送值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 规则类型
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

    }

}
