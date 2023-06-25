// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateThingmodelEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 物模型事件json
        [NameInMap("thing_model_event_json")]
        [Validation(Required=true)]
        public string ThingModelEventJson { get; set; }

        // 数据样例
        [NameInMap("data_demo")]
        [Validation(Required=false)]
        public string DataDemo { get; set; }

    }

}
