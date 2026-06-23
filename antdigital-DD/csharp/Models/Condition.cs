// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 授权条件
    public class Condition : TeaModel {
        //  
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        //  
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<string> Value { get; set; }

    }

}
