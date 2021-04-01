// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidAgentServicediscoveryResponse : TeaModel {
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

        // 当前页数
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 服务列表
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<DisServiceInfo> Services { get; set; }

        // 总个数
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public long? TotalNum { get; set; }

        // 总页数
        [NameInMap("total_page")]
        [Validation(Required=false)]
        public long? TotalPage { get; set; }

    }

}
