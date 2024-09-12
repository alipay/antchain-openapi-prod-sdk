// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class VerifyDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 元数据编码
        [NameInMap("metadata_code")]
        [Validation(Required=true)]
        public string MetadataCode { get; set; }

        // 数据标识
        [NameInMap("attr_identify")]
        [Validation(Required=false)]
        public string AttrIdentify { get; set; }

        // 核验属性集合
        [NameInMap("attrs")]
        [Validation(Required=true)]
        public List<MetaDataAttr> Attrs { get; set; }

    }

}
