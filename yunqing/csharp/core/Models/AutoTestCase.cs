// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 测试用例详情
    public class AutoTestCase : TeaModel {
        // 测试应用本身的名字
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 测试应用本身的版本
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        // case的级别
        [NameInMap("case_level")]
        [Validation(Required=true)]
        public string CaseLevel { get; set; }

        // case的名字
        [NameInMap("case_name")]
        [Validation(Required=true)]
        public string CaseName { get; set; }

        // case的状态
        [NameInMap("case_status")]
        [Validation(Required=true)]
        public string CaseStatus { get; set; }

        // case的类型
        [NameInMap("case_type")]
        [Validation(Required=true)]
        public string CaseType { get; set; }

        // case的类
        [NameInMap("class_name")]
        [Validation(Required=true)]
        public string ClassName { get; set; }

        // 详情
        [NameInMap("detail")]
        [Validation(Required=false)]
        public string Detail { get; set; }

        // case运行的时间，单位毫秒
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // case的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 测试方法名
        [NameInMap("method_name")]
        [Validation(Required=true)]
        public string MethodName { get; set; }

    }

}
