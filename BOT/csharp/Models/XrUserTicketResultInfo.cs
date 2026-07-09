// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 创建xr用户通行证结果信息
    public class XrUserTicketResultInfo : TeaModel {
        // xr通行证资源池名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源池001</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 购买数量，失败列表有值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 失败原因，失败列表有值
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数错误</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 通行证编号，成功列表有值
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("xr_ticket_code")]
        [Validation(Required=false)]
        public string XrTicketCode { get; set; }

    }

}
