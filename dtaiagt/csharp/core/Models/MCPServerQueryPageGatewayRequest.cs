// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // MCP已订阅清单Request
    public class MCPServerQueryPageGatewayRequest : TeaModel {
        // 空间id
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 运行模式
        [NameInMap("run_mode")]
        [Validation(Required=false)]
        public string RunMode { get; set; }

        // 来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 查询条件
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
