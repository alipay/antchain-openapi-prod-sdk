// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 新增厂商字典时需要传的产品信息
    public class AddProductInfo : TeaModel {
        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>防疫一体机</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品code
        /// <summary>
        /// <b>Example:</b>
        /// <para>face_smart</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能防疫机</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
