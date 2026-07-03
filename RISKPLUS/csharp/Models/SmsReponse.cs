// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 云通信短信发送结果
    public class SmsReponse : TeaModel {
        // 发送回执ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>696108134003934432^0</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 请求状态码; OK表示成功, 其他表示失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 是否调用接口成功的描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 请求ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>EF2DE797-B632-5DCF-8502-600959436E77</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
