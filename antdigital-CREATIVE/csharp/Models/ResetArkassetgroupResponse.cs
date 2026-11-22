// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class ResetArkassetgroupResponse : TeaModel {
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

        // {"ResponseMetadata":{"RequestId":"202405142130004D5E6F708192031A2B","Action":"UpdateAssetGroup","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Id":"group-20240514212750-b5e9m"}}
        [NameInMap("response_body")]
        [Validation(Required=false)]
        public string ResponseBody { get; set; }

    }

}
