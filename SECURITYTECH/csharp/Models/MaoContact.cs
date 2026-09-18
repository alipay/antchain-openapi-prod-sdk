// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻联系人
    public class MaoContact : TeaModel {
        // 联系人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>联系人姓名</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 联系人手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>联系人手机号</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 联系人邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para>联系人邮箱</para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 联系人身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>联系人身份证号</para>
        /// </summary>
        [NameInMap("id_card")]
        [Validation(Required=false)]
        public string IdCard { get; set; }

        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>角色</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

    }

}
