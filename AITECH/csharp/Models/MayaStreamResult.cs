// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // maya流式响应结果
    public class MayaStreamResult : TeaModel {
        // maya响应数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public MayaRedGptResponseDTO Data { get; set; }

        // 是否成功
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>10002</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>maya平台调用失败</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

    }

}
