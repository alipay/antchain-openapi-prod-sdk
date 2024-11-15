// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class ExecRobotIntelligentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id
        [NameInMap("target_req_msg_id")]
        [Validation(Required=true)]
        public string TargetReqMsgId { get; set; }

        // 通知人
        [NameInMap("sender_staff_id")]
        [Validation(Required=false)]
        public string SenderStaffId { get; set; }

        // 回调通知接口
        [NameInMap("call_url")]
        [Validation(Required=false)]
        public string CallUrl { get; set; }

        // token
        [NameInMap("robot_token")]
        [Validation(Required=false)]
        public string RobotToken { get; set; }

    }

}
