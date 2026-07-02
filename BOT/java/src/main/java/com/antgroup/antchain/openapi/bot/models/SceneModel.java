// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SceneModel extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 场景名
    /**
     * <strong>example:</strong>
     * <p>testScene</p>
     */
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 是否托管
    /**
     * <strong>example:</strong>
     * <p>ESCROWED</p>
     */
    @NameInMap("escrowed")
    public String escrowed;

    // 私钥密码
    /**
     * <strong>example:</strong>
     * <p>MEUCI..</p>
     */
    @NameInMap("private_key_password")
    public String privateKeyPassword;

    // 租户
    /**
     * <strong>example:</strong>
     * <p>testTenant</p>
     */
    @NameInMap("tenant_name")
    public String tenantName;

    // 场景类型
    /**
     * <strong>example:</strong>
     * <p>共享单车</p>
     */
    @NameInMap("scene_type")
    public String sceneType;

    // 是否跳过中台数据校验处理
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("skip_pegasus")
    public Boolean skipPegasus;

    // 定制数据处理类 , 使用用逗号分隔
    /**
     * <strong>example:</strong>
     * <p>XXX_GPS_PROCESSOR</p>
     */
    @NameInMap("customer_processor")
    public String customerProcessor;

    public static SceneModel build(java.util.Map<String, ?> map) throws Exception {
        SceneModel self = new SceneModel();
        return TeaModel.build(map, self);
    }

    public SceneModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SceneModel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SceneModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SceneModel setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public SceneModel setEscrowed(String escrowed) {
        this.escrowed = escrowed;
        return this;
    }
    public String getEscrowed() {
        return this.escrowed;
    }

    public SceneModel setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
        return this;
    }
    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public SceneModel setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public SceneModel setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public SceneModel setSkipPegasus(Boolean skipPegasus) {
        this.skipPegasus = skipPegasus;
        return this;
    }
    public Boolean getSkipPegasus() {
        return this.skipPegasus;
    }

    public SceneModel setCustomerProcessor(String customerProcessor) {
        this.customerProcessor = customerProcessor;
        return this;
    }
    public String getCustomerProcessor() {
        return this.customerProcessor;
    }

}
