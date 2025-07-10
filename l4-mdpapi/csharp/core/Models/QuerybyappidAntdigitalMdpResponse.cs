// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDPAPI.Models
{
    public class QuerybyappidAntdigitalMdpResponse : TeaModel {
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

        // appid
        [NameInMap("appid")]
        [Validation(Required=false)]
        public string Appid { get; set; }

        // 手机号或者设备号md5
        [NameInMap("userid")]
        [Validation(Required=false)]
        public string Userid { get; set; }

        // 分数列表
        [NameInMap("scores")]
        [Validation(Required=false)]
        public List<AppIdQualityScoresDONew> Scores { get; set; }

    }

}
