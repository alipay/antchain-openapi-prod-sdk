// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMktEffectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求id，每一次请求保持唯一；若重复，则更新原数据；
        [NameInMap("request_id")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestId { get; set; }

        // 产品编码，蚂蚁分配
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ProductCode { get; set; }

        // 项目ID，待蚂蚁分配
        [NameInMap("project_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ProjectId { get; set; }

        // 营销模式
        [NameInMap("marketing_mode")]
        [Validation(Required=true, MaxLength=64)]
        public string MarketingMode { get; set; }

        // 投保特征短链
        [NameInMap("insure_short_url")]
        [Validation(Required=false, MaxLength=256)]
        public string InsureShortUrl { get; set; }

        // 加密类型：MD5，32位[小]
        [NameInMap("encryption_type")]
        [Validation(Required=true, MaxLength=32)]
        public string EncryptionType { get; set; }

        // 加密用户标识
        [NameInMap("encrypted_user_id")]
        [Validation(Required=true, MaxLength=64)]
        public string EncryptedUserId { get; set; }

        // 用户点击投保页唯一标识
        [NameInMap("click_id")]
        [Validation(Required=true, MaxLength=128)]
        public string ClickId { get; set; }

        // 用户点击进入页面时间（格式：yyyy-MM-dd HH:mm:ss）
        [NameInMap("click_time")]
        [Validation(Required=true, MaxLength=32)]
        public string ClickTime { get; set; }

        // 事件完成时间（yyyy-MM-dd HH:mm:ss）
        [NameInMap("event_time")]
        [Validation(Required=true, MaxLength=32)]
        public string EventTime { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true, MaxLength=64)]
        public string NodeType { get; set; }

        // 节点详细信息
        [NameInMap("node_info")]
        [Validation(Required=false, MaxLength=1024)]
        public string NodeInfo { get; set; }

    }

}
