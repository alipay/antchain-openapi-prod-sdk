// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 鉴权规则组列表模型
    public class AuthRuleGroupListModelVO : TeaModel {
        // 应用名称, 多个应用逗号分隔
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 黑名单组id
        [NameInMap("black_group_id")]
        [Validation(Required=false)]
        public long? BlackGroupId { get; set; }

        // 黑名单状态（1开启/0关闭）
        [NameInMap("black_state")]
        [Validation(Required=false)]
        public long? BlackState { get; set; }

        // 鉴权源
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 鉴权规则列表
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<AuthRuleModelVO> Rules { get; set; }

        // 生效状态（0 失败, 1 成功, 2 部分失败）
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 白名单组id
        [NameInMap("white_group_id")]
        [Validation(Required=false)]
        public long? WhiteGroupId { get; set; }

        // 白名单状态（1开启/0关闭）
        [NameInMap("white_state")]
        [Validation(Required=false)]
        public long? WhiteState { get; set; }

        // 变更状态
        [NameInMap("change_status")]
        [Validation(Required=false)]
        public string ChangeStatus { get; set; }

    }

}
