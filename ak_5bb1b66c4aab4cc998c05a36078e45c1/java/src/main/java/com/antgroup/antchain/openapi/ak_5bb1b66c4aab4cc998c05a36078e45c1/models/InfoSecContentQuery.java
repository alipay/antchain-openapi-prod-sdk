// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class InfoSecContentQuery extends TeaModel {
    // 123
    @NameInMap("app_scene")
    public String appScene;

    // 123
    @NameInMap("app_scene_data_id")
    public String appSceneDataId;

    // 123
    @NameInMap("event_id")
    public String eventId;

    public static InfoSecContentQuery build(java.util.Map<String, ?> map) throws Exception {
        InfoSecContentQuery self = new InfoSecContentQuery();
        return TeaModel.build(map, self);
    }

    public InfoSecContentQuery setAppScene(String appScene) {
        this.appScene = appScene;
        return this;
    }
    public String getAppScene() {
        return this.appScene;
    }

    public InfoSecContentQuery setAppSceneDataId(String appSceneDataId) {
        this.appSceneDataId = appSceneDataId;
        return this;
    }
    public String getAppSceneDataId() {
        return this.appSceneDataId;
    }

    public InfoSecContentQuery setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

}
