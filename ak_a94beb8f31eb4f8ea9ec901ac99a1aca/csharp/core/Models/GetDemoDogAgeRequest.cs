// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a94beb8f31eb4f8ea9ec901ac99a1aca.Models
{
    public class GetDemoDogAgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数组结构体
        [NameInMap("dog")]
        [Validation(Required=false)]
        public List<Dog> Dog { get; set; }

        // 狗狗的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 结构体
        [NameInMap("home")]
        [Validation(Required=true)]
        public DogHome Home { get; set; }

        // alipay
        [NameInMap("file_id")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FileId { get; set; }

        // test
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

    }

}
