// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 机构会员资料
    public class EnterpriseMemberSummary : TeaModel {
        // 机构会员DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:aa509301d1c2bd0e35f9737824e5ab9832ca9a09542d618bce24a1609191383c</para>
        /// </summary>
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

        // 会员姓名，数据脱敏处理返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>张**</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 会员手机号码，数据脱敏处理返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>136****1122</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 会员注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-02-22 12:33:11</para>
        /// </summary>
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public string RegisterTime { get; set; }

    }

}
