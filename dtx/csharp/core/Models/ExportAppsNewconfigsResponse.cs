// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class ExportAppsNewconfigsResponse : TeaModel {
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

        // 导出配置信息，json
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // 接口返回码
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 接口返回文件URL
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
