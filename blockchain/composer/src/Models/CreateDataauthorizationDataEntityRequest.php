<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationDataEntityRequest extends Model
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

    // 业务系统数据对象唯一标示
    /**
     * @var string
     */
    public $bizUid;

    // 区块链ID
    /**
     * @var string
     */
    public $blockchainId;

    // 数据类别
    /**
     * @var string
     */
    public $category;

    // 数据模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 扩展参数，标准JSON格式
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

    // 审批模版
    /**
     * @var ProcessNode[]
     */
    public $processTemplate;

    // DID doc里的公开信息
    /**
     * @var string
     */
    public $publicInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUid'            => 'biz_uid',
        'blockchainId'      => 'blockchain_id',
        'category'          => 'category',
        'dataModelId'       => 'data_model_id',
        'extensionInfo'     => 'extension_info',
        'name'              => 'name',
        'ownerId'           => 'owner_id',
        'processTemplate'   => 'process_template',
        'publicInfo'        => 'public_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('ownerId', $this->ownerId, true);
        Model::validateMaxLength('category', $this->category, 32);
        Model::validateMaxLength('extensionInfo', $this->extensionInfo, 2000);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMaxLength('ownerId', $this->ownerId, 100);
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
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->blockchainId) {
            $res['blockchain_id'] = $this->blockchainId;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
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
        if (null !== $this->publicInfo) {
            $res['public_info'] = $this->publicInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationDataEntityRequest
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
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['blockchain_id'])) {
            $model->blockchainId = $map['blockchain_id'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
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
        if (isset($map['public_info'])) {
            $model->publicInfo = $map['public_info'];
        }

        return $model;
    }
}
