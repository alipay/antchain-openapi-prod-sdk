// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ComputerInfo extends TeaModel {
    // 颜色
    @NameInMap("colour")
    public String colour;

    // 色值
    @NameInMap("colour_number")
    public String colourNumber;

    // 电脑型号
    @NameInMap("computer_model")
    public String computerModel;

    // 配置参数
    @NameInMap("config_param")
    public String configParam;

    // 显卡
    @NameInMap("video_card")
    public String videoCard;

    // 屏幕
    @NameInMap("screen_size")
    public String screenSize;

    // 电脑CPU
    @NameInMap("cpu")
    @Validation(required = true)
    public String cpu;

    // 电脑内存
    @NameInMap("memory")
    @Validation(required = true)
    public String memory;

    // 电脑硬盘
    @NameInMap("disk_size")
    @Validation(required = true)
    public String diskSize;

    public static ComputerInfo build(java.util.Map<String, ?> map) throws Exception {
        ComputerInfo self = new ComputerInfo();
        return TeaModel.build(map, self);
    }

    public ComputerInfo setColour(String colour) {
        this.colour = colour;
        return this;
    }
    public String getColour() {
        return this.colour;
    }

    public ComputerInfo setColourNumber(String colourNumber) {
        this.colourNumber = colourNumber;
        return this;
    }
    public String getColourNumber() {
        return this.colourNumber;
    }

    public ComputerInfo setComputerModel(String computerModel) {
        this.computerModel = computerModel;
        return this;
    }
    public String getComputerModel() {
        return this.computerModel;
    }

    public ComputerInfo setConfigParam(String configParam) {
        this.configParam = configParam;
        return this;
    }
    public String getConfigParam() {
        return this.configParam;
    }

    public ComputerInfo setVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }
    public String getVideoCard() {
        return this.videoCard;
    }

    public ComputerInfo setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public String getScreenSize() {
        return this.screenSize;
    }

    public ComputerInfo setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public ComputerInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public ComputerInfo setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

}
