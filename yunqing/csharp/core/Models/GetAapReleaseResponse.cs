// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class GetAapReleaseResponse : TeaModel {
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

        // 发布单状态:
        //     TOBE_DEPLOY("TOBE_DEPLOY","待执行","待执行"),
        //     EXECUTING("EXECUTING","执行中","执行中"),
        //     SUCCESS("SUCCESS","完成","完成"),
        //     CANCELED("CANCELED","已取消","已取消"),
        //     FAILED("FAILED","失败","失败"),
        //     WAITING_CONFIRM("WAITING_CONFIRM","待确认","待确认");
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
