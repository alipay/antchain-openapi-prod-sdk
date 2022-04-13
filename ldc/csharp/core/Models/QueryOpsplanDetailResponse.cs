// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOpsplanDetailResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 发布单包含的应用数
        [NameInMap("app_count")]
        [Validation(Required=false)]
        public long? AppCount { get; set; }

        // 应用信息列表
        [NameInMap("app_infos")]
        [Validation(Required=false)]
        public List<AppSimpleInfo> AppInfos { get; set; }

        // 执行人
        [NameInMap("executor")]
        [Validation(Required=false)]
        public string Executor { get; set; }

        // 发布结束时间
        [NameInMap("finish_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishTime { get; set; }

        // 应用分组概要信息列表
        [NameInMap("group_collection_list")]
        [Validation(Required=false)]
        public List<AppGroupSimpleViewList> GroupCollectionList { get; set; }

        // 发布单id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 错误信息
        [NameInMap("message_detail")]
        [Validation(Required=false)]
        public string MessageDetail { get; set; }

        // 运维单类型
        // 
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 发布单标题
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 备注信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 发布开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 发布单状态
        // 
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 发布单号
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

        // 发布单类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // pod数量
        [NameInMap("pod_count")]
        [Validation(Required=false)]
        public long? PodCount { get; set; }

        // 审批状态：AGREE-同意，REJECTED-拒绝，CANCELED-取消
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public string ApprovalStatus { get; set; }

        // 审批详情url
        [NameInMap("approval_url")]
        [Validation(Required=false)]
        public string ApprovalUrl { get; set; }

    }

}
