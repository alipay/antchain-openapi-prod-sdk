// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 记录计财域中变更
    public class FeeChangeFactorVO : TeaModel {
        // 哪个字段变更
        /// <summary>
        /// <b>Example:</b>
        /// <para>newFeeEntity.field</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 改变类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>UPDATE,ADD,DELETE</para>
        /// </summary>
        [NameInMap("change_type")]
        [Validation(Required=true)]
        public string ChangeType { get; set; }

    }

}
