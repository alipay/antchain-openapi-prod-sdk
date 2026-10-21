// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class OpenNode : TeaModel {
        // node ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>N1</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // parent node ID
        [NameInMap("parent_node_id")]
        [Validation(Required=true)]
        public string ParentNodeId { get; set; }

        // slot key
        /// <summary>
        /// <b>Example:</b>
        /// <para>system:root</para>
        /// </summary>
        [NameInMap("slot_key")]
        [Validation(Required=true)]
        public string SlotKey { get; set; }

        // slot value
        /// <summary>
        /// <b>Example:</b>
        /// <para>根节点</para>
        /// </summary>
        [NameInMap("slot_value")]
        [Validation(Required=true)]
        public string SlotValue { get; set; }

        // level
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("level")]
        [Validation(Required=true)]
        public long? Level { get; set; }

        // sort订单
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("sort_order")]
        [Validation(Required=true)]
        public long? SortOrder { get; set; }

        // gmt create
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-08-01 10:00:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // children
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;node_id&quot;:&quot;N2&quot;,&quot;parent_node_id&quot;:&quot;N1&quot;,&quot;slot_key&quot;:&quot;province&quot;,&quot;slot_value&quot;:&quot;山东&quot;,&quot;level&quot;:1,&quot;sort_order&quot;:0,&quot;gmt_create&quot;:&quot;2026-08-01 10:00:00&quot;,&quot;children&quot;:[]}]</para>
        /// </summary>
        [NameInMap("children")]
        [Validation(Required=true)]
        public string Children { get; set; }

    }

}
