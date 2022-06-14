// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class SceneInfo extends TeaModel {
    // 场所名称
    @NameInMap("scene_name")
    public String sceneName;

    // 场所码
    @NameInMap("scene_code")
    public String sceneCode;

    public static SceneInfo build(java.util.Map<String, ?> map) throws Exception {
        SceneInfo self = new SceneInfo();
        return TeaModel.build(map, self);
    }

    public SceneInfo setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public SceneInfo setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
