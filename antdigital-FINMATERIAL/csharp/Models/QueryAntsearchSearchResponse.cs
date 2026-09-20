// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryAntsearchSearchResponse : TeaModel {
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

        // 统一响应元信息
        [NameInMap("response_metadata")]
        [Validation(Required=false)]
        public ResponseMetadata ResponseMetadata { get; set; }

        // 本次的搜索结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public Result Result { get; set; }

        // 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
        [NameInMap("industry_data")]
        [Validation(Required=false)]
        public List<IndustryDataItem> IndustryData { get; set; }

    }

}
