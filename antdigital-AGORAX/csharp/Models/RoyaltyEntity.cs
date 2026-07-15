// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分账主体
    public class RoyaltyEntity : TeaModel {
        // 分账接收方类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>userId</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 分账接收方账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088324168543</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 分账接收方真实姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 分账关系描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>分账给测试商户</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
