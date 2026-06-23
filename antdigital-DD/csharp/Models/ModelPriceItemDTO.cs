// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ModelPriceItemDTO
    public class ModelPriceItemDTO : TeaModel {
        // 模型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>qwen3.5-plus</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 定价详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("prices")]
        [Validation(Required=true)]
        public List<PriceDetailDTO> Prices { get; set; }

    }

}
