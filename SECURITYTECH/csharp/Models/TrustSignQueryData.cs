// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT可信签约查询数据
    public class TrustSignQueryData : TeaModel {
        // 请求唯一标识Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 订单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 签约方案码
        /// <summary>
        /// <b>Example:</b>
        /// <para>011fda32a0046d0e8a8be6b94b367fb3</para>
        /// </summary>
        [NameInMap("solution_code")]
        [Validation(Required=true)]
        public string SolutionCode { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-03-20</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-03-20</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 签约文件列表
        [NameInMap("file_list")]
        [Validation(Required=true)]
        public List<string> FileList { get; set; }

    }

}
