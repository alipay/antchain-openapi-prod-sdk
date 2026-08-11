// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 项目成员
    public class Member : TeaModel {
        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0000461041</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 登录名
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:hpat684@alitest.xyz">hpat684@alitest.xyz</a></para>
        /// </summary>
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 项目ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>00004606871785921985864</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-05-22 10:18:40</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

    }

}
