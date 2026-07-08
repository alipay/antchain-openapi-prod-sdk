// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据授权策略
    public class AuthorizePolicy : TeaModel {
        // 授权策略ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

        // 授权策略描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 授权策略配置
        /// <summary>
        /// <b>Example:</b>
        /// <para>授权策略配置</para>
        /// </summary>
        [NameInMap("authorize_config")]
        [Validation(Required=true)]
        public string AuthorizeConfig { get; set; }

    }

}
