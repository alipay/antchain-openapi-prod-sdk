// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBaicorpInternalsearchlibraryResponse : TeaModel {
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

        // NoucelId
        [NameInMap("custom_id")]
        [Validation(Required=false)]
        public string CustomId { get; set; }

        // 采用的模型以及版本说明
        [NameInMap("model_info")]
        [Validation(Required=false)]
        public string ModelInfo { get; set; }

        // 重复列表，json list格式
        [NameInMap("repeat_info")]
        [Validation(Required=false)]
        public string RepeatInfo { get; set; }

        // 相似度信息列表，json list格式
        [NameInMap("similarity_info")]
        [Validation(Required=false)]
        public string SimilarityInfo { get; set; }

    }

}
