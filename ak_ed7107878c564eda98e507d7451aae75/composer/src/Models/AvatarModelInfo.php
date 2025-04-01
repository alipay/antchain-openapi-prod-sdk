<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarModelInfo extends Model
{
    // 数字人形象id
    /**
     * @example 1886
     *
     * @var int
     */
    public $modelId;

    // 数字人形象名
    /**
     * @example 小忆
     *
     * @var string
     */
    public $modelName;

    // 数字人形象默认音色列表
    /**
     * @example ["269"]
     *
     * @var string[]
     */
    public $voiceList;

    // 数字人形象预览图
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $image;
    protected $_name = [
        'modelId'   => 'model_id',
        'modelName' => 'model_name',
        'voiceList' => 'voice_list',
        'image'     => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('voiceList', $this->voiceList, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->voiceList) {
            $res['voice_list'] = $this->voiceList;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarModelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['voice_list'])) {
            if (!empty($map['voice_list'])) {
                $model->voiceList = $map['voice_list'];
            }
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
