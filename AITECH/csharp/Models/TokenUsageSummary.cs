// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 单次接口请求内的模型 token 汇总。
    public class TokenUsageSummary : TeaModel {
        // 标识该对象是请求级汇总，便于 BI 侧过滤代理阶段日志。
        /// <summary>
        /// <b>Example:</b>
        /// <para>REQUEST</para>
        /// </summary>
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 提示词token
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("prompt_tokens")]
        [Validation(Required=false)]
        public long? PromptTokens { get; set; }

        // 模型生成回答时输出的 token 数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("completion_tokens")]
        [Validation(Required=false)]
        public long? CompletionTokens { get; set; }

        // 总tokens
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=false)]
        public long? TotalTokens { get; set; }

        // 护栏内部模型（含 Embedding）总 token。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("guard_total_tokens")]
        [Validation(Required=false)]
        public long? GuardTotalTokens { get; set; }

        // 代理转发的上游大模型总 token。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("upstream_total_tokens")]
        [Validation(Required=false)]
        public long? UpstreamTotalTokens { get; set; }

        // 已实际发起的模型调用数，包括尚未返回的调用
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("model_call_count")]
        [Validation(Required=false)]
        public long? ModelCallCount { get; set; }

        // 能够确定 total_tokens 的模型调用数。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("reported_call_count")]
        [Validation(Required=false)]
        public long? ReportedCallCount { get; set; }

        // 已结束但无法确定 total_tokens 的模型调用数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("unreported_call_count")]
        [Validation(Required=false)]
        public long? UnreportedCallCount { get; set; }

        // 当前快照时仍在执行的模型调用数。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("in_flight_call_count")]
        [Validation(Required=false)]
        public long? InFlightCallCount { get; set; }

        // 仅当所有已发起调用都结束且均能确定 total_tokens，并且业务未发生提前返回时为 true。
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("complete")]
        [Validation(Required=false)]
        public bool? Complete { get; set; }

    }

}
