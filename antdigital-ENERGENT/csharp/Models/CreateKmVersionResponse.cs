// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class CreateKmVersionResponse : TeaModel {
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

        // 版本ID
        [NameInMap("version_id")]
        [Validation(Required=false)]
        public string VersionId { get; set; }

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 版本状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 发布任务总数
        [NameInMap("total_task_count")]
        [Validation(Required=false)]
        public long? TotalTaskCount { get; set; }

        // 已完成任务数
        [NameInMap("completed_count")]
        [Validation(Required=false)]
        public long? CompletedCount { get; set; }

    }

}
