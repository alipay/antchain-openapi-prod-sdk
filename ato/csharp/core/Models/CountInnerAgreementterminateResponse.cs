// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CountInnerAgreementterminateResponse : TeaModel {
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

        // 待处理-数量
        [NameInMap("un_handle_status_num")]
        [Validation(Required=false)]
        public long? UnHandleStatusNum { get; set; }

        // 处理中-数量
        [NameInMap("handing_status_num")]
        [Validation(Required=false)]
        public long? HandingStatusNum { get; set; }

        // 已处理-数量
        [NameInMap("finished_status_num")]
        [Validation(Required=false)]
        public long? FinishedStatusNum { get; set; }

        // 已超时-数量
        [NameInMap("timeout_status_num")]
        [Validation(Required=false)]
        public long? TimeoutStatusNum { get; set; }

    }

}
