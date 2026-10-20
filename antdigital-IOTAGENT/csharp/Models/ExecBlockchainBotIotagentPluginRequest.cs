// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ExecBlockchainBotIotagentPluginRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dt-plugin
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // audio_scribe
        [NameInMap("target_plugin_id")]
        [Validation(Required=true)]
        public string TargetPluginId { get; set; }

        [NameInMap("message_type")]
        [Validation(Required=true)]
        public string MessageType { get; set; }

        // 业务数据，JSON格式
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

        // Unix Epoch 毫秒
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
