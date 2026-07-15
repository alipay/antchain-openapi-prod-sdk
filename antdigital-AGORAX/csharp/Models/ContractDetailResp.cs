// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约详情
    public class ContractDetailResp : TeaModel {
        // 合约服务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>cme20230724104931af3a4d</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 合约服务名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>存证合约</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 创建人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1690166971465</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 订购产品
        /// <summary>
        /// <b>Example:</b>
        /// <para>存证合约服务</para>
        /// </summary>
        [NameInMap("ordering_products")]
        [Validation(Required=false)]
        public string OrderingProducts { get; set; }

        // 关联区块链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>284f75bc-8069-443f-9d46-4576bb15f210</para>
        /// </summary>
        [NameInMap("chan_id")]
        [Validation(Required=false)]
        public string ChanId { get; set; }

        // 合约状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEPLOYED</para>
        /// </summary>
        [NameInMap("contract_status")]
        [Validation(Required=false)]
        public string ContractStatus { get; set; }

        // 合约部署进度当前状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SERVICE_START</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 合约部署进度
        [NameInMap("progress_info_list")]
        [Validation(Required=false)]
        public List<InstanceProgressInfo> ProgressInfoList { get; set; }

        // 实例最近调用记录(暂缓，先不做)
        [NameInMap("record_info_list")]
        [Validation(Required=false)]
        public List<InstanceRecordInfo> RecordInfoList { get; set; }

    }

}
