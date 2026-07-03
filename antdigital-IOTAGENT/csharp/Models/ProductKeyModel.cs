// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // ProductKey信息
    public class ProductKeyModel : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 设备端ProductKey
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEV-0101</para>
        /// </summary>
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 场景码
        /// <summary>
        /// <b>Example:</b>
        /// <para>testScene</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 租户Id 
        /// <summary>
        /// <b>Example:</b>
        /// <para>testTenant</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 数据模型id 
        /// <summary>
        /// <b>Example:</b>
        /// <para>model_001</para>
        /// </summary>
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // sdk前缀
        /// <summary>
        /// <b>Example:</b>
        /// <para>sdk_</para>
        /// </summary>
        [NameInMap("sdk_version_prefix")]
        [Validation(Required=true)]
        public string SdkVersionPrefix { get; set; }

        // 制造商
        /// <summary>
        /// <b>Example:</b>
        /// <para>alibaba</para>
        /// </summary>
        [NameInMap("manufacturer")]
        [Validation(Required=false)]
        public string Manufacturer { get; set; }

        // 顾客
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay</para>
        /// </summary>
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

    }

}
