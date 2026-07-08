// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 物料详情
    public class MaterialTypeDetail : TeaModel {
        // 物料类型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

        // 物料产品详情表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("material_list")]
        [Validation(Required=false)]
        public List<MaterialDetail> MaterialList { get; set; }

    }

}
