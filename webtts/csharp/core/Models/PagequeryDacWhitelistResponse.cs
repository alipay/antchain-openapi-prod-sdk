// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class PagequeryDacWhitelistResponse : TeaModel {
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

        // 当前第几页，为前端的请求值
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 每页展示多少条，为前端的请求值
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总共有多少条数据
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 返回白名单列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<QueryWhitelistAddressResponse> List { get; set; }

    }

}
