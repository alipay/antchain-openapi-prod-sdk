// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    public class ExecuteAntcloudDtcallagentVoiceinspectionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务空间实例编码，如 demo
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 质检规则集 ID，如 qc-heiniu-v1
        [NameInMap("qc_rule_set_id")]
        [Validation(Required=true)]
        public string QcRuleSetId { get; set; }

        // 对话文本
        [NameInMap("voice_text")]
        [Validation(Required=true)]
        public string VoiceText { get; set; }

        // 录音地址
        [NameInMap("voice_url")]
        [Validation(Required=false)]
        public string VoiceUrl { get; set; }

        // 调用方批次 ID
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 调用方通话唯一标识
        [NameInMap("external_call_id")]
        [Validation(Required=false)]
        public string ExternalCallId { get; set; }

    }

}
