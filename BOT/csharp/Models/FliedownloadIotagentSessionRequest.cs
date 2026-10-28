// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class FliedownloadIotagentSessionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 空间id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 文件id
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 智能体id
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

    }

}
