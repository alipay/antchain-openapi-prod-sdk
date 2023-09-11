// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class BindResourceGeneralresourcefileResponse : TeaModel {
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

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 文件下载地址
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // md5摘要值
        [NameInMap("md5")]
        [Validation(Required=false)]
        public string Md5 { get; set; }

        // 文件大小
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

    }

}
