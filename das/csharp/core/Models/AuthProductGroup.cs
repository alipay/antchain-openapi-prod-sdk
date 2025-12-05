// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 授权服务产品
    public class AuthProductGroup : TeaModel {
        // 产品code列表
        [NameInMap("product_code_list")]
        [Validation(Required=true)]
        public List<string> ProductCodeList { get; set; }

        // 数据产品入参,JSON数组
        [NameInMap("product_param")]
        [Validation(Required=true)]
        public string ProductParam { get; set; }

        // C端展示授权内容code
        [NameInMap("auth_content_code")]
        [Validation(Required=true)]
        public string AuthContentCode { get; set; }

    }

}
