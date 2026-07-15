// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarOtataskpageResponse : TeaModel {
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

        // 是否请求成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 响应编码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 响应消息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 当前页码
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 单页数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 记录总数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 页总数
        [NameInMap("total_pages")]
        [Validation(Required=false)]
        public long? TotalPages { get; set; }

        // 分页数据
        [NameInMap("page_data")]
        [Validation(Required=false)]
        public List<IotxOTATaskResponse> PageData { get; set; }

    }

}
