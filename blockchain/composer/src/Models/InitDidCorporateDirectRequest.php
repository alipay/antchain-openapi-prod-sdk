<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitDidCorporateDirectRequest extends Model
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

    // 扩展字段
    /**
     * @var string
     */
    public $extension;

    // owner名
    /**
     * @var string
     */
    public $ownerName;

    // 租户自有用户的唯1号，每个owner_uid只能申请一个did
    /**
     * @var string
     */
    public $ownerUid;

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // did doc service信息列表
    /**
     * @var DisServicesInfo[]
     */
    public $services;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extension'         => 'extension',
        'ownerName'         => 'owner_name',
        'ownerUid'          => 'owner_uid',
        'publicKey'         => 'public_key',
        'services'          => 'services',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('ownerUid', $this->ownerUid, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
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
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->ownerUid) {
            $res['owner_uid'] = $this->ownerUid;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->services) {
            $res['services'] = [];
            if (null !== $this->services && \is_array($this->services)) {
                $n = 0;
                foreach ($this->services as $item) {
                    $res['services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDidCorporateDirectRequest
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
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['owner_uid'])) {
            $model->ownerUid = $map['owner_uid'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['services'])) {
            if (!empty($map['services'])) {
                $model->services = [];
                $n               = 0;
                foreach ($map['services'] as $item) {
                    $model->services[$n++] = null !== $item ? DisServicesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
