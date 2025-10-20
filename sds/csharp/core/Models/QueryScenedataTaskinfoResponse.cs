// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class QueryScenedataTaskinfoResponse : TeaModel {
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

        // -1-无效，0-待处理，1-处理中，2-处理完成
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 业务日期
        [NameInMap("biz_date")]
        [Validation(Required=false)]
        public string BizDate { get; set; }

        // 场景
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 任务类型
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public string TaskType { get; set; }

        // 批次所属租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 来源标识
        [NameInMap("source_mark")]
        [Validation(Required=false)]
        public string SourceMark { get; set; }

        // 任务创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 批次统计结果信息
        [NameInMap("result")]
        [Validation(Required=false)]
        public TaskDetailResult Result { get; set; }

    }

}
