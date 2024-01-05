// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 历史任务信息
    public class OldTaskInfo : TeaModel {
        // 任务标题(同一个租户不能重复)
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 问卷ID
        [NameInMap("survey_id")]
        [Validation(Required=true)]
        public string SurveyId { get; set; }

        // 备注信息
        [NameInMap("notes")]
        [Validation(Required=false)]
        public string Notes { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 操作者
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // banner标题
        [NameInMap("banner_title")]
        [Validation(Required=true)]
        public string BannerTitle { get; set; }

        // banner图片地址（最多支持3张）
        [NameInMap("banner_image_urls")]
        [Validation(Required=false)]
        public string BannerImageUrls { get; set; }

        // banner 图片地址, 拼装后的url
        [NameInMap("banner_image_full_urls")]
        [Validation(Required=false)]
        public List<string> BannerImageFullUrls { get; set; }

        // 题量
        [NameInMap("question_num")]
        [Validation(Required=true)]
        public long? QuestionNum { get; set; }

        // 任务连接地址
        [NameInMap("task_link_url")]
        [Validation(Required=true)]
        public string TaskLinkUrl { get; set; }

        // 人群划分描述
        [NameInMap("person_divide_content")]
        [Validation(Required=false)]
        public string PersonDivideContent { get; set; }

        // 城市列表
        [NameInMap("city_divide_urls")]
        [Validation(Required=false)]
        public string CityDivideUrls { get; set; }

        // 城市列表, 拼装后的url
        [NameInMap("city_divide_full_urls")]
        [Validation(Required=false)]
        public List<string> CityDivideFullUrls { get; set; }

        // 样本数量
        [NameInMap("sample_num")]
        [Validation(Required=true)]
        public long? SampleNum { get; set; }

        // 完成样本量
        [NameInMap("completed_num")]
        [Validation(Required=true)]
        public long? CompletedNum { get; set; }

        // 产品下单code类型（1-资源包 2-后付费）
        [NameInMap("product_code_type")]
        [Validation(Required=true)]
        public string ProductCodeType { get; set; }

        // 产品余量
        [NameInMap("product_capacity")]
        [Validation(Required=true)]
        public long? ProductCapacity { get; set; }

        // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        [NameInMap("prize_channel")]
        [Validation(Required=true)]
        public long? PrizeChannel { get; set; }

        // 支付宝账号
        [NameInMap("alipay_account_id")]
        [Validation(Required=false)]
        public string AlipayAccountId { get; set; }

        // 奖励类型（0-定额红包）
        [NameInMap("prize_type")]
        [Validation(Required=true)]
        public long? PrizeType { get; set; }

        // 全额红包金额，奖励渠道为0和1时
        [NameInMap("full_red_packet_amount")]
        [Validation(Required=true)]
        public string FullRedPacketAmount { get; set; }

        // 全额红包描述，奖励渠道为2时，此处必填
        [NameInMap("full_red_packet_text_info")]
        [Validation(Required=false)]
        public string FullRedPacketTextInfo { get; set; }

        // 甄别红包金额
        [NameInMap("examine_red_packet_amount")]
        [Validation(Required=true)]
        public string ExamineRedPacketAmount { get; set; }

        // 关联的证书instanceId
        [NameInMap("cert_instance_id")]
        [Validation(Required=false)]
        public string CertInstanceId { get; set; }

        // 证书实例详情
        [NameInMap("cert_instance_detail")]
        [Validation(Required=false)]
        public CertInstanceDetail CertInstanceDetail { get; set; }

        // 审核建议
        [NameInMap("verify_comment")]
        [Validation(Required=false)]
        public string VerifyComment { get; set; }

        // 任务创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 任务更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 审核理由
        [NameInMap("review_content")]
        [Validation(Required=false)]
        public string ReviewContent { get; set; }

        // 人群配置信息
        [NameInMap("crowd_config")]
        [Validation(Required=false)]
        public string CrowdConfig { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
