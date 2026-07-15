// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 申请用户授权的目标可验证声明内容、过期时间等配置
    public class Claim : TeaModel {
        // 一个json的string，内容包含具体需要的声明，不同业务场景不同。
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;issuerName&quot;:&quot;XX有限公司&quot;,&quot;userNo&quot;:&quot;12123434&quot;}</para>
        /// </summary>
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        /// <summary>
        /// <b>Example:</b>
        /// <para>Level1</para>
        /// </summary>
        [NameInMap("claim_type")]
        [Validation(Required=false)]
        public string ClaimType { get; set; }

        // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        /// <summary>
        /// <b>Example:</b>
        /// <para>-1</para>
        /// </summary>
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214</para>
        /// </summary>
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX有限公司</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
