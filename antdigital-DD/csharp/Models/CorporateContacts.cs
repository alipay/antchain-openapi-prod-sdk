// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 公司联系人
    public class CorporateContacts : TeaModel {
        // 职务
        /// <summary>
        /// <b>Example:</b>
        /// <para>总经理</para>
        /// </summary>
        [NameInMap("job_title")]
        [Validation(Required=false)]
        public string JobTitle { get; set; }

        // 姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>15888888888</para>
        /// </summary>
        [NameInMap("mobile_phone")]
        [Validation(Required=false)]
        public string MobilePhone { get; set; }

        // 邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:XXX@XXX.COM">XXX@XXX.COM</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
