<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateObjectTransferRequest extends Model
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

    // 区块链身份
    /**
     * @var string
     */
    public $userDid;

    // 联盟标识（联盟码）
    /**
     * @var string
     */
    public $unionId;

    // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
    /**
     * @var string
     */
    public $objectHash;

    // 流转备注信息
    /**
     * @var string
     */
    public $formBody;

    // 数据归属权流转到的Did
    /**
     * @var string
     */
    public $toDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'objectHash'        => 'object_hash',
        'formBody'          => 'form_body',
        'toDid'             => 'to_did',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('objectHash', $this->objectHash, true);
        Model::validateRequired('toDid', $this->toDid, true);
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
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->objectHash) {
            $res['object_hash'] = $this->objectHash;
        }
        if (null !== $this->formBody) {
            $res['form_body'] = $this->formBody;
        }
        if (null !== $this->toDid) {
            $res['to_did'] = $this->toDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateObjectTransferRequest
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
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['object_hash'])) {
            $model->objectHash = $map['object_hash'];
        }
        if (isset($map['form_body'])) {
            $model->formBody = $map['form_body'];
        }
        if (isset($map['to_did'])) {
            $model->toDid = $map['to_did'];
        }

        return $model;
    }
}
