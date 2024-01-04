<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class AuthAntchainAtoSignFlowRequest extends Model
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

    // 签署的电子合同ID
    /**
     * @var string
     */
    public $signNo;

    // 签署区域的tag，和发起签署流程的机构的tag对应。
    /**
     * @var string
     */
    public $tag;

    // 电子合同签署服务返回的biz_flow_id
    /**
     * @var string
     */
    public $bizFlowId;

    // 电子合同签署服务的返回的account_id
    /**
     * @var string
     */
    public $accountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signNo'            => 'sign_no',
        'tag'               => 'tag',
        'bizFlowId'         => 'biz_flow_id',
        'accountId'         => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('signNo', $this->signNo, true);
        Model::validateMaxLength('signNo', $this->signNo, 64);
        Model::validateMaxLength('tag', $this->tag, 32);
        Model::validateMaxLength('bizFlowId', $this->bizFlowId, 64);
        Model::validateMaxLength('accountId', $this->accountId, 64);
        Model::validateMinLength('signNo', $this->signNo, 6);
        Model::validateMinLength('tag', $this->tag, 2);
        Model::validateMinLength('bizFlowId', $this->bizFlowId, 4);
        Model::validateMinLength('accountId', $this->accountId, 4);
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
        if (null !== $this->signNo) {
            $res['sign_no'] = $this->signNo;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->bizFlowId) {
            $res['biz_flow_id'] = $this->bizFlowId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAntchainAtoSignFlowRequest
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
        if (isset($map['sign_no'])) {
            $model->signNo = $map['sign_no'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['biz_flow_id'])) {
            $model->bizFlowId = $map['biz_flow_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
