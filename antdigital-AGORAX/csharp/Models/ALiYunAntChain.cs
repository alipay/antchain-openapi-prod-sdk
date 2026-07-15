// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云蚂蚁链对象
    public class ALiYunAntChain : TeaModel {
        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 链名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("ant_chain_name")]
        [Validation(Required=false)]
        public string AntChainName { get; set; }

        // 链的类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>链的类型</para>
        /// </summary>
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // cipher_suit
        /// <summary>
        /// <b>Example:</b>
        /// <para>cipher_suit</para>
        /// </summary>
        [NameInMap("cipher_suit")]
        [Validation(Required=false)]
        public string CipherSuit { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>创建时间</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // expire_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>1123123123123</para>
        /// </summary>
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // instance_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>instance_id</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // is_admin
        /// <summary>
        /// <b>Example:</b>
        /// <para>true、false</para>
        /// </summary>
        [NameInMap("is_admin")]
        [Validation(Required=false)]
        public bool? IsAdmin { get; set; }

        // 成员状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>成员状态</para>
        /// </summary>
        [NameInMap("member_status")]
        [Validation(Required=false)]
        public string MemberStatus { get; set; }

        // merkle_tree_suit
        /// <summary>
        /// <b>Example:</b>
        /// <para>merkle_tree_suit</para>
        /// </summary>
        [NameInMap("merkle_tree_suit")]
        [Validation(Required=false)]
        public string MerkleTreeSuit { get; set; }

        // Network
        /// <summary>
        /// <b>Example:</b>
        /// <para>Network</para>
        /// </summary>
        [NameInMap("network")]
        [Validation(Required=false)]
        public string Network { get; set; }

        // 节点数
        /// <summary>
        /// <b>Example:</b>
        /// <para>节点数</para>
        /// </summary>
        [NameInMap("node_num")]
        [Validation(Required=false)]
        public long? NodeNum { get; set; }

        // 区域信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>区域信息</para>
        /// </summary>
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 链的资源大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>链的资源大小</para>
        /// </summary>
        [NameInMap("resource_size")]
        [Validation(Required=false)]
        public string ResourceSize { get; set; }

        // rest_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>rest_status</para>
        /// </summary>
        [NameInMap("rest_status")]
        [Validation(Required=false)]
        public string RestStatus { get; set; }

        // 算法参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>算法参数</para>
        /// </summary>
        [NameInMap("tls_algo")]
        [Validation(Required=false)]
        public string TlsAlgo { get; set; }

        // 版本信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.10.2.12.5</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // monitor_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>monitor_status</para>
        /// </summary>
        [NameInMap("monitor_status")]
        [Validation(Required=false)]
        public bool? MonitorStatus { get; set; }

    }

}
