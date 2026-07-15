// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 快照文档详情
    public class SnapshotDocumentItem : TeaModel {
        // 节点ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>node_id</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 文档ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>document_id</para>
        /// </summary>
        [NameInMap("document_id")]
        [Validation(Required=true)]
        public string DocumentId { get; set; }

        // 文档名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>document_name</para>
        /// </summary>
        [NameInMap("document_name")]
        [Validation(Required=true)]
        public string DocumentName { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>file_type</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 下载原文的链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss_url</para>
        /// </summary>
        [NameInMap("oss_url")]
        [Validation(Required=true)]
        public string OssUrl { get; set; }

        // 原文的md5
        /// <summary>
        /// <b>Example:</b>
        /// <para>md5</para>
        /// </summary>
        [NameInMap("md5")]
        [Validation(Required=false)]
        public string Md5 { get; set; }

        // 向量文档ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>vector_store_map_id</para>
        /// </summary>
        [NameInMap("vector_store_map_id")]
        [Validation(Required=true)]
        public string VectorStoreMapId { get; set; }

        // 文档来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>source</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 文档来源附带的额外信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>source_ext</para>
        /// </summary>
        [NameInMap("source_ext")]
        [Validation(Required=true)]
        public string SourceExt { get; set; }

        // 标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>tags</para>
        /// </summary>
        [NameInMap("tags")]
        [Validation(Required=true)]
        public List<string> Tags { get; set; }

    }

}
