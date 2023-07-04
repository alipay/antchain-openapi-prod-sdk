// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class OpsSpec extends TeaModel {
    // 需要下线的pod列表
    @NameInMap("offline_pod")
    public java.util.List<String> offlinePod;

    // 发布灰度策略
    @NameInMap("gray_release")
    public GrayRelease grayRelease;

    public static OpsSpec build(java.util.Map<String, ?> map) throws Exception {
        OpsSpec self = new OpsSpec();
        return TeaModel.build(map, self);
    }

    public OpsSpec setOfflinePod(java.util.List<String> offlinePod) {
        this.offlinePod = offlinePod;
        return this;
    }
    public java.util.List<String> getOfflinePod() {
        return this.offlinePod;
    }

    public OpsSpec setGrayRelease(GrayRelease grayRelease) {
        this.grayRelease = grayRelease;
        return this;
    }
    public GrayRelease getGrayRelease() {
        return this.grayRelease;
    }

}
