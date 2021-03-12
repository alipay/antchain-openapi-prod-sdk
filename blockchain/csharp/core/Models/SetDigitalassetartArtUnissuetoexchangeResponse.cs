// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SetDigitalassetartArtUnissuetoexchangeResponse : TeaModel {
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

        // 取消在交易所发布艺术品成功或者失败原因详情
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 取消在交易发布艺术品调用是否成功
        // 0 表示成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
