<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDataauthorizationDataEntityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数据类别
    /**
     * @var string
     */
    public $category;

    // 数据ID
    /**
     * @var string
     */
    public $dataId;

    // 数据模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;

    // 数据名称
    /**
     * @var string
     */
    public $name;

    // 数据所有者ID
    /**
     * @var string
     */
    public $ownerId;

    // 流程模版
    /**
     * @var ProcessNode[]
     */
    public $processTemplate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'category'          => 'category',
        'dataId'            => 'data_id',
        'dataModelId'       => 'data_model_id',
        'extensionInfo'     => 'extension_info',
        'name'              => 'name',
        'ownerId'           => 'owner_id',
        'processTemplate'   => 'process_template',
    ];

    public function validate()
    {
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('ownerId', $this->ownerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }
        if (null !== $this->processTemplate) {
            $res['process_template'] = [];
            if (null !== $this->processTemplate && \is_array($this->processTemplate)) {
                $n = 0;
                foreach ($this->processTemplate as $item) {
                    $res['process_template'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDataauthorizationDataEntityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }
        if (isset($map['process_template'])) {
            if (!empty($map['process_template'])) {
                $model->processTemplate = [];
                $n                      = 0;
                foreach ($map['process_template'] as $item) {
                    $model->processTemplate[$n++] = null !== $item ? ProcessNode::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
