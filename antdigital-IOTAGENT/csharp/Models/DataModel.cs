// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 数据模型
    public class DataModel : TeaModel {
        //  数据模型Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>112233</para>
        /// </summary>
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 数据模型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>检测设备模型</para>
        /// </summary>
        [NameInMap("data_model_name")]
        [Validation(Required=false)]
        public string DataModelName { get; set; }

        // 数据模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>{          &quot;PIC-URL&quot;: {                 &quot;type&quot;: &quot;string&quot;,                 &quot;require&quot;:false              } }</para>
        /// </summary>
        [NameInMap("data_model")]
        [Validation(Required=true)]
        public string DataModel_ { get; set; }

        // 数据模型类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORDER</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 用户自定义版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>V1.0</para>
        /// </summary>
        [NameInMap("customer_version")]
        [Validation(Required=false)]
        public string CustomerVersion { get; set; }

        // 数据样例
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;:&quot;zhangsan&quot;}</para>
        /// </summary>
        [NameInMap("data_demo")]
        [Validation(Required=false)]
        public string DataDemo { get; set; }

    }

}
