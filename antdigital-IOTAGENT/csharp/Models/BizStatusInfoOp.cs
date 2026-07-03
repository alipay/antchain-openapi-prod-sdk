// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 业务状态信息
    public class BizStatusInfoOp : TeaModel {
        // 业务状态类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>SMART_CAR_KEY</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>unbound</para>
        /// </summary>
        [NameInMap("biz_status")]
        [Validation(Required=true)]
        public string BizStatus { get; set; }

        // 时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("op_time")]
        [Validation(Required=true)]
        public string OpTime { get; set; }

    }

}
