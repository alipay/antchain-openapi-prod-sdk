// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分商城商品供应方信息
    public class PointSupplierInfo : TeaModel {
        // 供应方名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>爱肯拿</para>
        /// </summary>
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 供应方类型：
        // 门店：STORE
        // 平台：PLATFORM
        // 供应商：SUPPLIER
        /// <summary>
        /// <b>Example:</b>
        /// <para>STORE</para>
        /// </summary>
        [NameInMap("supplier_type")]
        [Validation(Required=false)]
        public string SupplierType { get; set; }

        // 供应方编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("supplier_code")]
        [Validation(Required=false)]
        public string SupplierCode { get; set; }

    }

}
