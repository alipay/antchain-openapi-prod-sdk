// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class QueryProductsResponse : TeaModel {
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

        // 产品列表
        [NameInMap("products")]
        [Validation(Required=true)]
        public List<Product> Products { get; set; }

        // 当前页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public int? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public int? PageSize { get; set; }

        // 记录总数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public int? TotalCount { get; set; }

    }

}
