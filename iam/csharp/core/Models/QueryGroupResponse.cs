// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryGroupResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 授权组列表
        [NameInMap("groups")]
        [Validation(Required=true)]
        public List<AuthGroup> Groups { get; set; }

        // 当前页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public int? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public int? PageSize { get; set; }

        // 应用总数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public int? TotalCount { get; set; }

    }

}
