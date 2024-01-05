// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 任务列表返回体
    public class TaskListInfoDTO : TeaModel {
        // 任务名称
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 自有ID
        [NameInMap("survey_id")]
        [Validation(Required=true)]
        public string SurveyId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 操作员
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 样本数量
        [NameInMap("sample_num")]
        [Validation(Required=true)]
        public long? SampleNum { get; set; }

        // 完成数量
        [NameInMap("completed_num")]
        [Validation(Required=true)]
        public long? CompletedNum { get; set; }

        // 甄别数量
        [NameInMap("screen_num")]
        [Validation(Required=true)]
        public long? ScreenNum { get; set; }

        // 样本总金额
        [NameInMap("sample_total_amount")]
        [Validation(Required=true)]
        public string SampleTotalAmount { get; set; }

        // 全额红包总金额
        [NameInMap("red_packet_total_amount")]
        [Validation(Required=true)]
        public string RedPacketTotalAmount { get; set; }

        // 该任务总金额
        [NameInMap("task_total_amount")]
        [Validation(Required=true)]
        public string TaskTotalAmount { get; set; }

        // 全额红包金额
        [NameInMap("full_red_packet_amount")]
        [Validation(Required=true)]
        public string FullRedPacketAmount { get; set; }

        // 甄别红包金额
        [NameInMap("examine_red_packet_amount")]
        [Validation(Required=true)]
        public string ExamineRedPacketAmount { get; set; }

        // 发证量
        [NameInMap("issued_num")]
        [Validation(Required=false)]
        public long? IssuedNum { get; set; }

        // 产品下单code类型（1-资源包 2-后付费）
        [NameInMap("product_code_type")]
        [Validation(Required=true)]
        public string ProductCodeType { get; set; }

        // 审核理由
        [NameInMap("review_content")]
        [Validation(Required=false)]
        public string ReviewContent { get; set; }

        // 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // ap状态，1:启用，0：审批中
        [NameInMap("ap_status")]
        [Validation(Required=true)]
        public string ApStatus { get; set; }

        // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        [NameInMap("prize_channel")]
        [Validation(Required=true)]
        public long? PrizeChannel { get; set; }

        // 奖励渠道为问卷自带时，全额红包信息
        [NameInMap("full_red_packet_text_info")]
        [Validation(Required=false)]
        public string FullRedPacketTextInfo { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 投放时间
        [NameInMap("gmt_online")]
        [Validation(Required=false)]
        public string GmtOnline { get; set; }

        // 最近暂停/完成时间
        [NameInMap("gmt_pause_or_complete")]
        [Validation(Required=false)]
        public string GmtPauseOrComplete { get; set; }

        // 最近一轮用时（h）
        [NameInMap("last_round_time")]
        [Validation(Required=false)]
        public long? LastRoundTime { get; set; }

    }

}
