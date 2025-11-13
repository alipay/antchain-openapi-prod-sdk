<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CancelFundFlowRequest extends Model
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

    // 签署合同单号
    /**
     * @var string
     */
    public $signNo;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 撤销原因
    /**
     * @var string
     */
    public $revokeReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'signNo'            => 'sign_no',
        'fundId'            => 'fund_id',
        'revokeReason'      => 'revoke_reason',
    ];

    public function validate()
    {
        Model::validateRequired('signNo', $this->signNo, true);
        Model::validateRequired('fundId', $this->fundId, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->revokeReason) {
            $res['revoke_reason'] = $this->revokeReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelFundFlowRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['revoke_reason'])) {
            $model->revokeReason = $map['revoke_reason'];
        }

        return $model;
    }
}
