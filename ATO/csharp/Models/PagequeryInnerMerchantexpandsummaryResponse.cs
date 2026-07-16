// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerMerchantexpandsummaryResponse : TeaModel {
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

        // 数据总量
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 商户进件记录分页查询对象
        [NameInMap("merchant_expand_summary_page")]
        [Validation(Required=false)]
        public List<MerchantExpandSummaryPage> MerchantExpandSummaryPage { get; set; }

    }

}
