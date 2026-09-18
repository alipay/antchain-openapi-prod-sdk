// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT请求头
    public class RequestHead : TeaModel {
        // 请求唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>91440300892305861T</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 客户身份标识ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>91440300892305861T</para>
        /// </summary>
        [NameInMap("secret_id")]
        [Validation(Required=true)]
        public string SecretId { get; set; }

        // 客户签约产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>RDDB04201PR</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // response输出类型，默认json
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;tlv&quot;</para>
        /// </summary>
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public string FormatType { get; set; }

        // false
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("online_flag")]
        [Validation(Required=false)]
        public bool? OnlineFlag { get; set; }

    }

}
