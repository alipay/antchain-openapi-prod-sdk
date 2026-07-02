// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PublishIotlinkAppreleaseorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用包id
    @NameInMap("apk_id")
    @Validation(required = true)
    public String apkId;

    // 发布方式
    // DEVICE：指定设备发布
    // VERSION：指定版本发布
    @NameInMap("release_mode")
    @Validation(required = true)
    public String releaseMode;

    // 指定发布方式的数据列表
    // 发布方式为DEVICE，字段为设备did列表；
    // 发布方式为VERSION，字段为应用包id列表；
    @NameInMap("data_list")
    @Validation(required = true)
    public java.util.List<String> dataList;

    // 对于数据列表中的设备存在升级中的任务是否覆盖安装？否：返回升级中的设备列表；是：取消升级中的设备升级任务，使用新的任务覆盖升级
    @NameInMap("cover")
    @Validation(required = true)
    public Boolean cover;

    public static PublishIotlinkAppreleaseorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishIotlinkAppreleaseorderRequest self = new PublishIotlinkAppreleaseorderRequest();
        return TeaModel.build(map, self);
    }

    public PublishIotlinkAppreleaseorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishIotlinkAppreleaseorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishIotlinkAppreleaseorderRequest setApkId(String apkId) {
        this.apkId = apkId;
        return this;
    }
    public String getApkId() {
        return this.apkId;
    }

    public PublishIotlinkAppreleaseorderRequest setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public PublishIotlinkAppreleaseorderRequest setDataList(java.util.List<String> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<String> getDataList() {
        return this.dataList;
    }

    public PublishIotlinkAppreleaseorderRequest setCover(Boolean cover) {
        this.cover = cover;
        return this;
    }
    public Boolean getCover() {
        return this.cover;
    }

}
