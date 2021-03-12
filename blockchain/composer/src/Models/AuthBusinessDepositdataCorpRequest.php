<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AuthBusinessDepositdataCorpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 被授权的存证数据所在的链
    /**
     * @var string
     */
    public $bizId;

    // 被授权者的did数字身份
    /**
     * @var string
     */
    public $did;

    // 授权的截止日期，超过该日期后，该组织不再具有访问加密数据的权限
    /**
     * @var string
     */
    public $dueTime;

    // 被授权的组织名
    /**
     * @var string
     */
    public $grantedCorp;

    // 被授权的字段
    /**
     * @var string[]
     */
    public $itemKeyId;

    // 被授权的存证内容逻辑主键
    /**
     * @var string
     */
    public $keyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'did'               => 'did',
        'dueTime'           => 'due_time',
        'grantedCorp'       => 'granted_corp',
        'itemKeyId'         => 'item_key_id',
        'keyId'             => 'key_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('dueTime', $this->dueTime, true);
        Model::validateRequired('grantedCorp', $this->grantedCorp, true);
        Model::validateRequired('itemKeyId', $this->itemKeyId, true);
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validatePattern('dueTime', $this->dueTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->dueTime) {
            $res['due_time'] = $this->dueTime;
        }
        if (null !== $this->grantedCorp) {
            $res['granted_corp'] = $this->grantedCorp;
        }
        if (null !== $this->itemKeyId) {
            $res['item_key_id'] = $this->itemKeyId;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthBusinessDepositdataCorpRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['due_time'])) {
            $model->dueTime = $map['due_time'];
        }
        if (isset($map['granted_corp'])) {
            $model->grantedCorp = $map['granted_corp'];
        }
        if (isset($map['item_key_id'])) {
            if (!empty($map['item_key_id'])) {
                $model->itemKeyId = $map['item_key_id'];
            }
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }

        return $model;
    }
}
