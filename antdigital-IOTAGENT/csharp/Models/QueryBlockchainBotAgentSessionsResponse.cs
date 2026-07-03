// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class QueryBlockchainBotAgentSessionsResponse : TeaModel {
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

        // 分页结果总数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 当前页码 （从第一页开始）
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总页数
        [NameInMap("pages")]
        [Validation(Required=false)]
        public long? Pages { get; set; }

        // 会话集合
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<AgentSessionVO> List { get; set; }

    }

}
