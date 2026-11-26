// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotsuccessProductKnowledgebaseResponse : TeaModel {
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

        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 映射kbName
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 映射kbDescription
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 枚举:OFFICIAL,CUSTOM
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 映射docCount
        [NameInMap("content_count")]
        [Validation(Required=true)]
        public long? ContentCount { get; set; }

        [NameInMap("paragraph_count")]
        [Validation(Required=true)]
        public long? ParagraphCount { get; set; }

        // 沿现有关联查询聚合；不新增版本账本
        [NameInMap("associated_product_keys")]
        [Validation(Required=true)]
        public List<string> AssociatedProductKeys { get; set; }

    }

}
