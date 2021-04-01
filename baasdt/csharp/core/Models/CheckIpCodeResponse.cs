// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CheckIpCodeResponse : TeaModel {
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

        // 被扫描的次数(包含本次)
        [NameInMap("scanned_count")]
        [Validation(Required=false)]
        public long? ScannedCount { get; set; }

        // 扫描历史列表(仅展示最近扫描的50次信息)
        [NameInMap("scanned_list")]
        [Validation(Required=false)]
        public List<IPCodeScannedInfo> ScannedList { get; set; }

    }

}
