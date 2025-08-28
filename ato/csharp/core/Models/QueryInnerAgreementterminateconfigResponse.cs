// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerAgreementterminateconfigResponse : TeaModel {
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

        // 商家处理超时时长-HOUR类型时长
        [NameInMap("timeout_hour")]
        [Validation(Required=false)]
        public string TimeoutHour { get; set; }

        // 商家处理超时时长-DAY类型时长
        [NameInMap("timeout_day")]
        [Validation(Required=false)]
        public string TimeoutDay { get; set; }

    }

}
