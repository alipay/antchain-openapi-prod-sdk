// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 本次抵扣结果
    public class OmsDataComponentDeductDetailResultVO : TeaModel {
        // 资源包抵扣日志id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1233</para>
        /// </summary>
        [NameInMap("resource_package_log_id")]
        [Validation(Required=true)]
        public string ResourcePackageLogId { get; set; }

        // 资源包抵扣量
        [NameInMap("deduct_amount")]
        [Validation(Required=true)]
        public long? DeductAmount { get; set; }

        // 资源包抵扣价值
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("deducted_fund")]
        [Validation(Required=true)]
        public string DeductedFund { get; set; }

        // 资源包抵扣时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("deducted_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeductedTime { get; set; }

        // 资源包id
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0SQBRFM01222133ORGJC1CN1ZXEMO6K8TL</para>
        /// </summary>
        [NameInMap("resource_package_id")]
        [Validation(Required=true)]
        public string ResourcePackageId { get; set; }

        // 资源包实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源包实例id</para>
        /// </summary>
        [NameInMap("resource_package_instance_id")]
        [Validation(Required=true)]
        public string ResourcePackageInstanceId { get; set; }

    }

}
