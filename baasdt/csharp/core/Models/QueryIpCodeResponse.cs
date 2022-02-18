// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpCodeResponse : TeaModel {
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

        // 数字凭证信息
        [NameInMap("code_info")]
        [Validation(Required=false)]
        public IPCodeScannedInfo CodeInfo { get; set; }

        // 首次扫码信息
        [NameInMap("first_scanned_info")]
        [Validation(Required=false)]
        public IPSimpleScannedInfo FirstScannedInfo { get; set; }

        // 扫码信息
        [NameInMap("scanned_info_list")]
        [Validation(Required=false)]
        public List<IPSimpleScannedInfo> ScannedInfoList { get; set; }

        // 扫码次数
        [NameInMap("scanned_count")]
        [Validation(Required=false)]
        public long? ScannedCount { get; set; }

    }

}
