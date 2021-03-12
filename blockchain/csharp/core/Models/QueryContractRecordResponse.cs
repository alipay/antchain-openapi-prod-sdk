// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryContractRecordResponse : TeaModel {
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

        // 当前页元素列表
        [NameInMap("content")]
        [Validation(Required=false)]
        public List<ContractRecord> Content { get; set; }

        // 当前页号
        [NameInMap("number")]
        [Validation(Required=false)]
        public string Number { get; set; }

        // 当前页大小
        [NameInMap("size")]
        [Validation(Required=false)]
        public string Size { get; set; }

        // 元素总个数
        [NameInMap("total_elements")]
        [Validation(Required=false)]
        public long? TotalElements { get; set; }

        // 总页数
        [NameInMap("total_pages")]
        [Validation(Required=false)]
        public long? TotalPages { get; set; }

    }

}
