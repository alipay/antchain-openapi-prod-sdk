// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class GetProductSaassdkResponse : TeaModel {
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

        // 当前的sdk版本
        [NameInMap("current_version")]
        [Validation(Required=false)]
        public string CurrentVersion { get; set; }

        // 要发布的版本
        [NameInMap("publish_version")]
        [Validation(Required=false)]
        public string PublishVersion { get; set; }

        // 打包是否正在进行
        [NameInMap("task_running")]
        [Validation(Required=false)]
        public bool? TaskRunning { get; set; }

        // 已经过发布的sdk
        [NameInMap("published_sdks")]
        [Validation(Required=false)]
        public List<MultiSdkItem> PublishedSdks { get; set; }

        // 任务状态
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 任务码
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
