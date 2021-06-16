// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    // 原文件的可访问路径
    @NameInMap("original_file_path")
    @Validation(required = true)
    public String originalFilePath;

    // 缩略图的可访问路径
    @NameInMap("mini_image_path")
    @Validation(required = true)
    public String miniImagePath;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // IMAGE("IMAGE","图片"),
    // VIDEO("VIDEO","视频"),
    // ;
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setOriginalFilePath(String originalFilePath) {
        this.originalFilePath = originalFilePath;
        return this;
    }
    public String getOriginalFilePath() {
        return this.originalFilePath;
    }

    public File setMiniImagePath(String miniImagePath) {
        this.miniImagePath = miniImagePath;
        return this;
    }
    public String getMiniImagePath() {
        return this.miniImagePath;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public File setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
