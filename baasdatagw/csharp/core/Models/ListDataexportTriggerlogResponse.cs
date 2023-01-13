// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class ListDataexportTriggerlogResponse : TeaModel {
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

        // -
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // -
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // -
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // -
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<TriggerLog> List { get; set; }

    }

}
