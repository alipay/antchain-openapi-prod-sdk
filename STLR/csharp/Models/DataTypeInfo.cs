// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据类型
    public class DataTypeInfo : TeaModel {
        // 数据类型编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>dataTypeNo</para>
        /// </summary>
        [NameInMap("data_type_no")]
        [Validation(Required=true)]
        public string DataTypeNo { get; set; }

        // 数据类型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>data_type_name</para>
        /// </summary>
        [NameInMap("data_type_name")]
        [Validation(Required=true)]
        public string DataTypeName { get; set; }

        // 数据类型配置
        /// <summary>
        /// <b>Example:</b>
        /// <para>data_type_config</para>
        /// </summary>
        [NameInMap("data_type_config")]
        [Validation(Required=true)]
        public string DataTypeConfig { get; set; }

        // 数据JSON格式检查
        /// <summary>
        /// <b>Example:</b>
        /// <para>data_json_schema</para>
        /// </summary>
        [NameInMap("data_json_schema")]
        [Validation(Required=true)]
        public string DataJsonSchema { get; set; }

    }

}
