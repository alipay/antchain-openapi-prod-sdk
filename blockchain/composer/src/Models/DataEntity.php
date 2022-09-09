<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DataEntity extends Model
{
    // 授权状态
    /**
     * @example AUTHORIZED
     *
     * @var string
     */
    public $authStatus;

    // 业务系统唯一标示
    /**
     * @example 76a0e716164848168dc726460042ee25
     *
     * @var string
     */
    public $bizUid;

    // 区块链ID
    /**
     * @example 8c777cf9a71b660233215b6337dca78d
     *
     * @var string
     */
    public $blockchainId;

    // 数据类别
    /**
     * @example TABLE,FILE...
     *
     * @var string
     */
    public $category;

    // 数据ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $dataId;

    // 数据模型ID
    /**
     * @example DATA_MODEL_Q23
     *
     * @var string
     */
    public $dataModelId;

    // 扩展信息，标准JSON格式
    /**
     * @example {"strategy":"test”}
     *
     * @var string
     */
    public $extensionInfo;

    // 数据名称
    /**
     * @example testdata
     *
     * @var string
     */
    public $name;

    // 数据所有者ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $ownerId;

    // 流程节点信息
    /**
     * @example
     *
     * @var ProcessNode[]
     */
    public $processTemplate;

    // 数据状态
    /**
     * @example ACTIVE,DELETED...
     *
     * @var string
     */
    public $status;

    // 创建时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $createTime;

    // 修改时间
    /**
     * @example 1592810480442
     *
     * @var int
     */
    public $updateTime;

    // DID doc里的公开信息
    /**
     * @example {}
     *
     * @var string
     */
    public $publicInfo;
    protected $_name = [
        'authStatus'      => 'auth_status',
        'bizUid'          => 'biz_uid',
        'blockchainId'    => 'blockchain_id',
        'category'        => 'category',
        'dataId'          => 'data_id',
        'dataModelId'     => 'data_model_id',
        'extensionInfo'   => 'extension_info',
        'name'            => 'name',
        'ownerId'         => 'owner_id',
        'processTemplate' => 'process_template',
        'status'          => 'status',
        'createTime'      => 'create_time',
        'updateTime'      => 'update_time',
        'publicInfo'      => 'public_info',
    ];

    public function validate()
    {
        Model::validateMaxLength('bizUid', $this->bizUid, 64);
        Model::validateMaxLength('category', $this->category, 32);
        Model::validateMaxLength('dataId', $this->dataId, 100);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMaxLength('ownerId', $this->ownerId, 100);
        Model::validateMaxLength('status', $this->status, 16);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('ownerId', $this->ownerId, true);
        Model::validateRequired('createTime', $this->createTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->publicInfo) {
            $res['public_info'] = $this->publicInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['public_info'])) {
            $model->publicInfo = $map['public_info'];
        }

        return $model;
    }
}
