// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 仓库扫描策略
    public class RepoScanStrategy : TeaModel {
        // 策略ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 仓库ID
        [NameInMap("repo_id")]
        [Validation(Required=true)]
        public string RepoId { get; set; }

        // 仓库列表
        [NameInMap("projects")]
        [Validation(Required=true)]
        public List<string> Projects { get; set; }

        // 仓库列表
        [NameInMap("repositories")]
        [Validation(Required=true)]
        public List<string> Repositories { get; set; }

        // 扫描开始时间
        [NameInMap("image_begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ImageBeginTime { get; set; }

        // 定时扫描任务
        [NameInMap("crontab")]
        [Validation(Required=true)]
        public string Crontab { get; set; }

        // 下个日期
        [NameInMap("next_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string NextDate { get; set; }

        // 策略状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

    }

}
