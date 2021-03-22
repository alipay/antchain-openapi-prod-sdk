// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecMypointsOrderskuResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 卡密ID
        [NameInMap("card_id")]
        [Validation(Required=false)]
        public string CardId { get; set; }

        // 集分宝卡密的面值(单位:个)
        [NameInMap("card_value")]
        [Validation(Required=false)]
        public long? CardValue { get; set; }

        // 是否需要重试
        [NameInMap("need_retry")]
        [Validation(Required=false)]
        public bool? NeedRetry { get; set; }

        // 业务幂等ID
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

    }

}
