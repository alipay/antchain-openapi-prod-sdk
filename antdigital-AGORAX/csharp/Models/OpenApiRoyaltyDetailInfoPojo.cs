// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分账信息
    public class OpenApiRoyaltyDetailInfoPojo : TeaModel {
        // 分账比例
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("percentage")]
        [Validation(Required=false)]
        public string Percentage { get; set; }

        // 分账金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 分账类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>transfer</para>
        /// </summary>
        [NameInMap("royalty_type")]
        [Validation(Required=false)]
        public string RoyaltyType { get; set; }

        // 支出方账户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>userId</para>
        /// </summary>
        [NameInMap("trans_out_type")]
        [Validation(Required=false)]
        public string TransOutType { get; set; }

        // 支出方账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126765726</para>
        /// </summary>
        [NameInMap("trans_out")]
        [Validation(Required=false)]
        public string TransOut { get; set; }

        // 收入方账户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>userId</para>
        /// </summary>
        [NameInMap("trans_in_type")]
        [Validation(Required=false)]
        public string TransInType { get; set; }

        // 收入方账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126708402</para>
        /// </summary>
        [NameInMap("trans_in")]
        [Validation(Required=false)]
        public string TransIn { get; set; }

        // 分账描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>分账给2088101126708402</para>
        /// </summary>
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
