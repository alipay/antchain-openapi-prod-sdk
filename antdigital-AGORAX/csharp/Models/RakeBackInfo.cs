// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 营销分销平台返佣信息
    public class RakeBackInfo : TeaModel {
        // 推广层级
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("level")]
        [Validation(Required=true)]
        public long? Level { get; set; }

        // 上级推广订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>test id</para>
        /// </summary>
        [NameInMap("parent_id")]
        [Validation(Required=true)]
        public string ParentId { get; set; }

        // 推广人id
        /// <summary>
        /// <b>Example:</b>
        /// <para>test id</para>
        /// </summary>
        [NameInMap("promoter_id")]
        [Validation(Required=true)]
        public string PromoterId { get; set; }

        // 返佣额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.5</para>
        /// </summary>
        [NameInMap("quota")]
        [Validation(Required=true)]
        public string Quota { get; set; }

        // 返佣比例 10表示10%
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

    }

}
