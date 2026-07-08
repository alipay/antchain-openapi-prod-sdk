// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 输出流活动数据
    public class OutputStreamActiveData : TeaModel {
        // 物料编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>0102010000</para>
        /// </summary>
        [NameInMap("material_code")]
        [Validation(Required=true)]
        public string MaterialCode { get; set; }

        // 用量，非负，最多6位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>200.12</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>KG</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        // 单价（仅产品用，产品不传时默认为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 处置方式编码（仅废弃物用）
        /// <summary>
        /// <b>Example:</b>
        /// <para>5201000000</para>
        /// </summary>
        [NameInMap("disposal_type_code")]
        [Validation(Required=false)]
        public string DisposalTypeCode { get; set; }

        // 运输信息列表（仅废弃物用）
        [NameInMap("transport_list")]
        [Validation(Required=false)]
        public List<TransportActiveData> TransportList { get; set; }

    }

}
