// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidNotificationConsumerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        //  事件发生时的回调路径，必须满足：
        // metho：POST
        // Content-Type：application/json
        [NameInMap("call_back_url")]
        [Validation(Required=true)]
        public string CallBackUrl { get; set; }

        // 关注的did；这个did必须是调用者自己的did，也可以是托管给调用者的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 1 所有相关事件， 
        // 2 所有相关did事件，
        // 3 所有相关vc事件，
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
