<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessContractGrantdidRequest extends Model
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

    // 租户业务链地址biz_id
    /**
     * @var string
     */
    public $bizId;

    // 授权的合约名称
    /**
     * @var string
     */
    public $contractName;

    // 用户did身份
    /**
     * @var string
     */
    public $did;

    // 授权截止日期
    /**
     * @var string
     */
    public $dueTime;

    // 被授权者身份
    /**
     * @var string
     */
    public $grantedDid;

    // 授权的字段
    /**
     * @var string[]
     */
    public $itemIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contractName'      => 'contract_name',
        'did'               => 'did',
        'dueTime'           => 'due_time',
        'grantedDid'        => 'granted_did',
        'itemIds'           => 'item_ids',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('dueTime', $this->dueTime, true);
        Model::validateRequired('grantedDid', $this->grantedDid, true);
        Model::validateRequired('itemIds', $this->itemIds, true);
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
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->dueTime) {
            $res['due_time'] = $this->dueTime;
        }
        if (null !== $this->grantedDid) {
            $res['granted_did'] = $this->grantedDid;
        }
        if (null !== $this->itemIds) {
            $res['item_ids'] = $this->itemIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBusinessContractGrantdidRequest
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
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['due_time'])) {
            $model->dueTime = $map['due_time'];
        }
        if (isset($map['granted_did'])) {
            $model->grantedDid = $map['granted_did'];
        }
        if (isset($map['item_ids'])) {
            if (!empty($map['item_ids'])) {
                $model->itemIds = $map['item_ids'];
            }
        }

        return $model;
    }
}
