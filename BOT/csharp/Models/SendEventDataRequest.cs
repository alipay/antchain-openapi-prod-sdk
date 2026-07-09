// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SendEventDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 事件数据列表
        [NameInMap("event_data_list")]
        [Validation(Required=true)]
        public List<EventData> EventDataList { get; set; }

        // 事件数据领域参数
        [NameInMap("event_specs")]
        [Validation(Required=true)]
        public EventSpecs EventSpecs { get; set; }

    }

}
