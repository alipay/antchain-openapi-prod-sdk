// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 推送记录
    public class DDCSPushHistoryItem : TeaModel {
        // 推送记录的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 变更平台，固定值 ddcs
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

        // 变更类型，固定值
        [NameInMap("change_type")]
        [Validation(Required=false)]
        public string ChangeType { get; set; }

        // 推送标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 变更影响的应用名
        [NameInMap("influence_app")]
        [Validation(Required=false)]
        public string InfluenceApp { get; set; }

        // 变更的 dataId
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 推送类型，Cluster 表示集群推送，IP 表示按机器灰度推送
        [NameInMap("push_type")]
        [Validation(Required=true)]
        public string PushType { get; set; }

        // 推送的目标。按集群推送时，AllCells 表示向所用的 cell 推送，多个Cell之间逗号隔开。
        // 按机器推送时，值为 IP列表，逗号隔开
        [NameInMap("target")]
        [Validation(Required=true)]
        public string Target { get; set; }

        // 固定为 dataId 所属的 instanceId
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 操作人。如果是系统调用，则值为调用应用名
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 变更的起始时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
        [NameInMap("gmt_start")]
        [Validation(Required=true)]
        public long? GmtStart { get; set; }

        // 变更的结束时间，值为  1970年到现在的毫秒数，主要是为了屏蔽时区的问题。
        [NameInMap("gmt_end")]
        [Validation(Required=true)]
        public long? GmtEnd { get; set; }

        // 推送结果
        [NameInMap("push_result")]
        [Validation(Required=true)]
        public string PushResult { get; set; }

        // 推送值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
