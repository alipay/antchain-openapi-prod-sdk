// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ApplyMqtokenResponse : TeaModel {
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

        // 服务端返回的Token值，用于阿里云 MQTT连接
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 接入阿里云LMQ的所需的accessKey
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // mqtt的instanceId
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // mqtt的topic
        [NameInMap("sub_topic")]
        [Validation(Required=false)]
        public string SubTopic { get; set; }

        // mqtt的topic
        [NameInMap("pub_topic")]
        [Validation(Required=false)]
        public string PubTopic { get; set; }

        // mqtt的groupId
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

    }

}
