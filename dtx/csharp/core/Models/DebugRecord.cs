// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 联调记录，包括发起方联调和参与者联调
    public class DebugRecord : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 1：发起方联调，2：参与者联调
        [NameInMap("debug_type")]
        [Validation(Required=true)]
        public long? DebugType { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 记录id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 发起方信息
        [NameInMap("initiator")]
        [Validation(Required=true)]
        public DebugInitiator Initiator { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 执行人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 参与者信息
        [NameInMap("participator")]
        [Validation(Required=true)]
        public DebugParticipator Participator { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 联调结果信息
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

    }

}
