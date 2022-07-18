// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DOG.Models
{
    public class GetAgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 狗狗的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 数组结构体
        [NameInMap("dog")]
        [Validation(Required=true)]
        public List<Dog> Dog { get; set; }

        // 结构体
        [NameInMap("home")]
        [Validation(Required=true)]
        public DogHome Home { get; set; }

    }

}
