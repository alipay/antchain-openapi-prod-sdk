// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class GetHealthcodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号，使用蚂蚁侧提供的RSA公钥加密
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 设备编码
        [NameInMap("device_code")]
        [Validation(Required=true)]
        public string DeviceCode { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 是否需要健康码信息，不传默认不需要
        // 1：需要
        // 0：不需要
        [NameInMap("health")]
        [Validation(Required=false)]
        public long? Health { get; set; }

        // 是否需要疫苗信息
        // 1：需要，0：不需要，不传默认不需要
        [NameInMap("vaccination")]
        [Validation(Required=false)]
        public long? Vaccination { get; set; }

        // 是否需要核酸信息：
        // 1.需要，0：不需要，不传默认不需要
        [NameInMap("nucleic_acid")]
        [Validation(Required=false)]
        public long? NucleicAcid { get; set; }

        // 是否需要行程码：
        // 1.需要，0：不需要，不传默认不需要
        [NameInMap("travel")]
        [Validation(Required=false)]
        public long? Travel { get; set; }

    }

}
