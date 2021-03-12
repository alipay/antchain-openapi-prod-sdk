// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationDataentityPageResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 分页数据列表
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<ListDataEntityResult> Data { get; set; }

        // 是否有下一页
        [NameInMap("has_next_page")]
        [Validation(Required=false)]
        public bool? HasNextPage { get; set; }

        // 是否有上一页
        [NameInMap("has_previous_page")]
        [Validation(Required=false)]
        public bool? HasPreviousPage { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 数据总量
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
