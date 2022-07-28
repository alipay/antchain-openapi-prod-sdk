// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 监测任务信息
    public class MonitorTask : TeaModel {
        // 内容表述
        // 
        // 
        [NameInMap("content_desc")]
        [Validation(Required=false)]
        public string ContentDesc { get; set; }

        // 监测任务标题
        // 
        // 
        [NameInMap("content_title")]
        [Validation(Required=false)]
        public string ContentTitle { get; set; }

        // 监测文件时长，主要用于视频监测、音频监测的时长记录
        [NameInMap("file_length_in_second")]
        [Validation(Required=false)]
        public long? FileLengthInSecond { get; set; }

        // 监测关键字
        // 
        // 
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public List<string> Keywords { get; set; }

        // 监测任务ID
        // 
        [NameInMap("monitor_task_id")]
        [Validation(Required=true)]
        public string MonitorTaskId { get; set; }

        // 任务名称
        // 
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 监测供应商id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 监测结果数量
        // 
        // 
        [NameInMap("result_count")]
        [Validation(Required=false)]
        public long? ResultCount { get; set; }

        // 监测范围
        // 
        // 
        [NameInMap("scopes")]
        [Validation(Required=true)]
        public List<string> Scopes { get; set; }

        // 任务状态
        // 
        // INIT
        // 
        // WORKING
        // 
        // FINISH
        // 
        // FAILURE
        // 
        // DELETE
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 监测时长(天)
        // 
        // 
        [NameInMap("task_duration")]
        [Validation(Required=true)]
        public long? TaskDuration { get; set; }

        // 任务结束时间
        // 
        // 
        [NameInMap("task_end")]
        [Validation(Required=false)]
        public long? TaskEnd { get; set; }

        // 任务开始时间
        // 
        // 
        [NameInMap("task_start")]
        [Validation(Required=false)]
        public long? TaskStart { get; set; }

        // 文件类别
        // 
        // IMAGE
        // 
        // TEXT
        // 
        // VIDEO
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // submitType是url就是url地址 submitType 是file就是oss fileId
        [NameInMap("submit_content")]
        [Validation(Required=true)]
        public string SubmitContent { get; set; }

        // 提交任务的类型:FILE/URL
        // 不填为FILE
        // FILE表示文件上传素材，URL表示上传URL
        [NameInMap("submit_type")]
        [Validation(Required=false)]
        public string SubmitType { get; set; }

        // 当status为failure时的具体错误信息（中文描述）
        [NameInMap("failure_msg")]
        [Validation(Required=false)]
        public string FailureMsg { get; set; }

        // 当status为failure时的具体错误信息（错误枚举）
        [NameInMap("failure_code")]
        [Validation(Required=false)]
        public string FailureCode { get; set; }

    }

}
