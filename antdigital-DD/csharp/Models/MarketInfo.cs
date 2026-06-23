// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 市场法信息
    public class MarketInfo : TeaModel {
        // 市场逻辑
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("market_logic")]
        [Validation(Required=false)]
        public string MarketLogic { get; set; }

        // 潜客接受度
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("acceptance_details")]
        [Validation(Required=false)]
        public List<AcceptanceDetail> AcceptanceDetails { get; set; }

        // 基于竞品及加成
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("addition_details")]
        [Validation(Required=false)]
        public List<AdditionDetail> AdditionDetails { get; set; }

    }

}
