// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云链节点信息
    public class ALiYunChainNodeInfo : TeaModel {
        // block_height
        /// <summary>
        /// <b>Example:</b>
        /// <para>3123123</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // node_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>node_name</para>
        /// </summary>
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // status
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // version
        /// <summary>
        /// <b>Example:</b>
        /// <para>version</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 节点id
        /// <summary>
        /// <b>Example:</b>
        /// <para>0x0AC5C397C076E394B3D32C1A9488AAF32BABD410A2FFAF97C87646F5BD04CD42</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 节点ip
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.1.0.12</para>
        /// </summary>
        [NameInMap("node_ip")]
        [Validation(Required=false)]
        public string NodeIp { get; set; }

        // 节点的端口
        /// <summary>
        /// <b>Example:</b>
        /// <para>18130</para>
        /// </summary>
        [NameInMap("node_port")]
        [Validation(Required=false)]
        public string NodePort { get; set; }

        // 节点类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>共识或非共识</para>
        /// </summary>
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // 节点状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>正常/异常</para>
        /// </summary>
        [NameInMap("node_state")]
        [Validation(Required=false)]
        public string NodeState { get; set; }

        // 节点来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>BaaS</para>
        /// </summary>
        [NameInMap("node_source")]
        [Validation(Required=false)]
        public string NodeSource { get; set; }

        // 节点存储空间使用量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("disk_use")]
        [Validation(Required=false)]
        public string DiskUse { get; set; }

        // 节点存储总空间大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("disk_total")]
        [Validation(Required=false)]
        public string DiskTotal { get; set; }

        // 节点公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>121231bcd</para>
        /// </summary>
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

    }

}
