// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateAuthTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true, MaxLength=20)]
        public string TaskId { get; set; }

        // 任务标题(同一个租户不能重复)
        [NameInMap("task_name")]
        [Validation(Required=true, MaxLength=20)]
        public string TaskName { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true, MaxLength=32)]
        public string AppId { get; set; }

        // 问卷id(同一个租户不能重复，只能包含字母、数组或者下划线)
        [NameInMap("survey_id")]
        [Validation(Required=true, MaxLength=32)]
        public string SurveyId { get; set; }

        // notes
        [NameInMap("notes")]
        [Validation(Required=false, MaxLength=32)]
        public string Notes { get; set; }

        // 任务调整操作者
        [NameInMap("operator")]
        [Validation(Required=true, MaxLength=100)]
        public string Operator { get; set; }

        // banner标题
        [NameInMap("banner_title")]
        [Validation(Required=true, MaxLength=30)]
        public string BannerTitle { get; set; }

        // banner图片地址（最多支持3张）
        [NameInMap("banner_image_urls")]
        [Validation(Required=false)]
        public List<string> BannerImageUrls { get; set; }

        // 题量
        [NameInMap("question_num")]
        [Validation(Required=true)]
        public long? QuestionNum { get; set; }

        // 任务连接地址
        [NameInMap("task_link_url")]
        [Validation(Required=true, MaxLength=1000)]
        public string TaskLinkUrl { get; set; }

        // 人群划分描述
        [NameInMap("person_divide_content")]
        [Validation(Required=false, MaxLength=1000)]
        public string PersonDivideContent { get; set; }

        // 城市列表
        [NameInMap("city_divide_urls")]
        [Validation(Required=false)]
        public List<string> CityDivideUrls { get; set; }

        // 样本数量
        [NameInMap("sample_num")]
        [Validation(Required=true)]
        public long? SampleNum { get; set; }

        // 产品下单code类型（1-资源包 2-后付费）
        [NameInMap("product_code_type")]
        [Validation(Required=true, MaxLength=4)]
        public string ProductCodeType { get; set; }

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

        // 全额红包金额（价格在0.01~100），奖励渠道为0和1时
        [NameInMap("full_red_packet_amount")]
        [Validation(Required=true)]
        public string FullRedPacketAmount { get; set; }

        // 甄别红包金额
        [NameInMap("examine_red_packet_amount")]
        [Validation(Required=true)]
        public string ExamineRedPacketAmount { get; set; }

        // 全额红包描述，奖励渠道为2时，此处必填
        [NameInMap("full_red_packet_text_info")]
        [Validation(Required=false)]
        public string FullRedPacketTextInfo { get; set; }

        // 证书内容
        [NameInMap("cert_content")]
        [Validation(Required=true)]
        public string CertContent { get; set; }

        // 人群配置
        [NameInMap("crowd_config")]
        [Validation(Required=true)]
        public string CrowdConfig { get; set; }

        // 是否草稿，1表示草稿
        [NameInMap("draft")]
        [Validation(Required=true)]
        public string Draft { get; set; }

    }

}
