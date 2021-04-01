// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class RebootDidNotificationConsumerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // method： POST
        // applicatoin/json
        [NameInMap("call_back_url")]
        [Validation(Required=true)]
        public string CallBackUrl { get; set; }

        // 注册是得到的consumer_id
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 重新从哪个高度开始同步信息，目前did messager只保留1周之内的数据，所以这个高度如果早于一周，会返回异常。
        [NameInMap("restart_block_height")]
        [Validation(Required=true)]
        public long? RestartBlockHeight { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
