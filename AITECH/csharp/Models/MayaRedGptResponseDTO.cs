// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // maya响应体
    public class MayaRedGptResponseDTO : TeaModel {
        // 消息的ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 请求ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>4564546</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 会话ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>312414124</para>
        /// </summary>
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 应答内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>你可以问我信息安全的问题</para>
        /// </summary>
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

        // 应答内容格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>PLAINTEXT</para>
        /// </summary>
        [NameInMap("answer_format")]
        [Validation(Required=true)]
        public string AnswerFormat { get; set; }

        // 是否回答结束
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("answer_end")]
        [Validation(Required=true)]
        public bool? AnswerEnd { get; set; }

        // 是否问题有风险
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("safe")]
        [Validation(Required=true)]
        public bool? Safe { get; set; }

    }

}
