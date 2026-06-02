// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    // 子任务列表
    public class SubTasks : TeaModel {
        // 子任务ID
        [NameInMap("sub_task_id")]
        [Validation(Required=true)]
        public long? SubTaskId { get; set; }

        // 子任务名称
        [NameInMap("sub_task_name")]
        [Validation(Required=true)]
        public string SubTaskName { get; set; }

        // 目标翻译语言
        [NameInMap("target_language")]
        [Validation(Required=true)]
        public string TargetLanguage { get; set; }

        // 子任务状态包括：PENDING（待执行）、EXECUTING（执行中）、FAILED（失败）、COMPLETED（已完成）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 源语言
        [NameInMap("source_language")]
        [Validation(Required=true)]
        public string SourceLanguage { get; set; }

        // 翻译后视频地址
        [NameInMap("output_video_url")]
        [Validation(Required=false)]
        public string OutputVideoUrl { get; set; }

        // 翻译前字幕文件地址
        [NameInMap("original_subtitle_url")]
        [Validation(Required=false)]
        public string OriginalSubtitleUrl { get; set; }

        // 翻译后字幕文件地址
        [NameInMap("translated_subtitle_url")]
        [Validation(Required=false)]
        public string TranslatedSubtitleUrl { get; set; }

        // 视频时长（秒）
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public long? DurationSeconds { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

    }

}
