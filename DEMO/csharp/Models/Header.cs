// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 头文件
    public class Header : TeaModel {
        // 身份信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;identity&quot;: {       &quot;ak&quot;: &quot;test_0efe42463f8f&quot;     }</para>
        /// </summary>
        [NameInMap("identity")]
        [Validation(Required=true)]
        public Identity Identity { get; set; }

        // 调用链编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_6db79b5d2e48</para>
        /// </summary>
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // host信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;host&quot;: {       &quot;systemName&quot;: &quot;test_2e1ae924805f&quot;,       &quot;address&quot;: &quot;test_941f18a4013b&quot;     }</para>
        /// </summary>
        [NameInMap("host")]
        [Validation(Required=true)]
        public Host Host { get; set; }

        // 方向
        /// <summary>
        /// <b>Example:</b>
        /// <para>REQUEST</para>
        /// </summary>
        [NameInMap("direction")]
        [Validation(Required=true)]
        public string Direction { get; set; }

        // 请求类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVOKE</para>
        /// </summary>
        [NameInMap("request_type")]
        [Validation(Required=true)]
        public string RequestType { get; set; }

        // 协议版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_6709e9002606</para>
        /// </summary>
        [NameInMap("protocol_version")]
        [Validation(Required=true)]
        public string ProtocolVersion { get; set; }

    }

}
