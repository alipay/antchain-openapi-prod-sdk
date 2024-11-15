// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class InitProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 品牌名
        [NameInMap("first_name")]
        [Validation(Required=true)]
        public string FirstName { get; set; }

        // 产品标识
        [NameInMap("second_name")]
        [Validation(Required=true)]
        public string SecondName { get; set; }

        // api类型，tr或http(不区分大小写)
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
