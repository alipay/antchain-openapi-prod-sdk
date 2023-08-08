// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class QueryAntsaasStaffingcContractSignResponse : TeaModel {
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

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 文件有效截止日期
        [NameInMap("contract_validity")]
        [Validation(Required=false)]
        public long? ContractValidity { get; set; }

        // 流程描述
        [NameInMap("flow_desc")]
        [Validation(Required=false)]
        public string FlowDesc { get; set; }

        // 流程开始时间
        [NameInMap("flow_start_time")]
        [Validation(Required=false)]
        public string FlowStartTime { get; set; }

        // 流程结束时间
        [NameInMap("flow_end_time")]
        [Validation(Required=false)]
        public string FlowEndTime { get; set; }

        // 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
        [NameInMap("flow_status")]
        [Validation(Required=false)]
        public long? FlowStatus { get; set; }

        // 合同文件id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 合同文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 合同文件下载地址（1小时内有效）
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 如果未签署，将返回签署链接
        [NameInMap("sign_url_list")]
        [Validation(Required=false)]
        public List<SignUrlResp> SignUrlList { get; set; }

    }

}
