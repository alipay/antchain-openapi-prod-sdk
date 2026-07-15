// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 用户数据
    public class OCUserData : TeaModel {
        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>186xxxxx</para>
        /// </summary>
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 用户姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxxx</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
