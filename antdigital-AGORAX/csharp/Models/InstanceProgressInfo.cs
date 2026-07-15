// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 实例进度信息
    public class InstanceProgressInfo : TeaModel {
        // 操作人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 操作时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1690166971465</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

        // 合约部署进度类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>SERVICE_START</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 部署状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 合约部署进度名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>部署合约服务</para>
        /// </summary>
        [NameInMap("type_name")]
        [Validation(Required=false)]
        public string TypeName { get; set; }

        // 额外参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>{json}</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
