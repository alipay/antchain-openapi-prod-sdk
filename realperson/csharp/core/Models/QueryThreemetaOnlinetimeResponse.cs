// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryThreemetaOnlinetimeResponse : TeaModel {
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

        // 在网时长标准码，规则：
        // 1: [0,3)表示在⽹时⻓是 0~3 个⽉
        // 2: [3,6)表示在⽹时⻓是 3~6 个⽉
        // 3: [6,12)表示在⽹时⻓是 6~12 个⽉
        // 4: [12,24)表示在⽹时⻓是 12~24 ⽉
        // 5: [24,+)表示在⽹时⻓是 24个⽉及以上
        [NameInMap("length_code")]
        [Validation(Required=false)]
        public string LengthCode { get; set; }

        // CHINA_TELECOM：中国电信
        // CHINA_MOBILE：中国移动
        // CHINA_UNICOM：中国联通
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 扩展信息，json格式
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
