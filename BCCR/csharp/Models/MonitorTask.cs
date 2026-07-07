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
        /// <summary>
        /// <b>Example:</b>
        /// <para>wert</para>
        /// </summary>
        [NameInMap("content_desc")]
        [Validation(Required=false)]
        public string ContentDesc { get; set; }

        // 监测任务标题
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>awe</para>
        /// </summary>
        [NameInMap("content_title")]
        [Validation(Required=false)]
        public string ContentTitle { get; set; }

        // 监测文件时长，主要用于视频监测、音频监测的时长记录
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("file_length_in_second")]
        [Validation(Required=false)]
        public long? FileLengthInSecond { get; set; }

        // 监测关键字
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111111</para>
        /// </summary>
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public List<string> Keywords { get; set; }

        // 监测任务ID
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111111</para>
        /// </summary>
        [NameInMap("monitor_task_id")]
        [Validation(Required=true)]
        public string MonitorTaskId { get; set; }

        // 任务名称
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111111</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 监测供应商id
        /// <summary>
        /// <b>Example:</b>
        /// <para>GOODEYE</para>
        /// </summary>
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 监测结果数量
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("result_count")]
        [Validation(Required=false)]
        public long? ResultCount { get; set; }

        // 监测范围
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111111</para>
        /// </summary>
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
        /// <summary>
        /// <b>Example:</b>
        /// <para>WORKING</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 监测时长(天)
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("task_duration")]
        [Validation(Required=true)]
        public long? TaskDuration { get; set; }

        // 任务结束时间
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592807928</para>
        /// </summary>
        [NameInMap("task_end")]
        [Validation(Required=false)]
        public long? TaskEnd { get; set; }

        // 任务开始时间
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592807928</para>
        /// </summary>
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
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // submitType是url就是url地址 submitType 是file就是oss fileId
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("submit_content")]
        [Validation(Required=true)]
        public string SubmitContent { get; set; }

        // 提交任务的类型:FILE/URL
        // 不填为FILE
        // FILE表示文件上传素材，URL表示上传URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>FILE</para>
        /// </summary>
        [NameInMap("submit_type")]
        [Validation(Required=false)]
        public string SubmitType { get; set; }

        // 当status为failure时的具体错误信息（中文描述）
        /// <summary>
        /// <b>Example:</b>
        /// <para>error</para>
        /// </summary>
        [NameInMap("failure_msg")]
        [Validation(Required=false)]
        public string FailureMsg { get; set; }

        // 当status为failure时的具体错误信息（错误枚举）
        /// <summary>
        /// <b>Example:</b>
        /// <para>SERVER_ERROR</para>
        /// </summary>
        [NameInMap("failure_code")]
        [Validation(Required=false)]
        public string FailureCode { get; set; }

    }

}
