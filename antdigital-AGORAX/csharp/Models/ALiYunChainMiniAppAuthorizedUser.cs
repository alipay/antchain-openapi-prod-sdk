// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链小程序用户权限信息
    public class ALiYunChainMiniAppAuthorizedUser : TeaModel {
        // phone
        /// <summary>
        /// <b>Example:</b>
        /// <para>phone</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // gmt_authorized
        /// <summary>
        /// <b>Example:</b>
        /// <para>gmt_authorized</para>
        /// </summary>
        [NameInMap("gmt_authorized")]
        [Validation(Required=false)]
        public string GmtAuthorized { get; set; }

        // 记录id
        /// <summary>
        /// <b>Example:</b>
        /// <para>112</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public long? UserId { get; set; }

    }

}
