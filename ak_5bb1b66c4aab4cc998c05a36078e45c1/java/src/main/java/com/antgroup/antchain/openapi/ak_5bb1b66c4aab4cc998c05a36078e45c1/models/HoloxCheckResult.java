// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class HoloxCheckResult extends TeaModel {
    // 是否成功
    @NameInMap("sucess")
    public Boolean sucess;

    // 本次调用id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 结果码
    @NameInMap("result_code")
    public String resultCode;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 结果信息
    @NameInMap("result_message")
    public String resultMessage;

    // 213
    @NameInMap("warn_action")
    public String warnAction;

    // 123
    @NameInMap("content_property_output_result_map")
    @Validation(required = true)
    public String contentPropertyOutputResultMap;

    // 213
    @NameInMap("hit_result_items")
    public String hitResultItems;

    public static HoloxCheckResult build(java.util.Map<String, ?> map) throws Exception {
        HoloxCheckResult self = new HoloxCheckResult();
        return TeaModel.build(map, self);
    }

    public HoloxCheckResult setSucess(Boolean sucess) {
        this.sucess = sucess;
        return this;
    }
    public Boolean getSucess() {
        return this.sucess;
    }

    public HoloxCheckResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public HoloxCheckResult setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public HoloxCheckResult setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public HoloxCheckResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public HoloxCheckResult setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public HoloxCheckResult setWarnAction(String warnAction) {
        this.warnAction = warnAction;
        return this;
    }
    public String getWarnAction() {
        return this.warnAction;
    }

    public HoloxCheckResult setContentPropertyOutputResultMap(String contentPropertyOutputResultMap) {
        this.contentPropertyOutputResultMap = contentPropertyOutputResultMap;
        return this;
    }
    public String getContentPropertyOutputResultMap() {
        return this.contentPropertyOutputResultMap;
    }

    public HoloxCheckResult setHitResultItems(String hitResultItems) {
        this.hitResultItems = hitResultItems;
        return this;
    }
    public String getHitResultItems() {
        return this.hitResultItems;
    }

}
