// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BindIpShopResponse : TeaModel {
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

        // 淘宝店铺数据授权跳转链接
        [NameInMap("auth_uri")]
        [Validation(Required=false)]
        public string AuthUri { get; set; }

        // 授权申请的内部编码
        [NameInMap("item_code")]
        [Validation(Required=false)]
        public string ItemCode { get; set; }

    }

}
