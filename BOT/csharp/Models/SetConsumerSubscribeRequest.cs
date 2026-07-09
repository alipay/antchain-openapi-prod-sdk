// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SetConsumerSubscribeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 消费者Id
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 订阅的发行设备Id列表
        [NameInMap("distribute_device_id_list")]
        [Validation(Required=true)]
        public List<string> DistributeDeviceIdList { get; set; }

    }

}
