// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class CreateConsoleSceneDomainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    // 用于排查问题
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 客户填自己需要绑定的小程序名称
    @NameInMap("mini_program_name")
    @Validation(required = true)
    public String miniProgramName;

    // 所属平台，微信、支付宝
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    // 校验文件的名称
    @NameInMap("check_file_name")
    @Validation(required = true)
    public String checkFileName;

    // 填校验文件里面的内容
    @NameInMap("check_file_body")
    @Validation(required = true)
    public String checkFileBody;

    public static CreateConsoleSceneDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsoleSceneDomainRequest self = new CreateConsoleSceneDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsoleSceneDomainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsoleSceneDomainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsoleSceneDomainRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateConsoleSceneDomainRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateConsoleSceneDomainRequest setMiniProgramName(String miniProgramName) {
        this.miniProgramName = miniProgramName;
        return this;
    }
    public String getMiniProgramName() {
        return this.miniProgramName;
    }

    public CreateConsoleSceneDomainRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateConsoleSceneDomainRequest setCheckFileName(String checkFileName) {
        this.checkFileName = checkFileName;
        return this;
    }
    public String getCheckFileName() {
        return this.checkFileName;
    }

    public CreateConsoleSceneDomainRequest setCheckFileBody(String checkFileBody) {
        this.checkFileBody = checkFileBody;
        return this;
    }
    public String getCheckFileBody() {
        return this.checkFileBody;
    }

}
