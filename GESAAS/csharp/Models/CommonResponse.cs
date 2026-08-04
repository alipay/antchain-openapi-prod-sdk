// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 响应结果基类
    public class CommonResponse : TeaModel {
        // 结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>100001</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回码描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>成功</para>
        /// </summary>
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // 业务处理结果码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>fail</para>
        /// </summary>
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 返回的提示信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>失败</para>
        /// </summary>
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

        // 可否重试
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("retry")]
        [Validation(Required=false)]
        public bool? Retry { get; set; }

    }

}
