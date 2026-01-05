// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class CheckDacWhitelistResponse : TeaModel {
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

        // 公钥地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 支持的链列表
        [NameInMap("blockchain_list")]
        [Validation(Required=false)]
        public List<string> BlockchainList { get; set; }

        // 检查结果类型
        [NameInMap("check_result_type")]
        [Validation(Required=false)]
        public string CheckResultType { get; set; }

    }

}
