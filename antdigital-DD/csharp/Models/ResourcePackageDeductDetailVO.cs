// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 详单维度资源包抵扣详情
    public class ResourcePackageDeductDetailVO : TeaModel {
        // 资源包抵扣日志id
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("resource_package_log_id")]
        [Validation(Required=false)]
        public string ResourcePackageLogId { get; set; }

        // 资源包抵扣量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("deducted_amount")]
        [Validation(Required=false)]
        public string DeductedAmount { get; set; }

        // 资源包id
        /// <summary>
        /// <b>Example:</b>
        /// <para>aaa</para>
        /// </summary>
        [NameInMap("resource_package_id")]
        [Validation(Required=false)]
        public string ResourcePackageId { get; set; }

        // 资源包实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>aaa</para>
        /// </summary>
        [NameInMap("resource_package_instance_id")]
        [Validation(Required=false)]
        public string ResourcePackageInstanceId { get; set; }

    }

}
