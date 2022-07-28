// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyUmktRobotcallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外呼主叫号码
        [NameInMap("called_show_number")]
        [Validation(Required=true)]
        public string CalledShowNumber { get; set; }

        // 被叫号码
        [NameInMap("called_number")]
        [Validation(Required=true)]
        public string CalledNumber { get; set; }

        // 机器人id
        [NameInMap("robot_id")]
        [Validation(Required=true)]
        public long? RobotId { get; set; }

        // 是否开启录音
        [NameInMap("record_flag")]
        [Validation(Required=false)]
        public bool? RecordFlag { get; set; }

        // 是否开启早媒体
        [NameInMap("early_media_asr")]
        [Validation(Required=false)]
        public bool? EarlyMediaAsr { get; set; }

        // 机器人参数
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
