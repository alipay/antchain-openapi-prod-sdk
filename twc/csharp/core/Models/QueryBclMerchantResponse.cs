// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclMerchantResponse : TeaModel {
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

        // 入驻状态：入驻中：EXEC（表示等待商家去支付宝平台签约）；SUCCESS：入驻成功；FAIL：入驻失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 是否需要使用租赁代扣
        [NameInMap("need_proxy_withholding")]
        [Validation(Required=false)]
        public bool? NeedProxyWithholding { get; set; }

        // 入驻失败的原因，在入驻失败时才会有值
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
