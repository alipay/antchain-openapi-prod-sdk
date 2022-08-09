// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Eb193ab60ccc42ddb781f570a741c3fa.Models
{
    // TestStruct
    public class TestStruct : TeaModel {
        // x
        [NameInMap("x")]
        [Validation(Required=true)]
        public string X { get; set; }

        // y
        [NameInMap("y")]
        [Validation(Required=true)]
        public DemoClass Y { get; set; }

        // z
        [NameInMap("z")]
        [Validation(Required=true)]
        public List<DemoClass> Z { get; set; }

    }

}
