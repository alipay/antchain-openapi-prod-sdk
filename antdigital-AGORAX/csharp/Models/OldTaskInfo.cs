// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 历史任务信息
    public class OldTaskInfo : TeaModel {
        // 任务标题(同一个租户不能重复)
        /// <summary>
        /// <b>Example:</b>
        /// <para>普通任务</para>
        /// </summary>
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // appId
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021004121633301</para>
        /// </summary>
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 问卷ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>ybl1112</para>
        /// </summary>
        [NameInMap("survey_id")]
        [Validation(Required=true)]
        public string SurveyId { get; set; }

        // 备注信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>普通任务备注</para>
        /// </summary>
        [NameInMap("notes")]
        [Validation(Required=false)]
        public string Notes { get; set; }

        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>RIVUFSJG</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 操作者
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:eipzps@alitest.comtest">eipzps@alitest.comtest</a></para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // banner标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>普通任务banner</para>
        /// </summary>
        [NameInMap("banner_title")]
        [Validation(Required=true)]
        public string BannerTitle { get; set; }

        // banner图片地址（最多支持3张）
        /// <summary>
        /// <b>Example:</b>
        /// <para>testTenant_1.png,testTenant_1.png</para>
        /// </summary>
        [NameInMap("banner_image_urls")]
        [Validation(Required=false)]
        public string BannerImageUrls { get; set; }

        // banner 图片地址, 拼装后的url
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;testTenant_1.png&quot;,&quot;testTenant_1.png&quot;]</para>
        /// </summary>
        [NameInMap("banner_image_full_urls")]
        [Validation(Required=false)]
        public List<string> BannerImageFullUrls { get; set; }

        // 题量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("question_num")]
        [Validation(Required=true)]
        public long? QuestionNum { get; set; }

        // 任务连接地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://pro.wenjuan.com/t/a2">https://pro.wenjuan.com/t/a2</a></para>
        /// </summary>
        [NameInMap("task_link_url")]
        [Validation(Required=true)]
        public string TaskLinkUrl { get; set; }

        // 人群划分描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>购买过健身服装的人群</para>
        /// </summary>
        [NameInMap("person_divide_content")]
        [Validation(Required=false)]
        public string PersonDivideContent { get; set; }

        // 城市列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京,上海,新加坡</para>
        /// </summary>
        [NameInMap("city_divide_urls")]
        [Validation(Required=false)]
        public string CityDivideUrls { get; set; }

        // 城市列表, 拼装后的url
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;北京&quot;,&quot;上海&quot;,&quot;新加坡&quot;]</para>
        /// </summary>
        [NameInMap("city_divide_full_urls")]
        [Validation(Required=false)]
        public List<string> CityDivideFullUrls { get; set; }

        // 样本数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("sample_num")]
        [Validation(Required=true)]
        public long? SampleNum { get; set; }

        // 完成样本量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("completed_num")]
        [Validation(Required=true)]
        public long? CompletedNum { get; set; }

        // 产品下单code类型（1-资源包 2-后付费）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("product_code_type")]
        [Validation(Required=true)]
        public string ProductCodeType { get; set; }

        // 产品余量
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("product_capacity")]
        [Validation(Required=true)]
        public long? ProductCapacity { get; set; }

        // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("prize_channel")]
        [Validation(Required=true)]
        public long? PrizeChannel { get; set; }

        // 支付宝账号
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:kefu@lingdangshuo.com">kefu@lingdangshuo.com</a></para>
        /// </summary>
        [NameInMap("alipay_account_id")]
        [Validation(Required=false)]
        public string AlipayAccountId { get; set; }

        // 奖励类型（0-定额红包）
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("prize_type")]
        [Validation(Required=true)]
        public long? PrizeType { get; set; }

        // 全额红包金额，奖励渠道为0和1时
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.00</para>
        /// </summary>
        [NameInMap("full_red_packet_amount")]
        [Validation(Required=true)]
        public string FullRedPacketAmount { get; set; }

        // 全额红包描述，奖励渠道为2时，此处必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>1-5元红包</para>
        /// </summary>
        [NameInMap("full_red_packet_text_info")]
        [Validation(Required=false)]
        public string FullRedPacketTextInfo { get; set; }

        // 甄别红包金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.01</para>
        /// </summary>
        [NameInMap("examine_red_packet_amount")]
        [Validation(Required=true)]
        public string ExamineRedPacketAmount { get; set; }

        // 关联的证书instanceId
        /// <summary>
        /// <b>Example:</b>
        /// <para>6511ce4b43414e9588114682bbf9a893</para>
        /// </summary>
        [NameInMap("cert_instance_id")]
        [Validation(Required=false)]
        public string CertInstanceId { get; set; }

        // 证书实例详情
        [NameInMap("cert_instance_detail")]
        [Validation(Required=false)]
        public CertInstanceDetail CertInstanceDetail { get; set; }

        // 审核建议
        /// <summary>
        /// <b>Example:</b>
        /// <para>拒绝</para>
        /// </summary>
        [NameInMap("verify_comment")]
        [Validation(Required=false)]
        public string VerifyComment { get; set; }

        // 任务创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-12-20 12:19:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 任务更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-12-20 12:45:00</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 审核理由
        /// <summary>
        /// <b>Example:</b>
        /// <para>不合适</para>
        /// </summary>
        [NameInMap("review_content")]
        [Validation(Required=false)]
        public string ReviewContent { get; set; }

        // 人群配置信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;exclude&quot;: false,&quot;nodeConfig&quot;: {&quot;groupType&quot;: &quot;AND&quot;,&quot;children&quot;: [&quot;exclude&quot;: false,&quot;nodeType&quot;: &quot;GROUP&quot;,&quot;nodeId&quot;: &quot;1303661d-a7da-4d8a-b646-0819f2fc2855&quot;,&quot;nodeConfig&quot;: {&quot;groupType&quot;: &quot;AND&quot;,&quot;children&quot;: []}}]},&quot;nodeId&quot;: &quot;ROOT&quot;,&quot;nodeType&quot;: &quot;GROUP&quot;}</para>
        /// </summary>
        [NameInMap("crowd_config")]
        [Validation(Required=false)]
        public string CrowdConfig { get; set; }

        // 任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>qdQxqU5gz</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>9</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
