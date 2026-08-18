// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 任务结果详情
    public class TaskResultInfoDto : TeaModel {
        // 任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1798234932684395</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 模型名称与版本
        // 格式为 模型名称-版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>doubao-seedance-2-0-260128</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 任务状态
        // + creating: 任务创建中
        // + queued：排队中
        // + running：任务运行中
        // + cancelled：取消任务，取消状态 24h 自动删除（只支持排队中状态的任务被取消）
        // + succeeded：任务成功
        // + failed：任务失败
        // + expired：任务超时
        /// <summary>
        /// <b>Example:</b>
        /// <para>creating</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 错误信息（任务失败时返回错误数据）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("error")]
        [Validation(Required=false)]
        public TaskErrorDto Error { get; set; }

        // 输出内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public ContentInfoDto Content { get; set; }

        // token 用量
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("usage")]
        [Validation(Required=false)]
        public TokenUsageDto Usage { get; set; }

        // 视频时长（秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 视频帧数
        // 说明： duration 和 frames 参数只会返回一个 。
        /// <summary>
        /// <b>Example:</b>
        /// <para>323</para>
        /// </summary>
        [NameInMap("frames")]
        [Validation(Required=false)]
        public long? Frames { get; set; }

        // 分辨率
        /// <summary>
        /// <b>Example:</b>
        /// <para>4k</para>
        /// </summary>
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public string Resolution { get; set; }

        // 宽高比
        /// <summary>
        /// <b>Example:</b>
        /// <para>4:3</para>
        /// </summary>
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 随机种子
        /// <summary>
        /// <b>Example:</b>
        /// <para>233</para>
        /// </summary>
        [NameInMap("seed")]
        [Validation(Required=false)]
        public long? Seed { get; set; }

        // 视频帧率
        /// <summary>
        /// <b>Example:</b>
        /// <para>321</para>
        /// </summary>
        [NameInMap("framespersecond")]
        [Validation(Required=true)]
        public long? Framespersecond { get; set; }

        // 是否生成同步音频
        /// <summary>
        /// <b>Example:</b>
        /// <para>false</para>
        /// </summary>
        [NameInMap("generate_audio")]
        [Validation(Required=false)]
        public bool? GenerateAudio { get; set; }

        // 服务等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>default</para>
        /// </summary>
        [NameInMap("service_tier")]
        [Validation(Required=false)]
        public string ServiceTier { get; set; }

        // 任务超时阈值（秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>23543</para>
        /// </summary>
        [NameInMap("execution_expires_after")]
        [Validation(Required=false)]
        public long? ExecutionExpiresAfter { get; set; }

        // 执行优先级
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 终端用户标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>tools</para>
        /// </summary>
        [NameInMap("safety_identifier")]
        [Validation(Required=false)]
        public string SafetyIdentifier { get; set; }

        // 任务实际创建时间 格式 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-10 10:09:01</para>
        /// </summary>
        [NameInMap("created_at")]
        [Validation(Required=false)]
        public string CreatedAt { get; set; }

        // 更新时间  格式 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-10 10:09:01</para>
        /// </summary>
        [NameInMap("updated_at")]
        [Validation(Required=false)]
        public string UpdatedAt { get; set; }

        // 实际使用的工具
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("tools")]
        [Validation(Required=false)]
        public List<ModelToolDto> Tools { get; set; }

    }

}
