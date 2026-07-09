// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushDeviceAudioRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备序列化
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // 设备厂商
        [NameInMap("device_corp")]
        [Validation(Required=false)]
        public string DeviceCorp { get; set; }

        // 推送消息主题
        [NameInMap("topic_identifer")]
        [Validation(Required=true)]
        public string TopicIdentifer { get; set; }

        // 推送消息类型
        [NameInMap("mesage_type")]
        [Validation(Required=true)]
        public string MesageType { get; set; }

        // 消息内容
        [NameInMap("message_content")]
        [Validation(Required=true)]
        public string MessageContent { get; set; }

        // 业务场景-项目
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 设备唯一ID
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // kyt硬件唯一ID
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

    }

}
