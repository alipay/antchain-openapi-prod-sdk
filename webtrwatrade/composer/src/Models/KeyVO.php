<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class KeyVO extends Model
{
    // 密钥id
    /**
     * @example 1
     *
     * @var string
     */
    public $keyId;

    // 密钥名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 创建类型
    // KEY_FILE：上传密钥文件
    // CREATE_NEW_KEY：系统创建密钥
    /**
     * @example KEY_FILE
     *
     * @var string
     */
    public $type;

    // 钱包地址
    /**
     * @example 0x11111
     *
     * @var string
     */
    public $address;

    // 关联项目数量
    /**
     * @example 1
     *
     * @var string
     */
    public $quantity;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreated;

    // 是否支持删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleteEnable;

    // 资产项目信息
    /**
     * @example
     *
     * @var KeyProjectInfo
     */
    public $assetProjectInfo;
    protected $_name = [
        'keyId'            => 'key_id',
        'name'             => 'name',
        'type'             => 'type',
        'address'          => 'address',
        'quantity'         => 'quantity',
        'gmtCreated'       => 'gmt_created',
        'deleteEnable'     => 'delete_enable',
        'assetProjectInfo' => 'asset_project_info',
    ];

    public function validate()
    {
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('deleteEnable', $this->deleteEnable, true);
        Model::validateRequired('assetProjectInfo', $this->assetProjectInfo, true);
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->deleteEnable) {
            $res['delete_enable'] = $this->deleteEnable;
        }
        if (null !== $this->assetProjectInfo) {
            $res['asset_project_info'] = null !== $this->assetProjectInfo ? $this->assetProjectInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KeyVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['delete_enable'])) {
            $model->deleteEnable = $map['delete_enable'];
        }
        if (isset($map['asset_project_info'])) {
            $model->assetProjectInfo = KeyProjectInfo::fromMap($map['asset_project_info']);
        }

        return $model;
    }
}
