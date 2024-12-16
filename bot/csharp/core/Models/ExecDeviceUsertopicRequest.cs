// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecDeviceUsertopicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 使用Hmac-SHA256 哈希算法对对deviceDid进行加签， key 为deviceSecret 
        // Hmac-SHA256(deviceDid,deviceSecret)
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 自定义topic名称
        [NameInMap("topic_identifer")]
        [Validation(Required=true)]
        public string TopicIdentifer { get; set; }

        // FORWARD
        [NameInMap("user_topic_cmd_type")]
        [Validation(Required=true)]
        public string UserTopicCmdType { get; set; }

        // 指令内容
        [NameInMap("cmd_content")]
        [Validation(Required=true)]
        public string CmdContent { get; set; }

        // 业务场景
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
