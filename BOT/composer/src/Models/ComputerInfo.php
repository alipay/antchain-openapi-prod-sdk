<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ComputerInfo extends Model
{
    // 颜色
    /**
     * @example 红色
     *
     * @var string
     */
    public $colour;

    // 色值
    /**
     * @example #BA0F2F
     *
     * @var string
     */
    public $colourNumber;

    // 电脑型号
    /**
     * @example X100
     *
     * @var string
     */
    public $computerModel;

    // 配置参数
    /**
     * @example {""}
     *
     * @var string
     */
    public $configParam;

    // 显卡
    /**
     * @example GTX3080
     *
     * @var string
     */
    public $videoCard;

    // 屏幕
    /**
     * @example 27
     *
     * @var string
     */
    public $screenSize;

    // 电脑CPU
    /**
     * @example i9
     *
     * @var string
     */
    public $cpu;

    // 电脑内存
    /**
     * @example 16GB
     *
     * @var string
     */
    public $memory;

    // 电脑硬盘
    /**
     * @example 500GB
     *
     * @var string
     */
    public $diskSize;
    protected $_name = [
        'colour'        => 'colour',
        'colourNumber'  => 'colour_number',
        'computerModel' => 'computer_model',
        'configParam'   => 'config_param',
        'videoCard'     => 'video_card',
        'screenSize'    => 'screen_size',
        'cpu'           => 'cpu',
        'memory'        => 'memory',
        'diskSize'      => 'disk_size',
    ];

    public function validate()
    {
        Model::validateRequired('cpu', $this->cpu, true);
        Model::validateRequired('memory', $this->memory, true);
        Model::validateRequired('diskSize', $this->diskSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->colour) {
            $res['colour'] = $this->colour;
        }
        if (null !== $this->colourNumber) {
            $res['colour_number'] = $this->colourNumber;
        }
        if (null !== $this->computerModel) {
            $res['computer_model'] = $this->computerModel;
        }
        if (null !== $this->configParam) {
            $res['config_param'] = $this->configParam;
        }
        if (null !== $this->videoCard) {
            $res['video_card'] = $this->videoCard;
        }
        if (null !== $this->screenSize) {
            $res['screen_size'] = $this->screenSize;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->diskSize) {
            $res['disk_size'] = $this->diskSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['colour'])) {
            $model->colour = $map['colour'];
        }
        if (isset($map['colour_number'])) {
            $model->colourNumber = $map['colour_number'];
        }
        if (isset($map['computer_model'])) {
            $model->computerModel = $map['computer_model'];
        }
        if (isset($map['config_param'])) {
            $model->configParam = $map['config_param'];
        }
        if (isset($map['video_card'])) {
            $model->videoCard = $map['video_card'];
        }
        if (isset($map['screen_size'])) {
            $model->screenSize = $map['screen_size'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['disk_size'])) {
            $model->diskSize = $map['disk_size'];
        }

        return $model;
    }
}
