// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetMktExtresulturlResponse : TeaModel {
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

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 析出文件下载链接（OSS签名URL，当前有效期24小时）；为空表示析出结果尚未生成，请稍后重试。从底包上传开始7日内链接失效仍可继续获取
        [NameInMap("file_url")]
        [Validation(Required=false, MaxLength=1024)]
        public string FileUrl { get; set; }

    }

}
