<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarLlmModelInfo extends Model
{
    // 模型id
    /**
     * @example 8810606430954027635
     *
     * @var string
     */
    public $modelId;

    // 模型名称
    /**
     * @example 百炼
     *
     * @var string
     */
    public $modelName;

    // 模型编码
    /**
     * @example bailian
     *
     * @var string
     */
    public $modelCode;

    // 模型描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 模型图片url
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $imageUrl;
    protected $_name = [
        'modelId'     => 'model_id',
        'modelName'   => 'model_name',
        'modelCode'   => 'model_code',
        'description' => 'description',
        'imageUrl'    => 'image_url',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
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
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarLlmModelInfo
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
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }

        return $model;
    }
}
