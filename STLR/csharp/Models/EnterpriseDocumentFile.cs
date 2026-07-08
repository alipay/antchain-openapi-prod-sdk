// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 文档信息
    public class EnterpriseDocumentFile : TeaModel {
        // 文档名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022年7月车辆运输数据文件</para>
        /// </summary>
        [NameInMap("document_name")]
        [Validation(Required=true)]
        public string DocumentName { get; set; }

        // 文件地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>carbonchain/file/dataentry_document/20211108000220010000000000000356/20211108000220010000000000000356.xlsx</para>
        /// </summary>
        [NameInMap("document_address")]
        [Validation(Required=true)]
        public string DocumentAddress { get; set; }

    }

}
