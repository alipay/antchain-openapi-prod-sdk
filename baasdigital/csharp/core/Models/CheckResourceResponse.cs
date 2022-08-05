// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class CheckResourceResponse : TeaModel {
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

        // 可公开访问的资源地址。为空则表示暂时无法访问
        [NameInMap("access_url")]
        [Validation(Required=false)]
        public string AccessUrl { get; set; }

        // upload：文件已上传
        // check：内容检测中
        // invalid：图片不可访问
        // pass：可公开访问
        // publish：已绑定至某个项目
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
