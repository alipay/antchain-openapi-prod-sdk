// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerKnowledgecategorylibraryResponse : TeaModel {
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

        // 知识库id
        // 
        [NameInMap("library_id")]
        [Validation(Required=false)]
        public string LibraryId { get; set; }

        // 123123
        [NameInMap("library_name")]
        [Validation(Required=false)]
        public string LibraryName { get; set; }

        // 类目id
        // 
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 知识点总条数
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
