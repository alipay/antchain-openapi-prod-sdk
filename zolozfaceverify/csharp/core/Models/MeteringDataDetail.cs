// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    // 计量详细结果
    public class MeteringDataDetail : TeaModel {
        // 比对通过
        [NameInMap("identify_passed_pv")]
        [Validation(Required=false)]
        public long? IdentifyPassedPv { get; set; }

        // 上传服务端成功
        [NameInMap("identify_succeed_pv")]
        [Validation(Required=false)]
        public long? IdentifySucceedPv { get; set; }

        // 计量类型
        [NameInMap("metering_type")]
        [Validation(Required=false)]
        public string MeteringType { get; set; }

        // 产品渲染（SDK唤起）
        [NameInMap("prod_start_pv")]
        [Validation(Required=false)]
        public long? ProdStartPv { get; set; }

        // 查询结果通过
        [NameInMap("query_passed_pv")]
        [Validation(Required=false)]
        public long? QueryPassedPv { get; set; }

        // 发起查询
        [NameInMap("query_succeed_pv")]
        [Validation(Required=false)]
        public long? QuerySucceedPv { get; set; }

        // 可用性检查通过
        [NameInMap("usable_passed_pv")]
        [Validation(Required=false)]
        public long? UsablePassedPv { get; set; }

        // 可用性检查开始
        [NameInMap("usable_start_pv")]
        [Validation(Required=false)]
        public long? UsableStartPv { get; set; }

    }

}
