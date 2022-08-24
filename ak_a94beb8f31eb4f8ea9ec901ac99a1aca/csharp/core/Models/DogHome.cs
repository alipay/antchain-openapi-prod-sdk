// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a94beb8f31eb4f8ea9ec901ac99a1aca.Models
{
    // 狗狗之家
    public class DogHome : TeaModel {
        // 狗狗成员
        [NameInMap("dog_members")]
        [Validation(Required=true)]
        public List<Dog> DogMembers { get; set; }

        // 狗狗头目
        [NameInMap("leader")]
        [Validation(Required=true)]
        public Dog Leader { get; set; }

    }

}
