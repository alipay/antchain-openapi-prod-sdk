// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权协议信息
    public class AgreementConfigInfoDTO : TeaModel {
        // 协议名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAgreementName</para>
        /// </summary>
        [NameInMap("agreement_name")]
        [Validation(Required=true)]
        public string AgreementName { get; set; }

        // 协议链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAgreementUrl</para>
        /// </summary>
        [NameInMap("agreement_url")]
        [Validation(Required=true)]
        public string AgreementUrl { get; set; }

        // 协议描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAgreementDesc</para>
        /// </summary>
        [NameInMap("agreement_desc")]
        [Validation(Required=true)]
        public string AgreementDesc { get; set; }

        // 协议版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

    }

}
