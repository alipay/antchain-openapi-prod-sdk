// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidServiceInfo extends TeaModel {
    // 服务的end point info
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxxxx">http://xxxxxx</a></p>
     */
    @NameInMap("end_point")
    @Validation(required = true)
    public String endPoint;

    // 扩展字段信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;item1&quot;:&quot;&quot;}</p>
     */
    @NameInMap("extension_info")
    @Validation(required = true)
    public String extensionInfo;

    public static DidServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        DidServiceInfo self = new DidServiceInfo();
        return TeaModel.build(map, self);
    }

    public DidServiceInfo setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public DidServiceInfo setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

}
