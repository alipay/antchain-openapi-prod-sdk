// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryApplicationResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 应用列表
        [NameInMap("applications")]
        [Validation(Required=false)]
        public List<ApplicationInfo> Applications { get; set; }

        // 当前页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 资源总数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
