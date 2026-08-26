// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class ListAntcloudOfferInstanceResponse : TeaModel {
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

        // 当前页实例列表（含规格明细
        [NameInMap("instances")]
        [Validation(Required=false)]
        public List<Instance> Instances { get; set; }

        // 下一页游标。空字符串 表示无更多数据
        [NameInMap("next_cursor")]
        [Validation(Required=false)]
        public string NextCursor { get; set; }

        // 是否有下一页（便于客户端控制循环）
        [NameInMap("has_more")]
        [Validation(Required=false)]
        public bool? HasMore { get; set; }

    }

}
