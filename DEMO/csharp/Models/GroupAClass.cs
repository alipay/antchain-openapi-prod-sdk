// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // groupA分组结构体
    public class GroupAClass : TeaModel {
        // -
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 防伪码类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>103001</para>
        /// </summary>
        [NameInMap("code_type")]
        [Validation(Required=true)]
        public string CodeType { get; set; }

        // 防伪码码值
        /// <summary>
        /// <b>Example:</b>
        /// <para>600011111</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
