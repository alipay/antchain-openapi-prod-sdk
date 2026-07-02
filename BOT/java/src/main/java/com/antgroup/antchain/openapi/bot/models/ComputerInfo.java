// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ComputerInfo extends TeaModel {
    // 颜色
    /**
     * <strong>example:</strong>
     * <p>红色</p>
     */
    @NameInMap("colour")
    public String colour;

    // 色值
    /**
     * <strong>example:</strong>
     * <p>#BA0F2F</p>
     */
    @NameInMap("colour_number")
    public String colourNumber;

    // 电脑型号
    /**
     * <strong>example:</strong>
     * <p>X100</p>
     */
    @NameInMap("computer_model")
    public String computerModel;

    // 配置参数
    /**
     * <strong>example:</strong>
     * <p>{&quot;&quot;}</p>
     */
    @NameInMap("config_param")
    public String configParam;

    // 显卡
    /**
     * <strong>example:</strong>
     * <p>GTX3080</p>
     */
    @NameInMap("video_card")
    public String videoCard;

    // 屏幕
    /**
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("screen_size")
    public String screenSize;

    // 电脑CPU
    /**
     * <strong>example:</strong>
     * <p>i9</p>
     */
    @NameInMap("cpu")
    @Validation(required = true)
    public String cpu;

    // 电脑内存
    /**
     * <strong>example:</strong>
     * <p>16GB</p>
     */
    @NameInMap("memory")
    @Validation(required = true)
    public String memory;

    // 电脑硬盘
    /**
     * <strong>example:</strong>
     * <p>500GB</p>
     */
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
