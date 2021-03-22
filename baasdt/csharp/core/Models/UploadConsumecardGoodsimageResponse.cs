// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UploadConsumecardGoodsimageResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 临时可访问的url列表，过期时间2小时
        [NameInMap("temporary_urls")]
        [Validation(Required=false)]
        public List<string> TemporaryUrls { get; set; }

        // 图片的不可访问url列表，发布商品时使用
        [NameInMap("urls")]
        [Validation(Required=false)]
        public List<string> Urls { get; set; }

    }

}
