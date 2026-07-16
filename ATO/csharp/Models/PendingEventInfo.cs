// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 待办信息
    public class PendingEventInfo : TeaModel {
        // 事件id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345678912</para>
        /// </summary>
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 通知:NOTIFICATION
        // 确认函:CONFIRMATION
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTIFICATION</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // ("PENDING","待办中"),  ("CONFIRMED","确认"),  
        // ("REJECTED","已拒绝")
        // ("FAILED","失败"),("EXPIRED","已过期");
        /// <summary>
        /// <b>Example:</b>
        /// <para>PENDING</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 待办内容主题
        /// <summary>
        /// <b>Example:</b>
        /// <para>用信确认函</para>
        /// </summary>
        [NameInMap("content_subject")]
        [Validation(Required=false)]
        public string ContentSubject { get; set; }

        // 事件有效期开始
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-08-27 14:07:46.600</para>
        /// </summary>
        [NameInMap("effective_start_time")]
        [Validation(Required=false)]
        public string EffectiveStartTime { get; set; }

        // 事件有效期结束
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-02-19 11:03:43.786</para>
        /// </summary>
        [NameInMap("effective_end_time")]
        [Validation(Required=false)]
        public string EffectiveEndTime { get; set; }

        // 待办类型
        // text
        // link
        /// <summary>
        /// <b>Example:</b>
        /// <para>text</para>
        /// </summary>
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 待办详情，
        // content_type=text，是富文本
        // content_type=link，是fileKey,通过antchain.ato.inner.file.download获取文件访问链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>agreement/auth/BGDBWWGN/202511234567_7246.docx</para>
        /// </summary>
        [NameInMap("content_details")]
        [Validation(Required=false)]
        public string ContentDetails { get; set; }

    }

}
