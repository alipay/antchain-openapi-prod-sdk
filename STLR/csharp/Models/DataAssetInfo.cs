// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据资产信息
    public class DataAssetInfo : TeaModel {
        // 数据资产DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("dataset_did")]
        [Validation(Required=true)]
        public string DatasetDid { get; set; }

        // 数据资产所有方DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 数据资产名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>企业固定化石燃料排放</para>
        /// </summary>
        [NameInMap("dataset_name")]
        [Validation(Required=true)]
        public string DatasetName { get; set; }

        // 数据类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSONAL_GREEN_DATA_METRO</para>
        /// </summary>
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
