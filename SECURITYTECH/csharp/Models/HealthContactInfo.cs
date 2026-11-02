// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 健康联系人信息
    public class HealthContactInfo : TeaModel {
        // 联系人业务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1749795036983016</para>
        /// </summary>
        [NameInMap("contact_id")]
        [Validation(Required=false)]
        public string ContactId { get; set; }

        // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 联系人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13027589188</para>
        /// </summary>
        [NameInMap("contact_phone")]
        [Validation(Required=false)]
        public string ContactPhone { get; set; }

        // 是否锁定 - 锁定时不允许c端用户修改联系人信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("locked")]
        [Validation(Required=false)]
        public bool? Locked { get; set; }

        // 预留可扩展字段json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
