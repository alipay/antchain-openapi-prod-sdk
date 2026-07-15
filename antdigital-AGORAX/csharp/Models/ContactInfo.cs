// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 联系人信息
    public class ContactInfo : TeaModel {
        // 联系人名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13888888888</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 电子邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:user@domain.com">user@domain.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>0571-85022088</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("id_card_no")]
        [Validation(Required=false)]
        public string IdCardNo { get; set; }

    }

}
