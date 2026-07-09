// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PullConsumerDatasourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 消费者id
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 分页游标
        [NameInMap("cursor")]
        [Validation(Required=true)]
        public string Cursor { get; set; }

        // 获取的时间范围
        [NameInMap("time_span")]
        [Validation(Required=false)]
        public List<string> TimeSpan { get; set; }

        // 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

    }

}
