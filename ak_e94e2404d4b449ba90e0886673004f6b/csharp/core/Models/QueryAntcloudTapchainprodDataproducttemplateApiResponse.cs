// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_e94e2404d4b449ba90e0886673004f6b.Models
{
    public class QueryAntcloudTapchainprodDataproducttemplateApiResponse : TeaModel {
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

        // json结果，具体出参结构根据模板接口的出参的配置。
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
