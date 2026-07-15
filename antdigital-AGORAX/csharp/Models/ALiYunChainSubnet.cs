// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云子链结构体
    public class ALiYunChainSubnet : TeaModel {
        // 子链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>S210304150059</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 子链名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 子链节点数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("node_sum")]
        [Validation(Required=false)]
        public long? NodeSum { get; set; }

        // 子链监控状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("monitor")]
        [Validation(Required=false)]
        public bool? Monitor { get; set; }

        // 子链的块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public string BlockHeight { get; set; }

        // 子链的业务总数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("transaction_sum")]
        [Validation(Required=false)]
        public long? TransactionSum { get; set; }

        // 子链的创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000821213123</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 子链的状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>STOP/CREATE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 子链的权限
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("consortium_member")]
        [Validation(Required=false)]
        public bool? ConsortiumMember { get; set; }

        // 主链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2e7e22c42bb8419bbf99b7f56aa2f17f</para>
        /// </summary>
        [NameInMap("main_chain_id")]
        [Validation(Required=false)]
        public string MainChainId { get; set; }

        // rest申请状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK</para>
        /// </summary>
        [NameInMap("rest")]
        [Validation(Required=false)]
        public string Rest { get; set; }

        // 子链序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0000000000000002000000000000000000000000</para>
        /// </summary>
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

    }

}
