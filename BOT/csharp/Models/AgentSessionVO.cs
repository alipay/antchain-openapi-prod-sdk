// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    //  Session 视图对象
    public class AgentSessionVO : TeaModel {
        // 会话ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7468486322254688256</para>
        /// </summary>
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7468486322254688256</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 会话创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-24 21:32:59</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 会话修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-24 21:32:59</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
