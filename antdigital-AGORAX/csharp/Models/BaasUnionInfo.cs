// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // BaaS平台联盟信息
    public class BaasUnionInfo : TeaModel {
        // 联盟名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("union_name")]
        [Validation(Required=true)]
        public string UnionName { get; set; }

        // 描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("union_description")]
        [Validation(Required=true)]
        public string UnionDescription { get; set; }

        // 联系人
        /// <summary>
        /// <b>Example:</b>
        /// <para>联系人</para>
        /// </summary>
        [NameInMap("union_user")]
        [Validation(Required=true)]
        public string UnionUser { get; set; }

        // 联盟联系人手机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟联系人手机号码</para>
        /// </summary>
        [NameInMap("union_user_cell")]
        [Validation(Required=true)]
        public string UnionUserCell { get; set; }

        // 联盟联系人邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟联系人邮箱</para>
        /// </summary>
        [NameInMap("union_user_mail")]
        [Validation(Required=true)]
        public string UnionUserMail { get; set; }

    }

}
