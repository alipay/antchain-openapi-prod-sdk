// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryPlanResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<string> List { get; set; }

        // page_no
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // total_size
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

    }

}
