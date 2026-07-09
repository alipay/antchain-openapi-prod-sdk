// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StopIotplantformProductResponse : TeaModel {
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

        // 商品计量表主键ID
        // 
        [NameInMap("meter_data_id")]
        [Validation(Required=false)]
        public long? MeterDataId { get; set; }

        // 商品实例是否处于可用状态，1可用，0不可用
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
