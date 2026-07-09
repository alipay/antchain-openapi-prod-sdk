// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SendLabelTransferrawonasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 收集的标签流转数据
        [NameInMap("collect_label_raw_content_list")]
        [Validation(Required=true)]
        public List<CollectLabelRawContent> CollectLabelRawContentList { get; set; }

        // 业务号，防重放
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 1 业务端查询结果的最晚时间 2 单位：天，最大值为30 天 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
        [NameInMap("response_period")]
        [Validation(Required=true)]
        public long? ResponsePeriod { get; set; }

    }

}
