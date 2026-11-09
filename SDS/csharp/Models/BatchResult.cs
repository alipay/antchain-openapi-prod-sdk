// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 批处理结果
    public class BatchResult : TeaModel {
        // 业务号
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务号</para>
        /// </summary>
        [NameInMap("biz_no")]
        [Validation(Required=true, MaxLength=64)]
        public string BizNo { get; set; }

        // 业务号类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PHONE_SHA1</para>
        /// </summary>
        [NameInMap("biz_no_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizNoType { get; set; }

        // 结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>rights_rights-config-not-exist </para>
        /// </summary>
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

    }

}
