// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // sdk信息
    public class SdkModel : TeaModel {
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

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 设备SDK公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>MEUCIDxNwV7tXGlZ9VW19p...</para>
        /// </summary>
        [NameInMap("verify_key")]
        [Validation(Required=true)]
        public string VerifyKey { get; set; }

        // SDK版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>mqV1.0</para>
        /// </summary>
        [NameInMap("sdk_version_str")]
        [Validation(Required=false)]
        public string SdkVersionStr { get; set; }

        // sdk模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;version&quot;:&quot;1.0.0&quot;}</para>
        /// </summary>
        [NameInMap("meta_model")]
        [Validation(Required=false)]
        public string MetaModel { get; set; }

        // 平台
        /// <summary>
        /// <b>Example:</b>
        /// <para>windows</para>
        /// </summary>
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}
