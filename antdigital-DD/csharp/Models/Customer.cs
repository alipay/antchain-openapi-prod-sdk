// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 企业
    public class Customer : TeaModel {
        // 企业创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxxxx1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁金融云有限公司</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 企业最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
