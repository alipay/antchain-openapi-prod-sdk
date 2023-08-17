// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class CreateItagAntitagTaskRequestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // taskname
        [NameInMap("taskname")]
        [Validation(Required=false)]
        public string Taskname { get; set; }

        // templateid
        [NameInMap("templateid")]
        [Validation(Required=false)]
        public string Templateid { get; set; }

        // projectid
        [NameInMap("projectid")]
        [Validation(Required=false)]
        public string Projectid { get; set; }

        // AssignConfig
        [NameInMap("assignconfig")]
        [Validation(Required=false)]
        public AssignConfig Assignconfig { get; set; }

        // TaskWorkFlow
        [NameInMap("taskworkflow")]
        [Validation(Required=false)]
        public ITagTaskWorkflowConfig Taskworkflow { get; set; }

        // admins
        [NameInMap("admins")]
        [Validation(Required=false)]
        public List<Admins> Admins { get; set; }

        // datasetproxyrelations
        [NameInMap("datasetproxyrelations")]
        [Validation(Required=false)]
        public List<DatasetProxyRelations> Datasetproxyrelations { get; set; }

        // bizinfo
        [NameInMap("bizinfo")]
        [Validation(Required=false)]
        public BizInfo Bizinfo { get; set; }

        // tasktemplateconfig
        [NameInMap("tasktemplateconfig")]
        [Validation(Required=false)]
        public TaskTemplateConfig Tasktemplateconfig { get; set; }

        // Exif
        [NameInMap("exif")]
        [Validation(Required=false)]
        public Exif Exif { get; set; }

        // tntinstid
        [NameInMap("tntinstid")]
        [Validation(Required=false)]
        public string Tntinstid { get; set; }

    }

}
