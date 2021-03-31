// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateWaybillBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 受票方名称
        // 
        [NameInMap("drawee")]
        [Validation(Required=true)]
        public string Drawee { get; set; }

        // 受票方纳税人识别号
        // 
        [NameInMap("drawee_tax_no")]
        [Validation(Required=true)]
        public string DraweeTaxNo { get; set; }

        // 发票代码
        // 
        [NameInMap("lzfpdm")]
        [Validation(Required=false)]
        public string Lzfpdm { get; set; }

        // 发票号码
        // 
        [NameInMap("lzfphm")]
        [Validation(Required=false)]
        public string Lzfphm { get; set; }

        // 开票时间戳
        // 
        [NameInMap("open_time")]
        [Validation(Required=true)]
        public long? OpenTime { get; set; }

        // 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
        // 
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 关联的运单ID
        // 
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

    }

}
