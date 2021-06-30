// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpGoodsgalleryResponse : TeaModel {
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

        // 图库链接
        [NameInMap("ip_gallery_url")]
        [Validation(Required=false)]
        public string IpGalleryUrl { get; set; }

        // 图库临时下载链接，过期时间2小时
        [NameInMap("ip_gallery_temporary_url")]
        [Validation(Required=false)]
        public string IpGalleryTemporaryUrl { get; set; }

    }

}
