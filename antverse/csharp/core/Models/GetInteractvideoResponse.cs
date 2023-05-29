// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    public class GetInteractvideoResponse : TeaModel {
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

        // 视频答案URL(视频资源存储在OSS服务上,访问接口时,返回一个视频下载链接)
        [NameInMap("answer_video_url")]
        [Validation(Required=false)]
        public string AnswerVideoUrl { get; set; }

    }

}
