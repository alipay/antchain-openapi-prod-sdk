// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateDciPreregistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 作品名称
        [NameInMap("work_name")]
        [Validation(Required=true)]
        public string WorkName { get; set; }

        // 作品类型
        [NameInMap("work_category")]
        [Validation(Required=true)]
        public string WorkCategory { get; set; }

        // 推荐作品分类
        [NameInMap("recommend_work_category")]
        [Validation(Required=false)]
        public string RecommendWorkCategory { get; set; }

        // 作品oss文件Id
        [NameInMap("work_file_id")]
        [Validation(Required=true)]
        public string WorkFileId { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 创作信息
        [NameInMap("creation_info")]
        [Validation(Required=true)]
        public DciCreationInfo CreationInfo { get; set; }

        // 发表信息
        [NameInMap("publication_info")]
        [Validation(Required=true)]
        public DciPublicationInfo PublicationInfo { get; set; }

        // 作者姓名
        [NameInMap("author_name")]
        [Validation(Required=true)]
        public string AuthorName { get; set; }

        // 作者署名
        [NameInMap("author_signature")]
        [Validation(Required=false)]
        public string AuthorSignature { get; set; }

        // 原创声明
        [NameInMap("original_statement")]
        [Validation(Required=false)]
        public string OriginalStatement { get; set; }

        // 权利信息
        [NameInMap("right_info")]
        [Validation(Required=true)]
        public DciRightInfo RightInfo { get; set; }

        // 真实意愿表达信息
        [NameInMap("pre_registration_true_will")]
        [Validation(Required=true)]
        public string PreRegistrationTrueWill { get; set; }

        // dci用户id
        [NameInMap("dci_user_id")]
        [Validation(Required=true)]
        public string DciUserId { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=false)]
        public ProxyData ProxyData { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 作品类型相似度
        [NameInMap("category_similar_ratio")]
        [Validation(Required=false)]
        public string CategorySimilarRatio { get; set; }

        // 作品类型风险等级
        [NameInMap("category_risk_rank")]
        [Validation(Required=false)]
        public string CategoryRiskRank { get; set; }

        // 著作权人用户id List
        [NameInMap("copyright_owner_ids")]
        [Validation(Required=true)]
        public List<string> CopyrightOwnerIds { get; set; }

        // DCI类型
        [NameInMap("apply_type")]
        [Validation(Required=false)]
        public string ApplyType { get; set; }

        // 渠道标签
        [NameInMap("channel_terminal")]
        [Validation(Required=false)]
        public string ChannelTerminal { get; set; }

        // 推荐分类明细信息
        [NameInMap("recommend_category_list")]
        [Validation(Required=false)]
        public List<RecommendCategoryDetail> RecommendCategoryList { get; set; }

        // 证书样式ID
        [NameInMap("customize_cert_id")]
        [Validation(Required=false)]
        public string CustomizeCertId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
