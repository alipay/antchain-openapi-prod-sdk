// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class SceneInformation extends TeaModel {
    // 场所地址
    @NameInMap("scene_address")
    @Validation(required = true)
    public String sceneAddress;

    // 场所ID
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    public static SceneInformation build(java.util.Map<String, ?> map) throws Exception {
        SceneInformation self = new SceneInformation();
        return TeaModel.build(map, self);
    }

    public SceneInformation setSceneAddress(String sceneAddress) {
        this.sceneAddress = sceneAddress;
        return this;
    }
    public String getSceneAddress() {
        return this.sceneAddress;
    }

    public SceneInformation setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
