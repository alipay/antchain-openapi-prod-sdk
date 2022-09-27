// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    // 核身产品
    public class GwValidateProduct : TeaModel {
        // 核审产品码，支持多种核身产品。
        // ZK_FACE_VERIFY：人脸识别
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品渲染方式：H5、NATIVE 或 PC
        [NameInMap("group")]
        [Validation(Required=true)]
        public string Group { get; set; }

        // 核身产品参数，因网关限制，暂只支持Map<String,String>
        [NameInMap("product_params")]
        [Validation(Required=false)]
        public List<NameValuePair> ProductParams { get; set; }

    }

}
