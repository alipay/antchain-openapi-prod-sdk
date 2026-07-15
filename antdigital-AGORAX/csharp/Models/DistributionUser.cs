// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分销会员用户信息
    public class DistributionUser : TeaModel {
        // 用户创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-01-02 20:00:00</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 用户手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13000005555</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 用户唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>000:111:222:333</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
