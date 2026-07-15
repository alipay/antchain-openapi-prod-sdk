// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 证书批量颁发进度
    public class CertIssueProgressDTO : TeaModel {
        // 证书实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>b99e641b2d6d45ac90600fd958e8bc3a</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 存证ID，如果颁发失败，此值为null
        /// <summary>
        /// <b>Example:</b>
        /// <para>vc:mychain:xxxxxx</para>
        /// </summary>
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
        // 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
        // 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
        // 可重试 0
        // 执行中（初始状态） 1
        // 已成功完成 2
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // is_error=true时的错误描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>标题格式不正确</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        // 证书的字段标题列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[身份证号,姓名,证书字段1]</para>
        /// </summary>
        [NameInMap("titles")]
        [Validation(Required=true)]
        public List<string> Titles { get; set; }

        // 颁发进度百分比
        /// <summary>
        /// <b>Example:</b>
        /// <para>0-100</para>
        /// </summary>
        [NameInMap("progress_percent")]
        [Validation(Required=true)]
        public long? ProgressPercent { get; set; }

        // 当前批次数据总行数（不含标题）
        /// <summary>
        /// <b>Example:</b>
        /// <para>0-5000</para>
        /// </summary>
        [NameInMap("total_num")]
        [Validation(Required=true)]
        public string TotalNum { get; set; }

        // 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
        /// <summary>
        /// <b>Example:</b>
        /// <para>VERIFY、ISSUE</para>
        /// </summary>
        [NameInMap("cur_task_type")]
        [Validation(Required=true)]
        public string CurTaskType { get; set; }

        // 颁发开始的时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>18123123123123</para>
        /// </summary>
        [NameInMap("start_time_millis")]
        [Validation(Required=true)]
        public long? StartTimeMillis { get; set; }

        // 颁发结束的时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>182371293192831</para>
        /// </summary>
        [NameInMap("end_time_millis")]
        [Validation(Required=true)]
        public long? EndTimeMillis { get; set; }

        // 校验错误描述列表
        [NameInMap("error_details")]
        [Validation(Required=true)]
        public List<TemplateInstanceErrorDetailDTO> ErrorDetails { get; set; }

    }

}
