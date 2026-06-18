// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商品供应方信息
    public class PoiMallPointSupplierInfo : TeaModel {
        // 供应方名称
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 供应方类型 
        // 门店：STORE
        // 平台：PLATFORM
        // 供应商：SUPPLIER
        [NameInMap("supplier_type")]
        [Validation(Required=false)]
        public string SupplierType { get; set; }

        // 供应方编码
        [NameInMap("supplier_code")]
        [Validation(Required=false)]
        public string SupplierCode { get; set; }

    }

}
