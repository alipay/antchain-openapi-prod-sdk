<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UnbindContractZfbagreementRequest extends Model
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

    // 用户2088id
    /**
     * @var string
     */
    public $alipayUserId;

    // 外部代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 申请解约-APPLY_UNSIGN
    /**
     * @var string
     */
    public $status;

    // 申请解约时间
    /**
     * @var string
     */
    public $unsignTime;

    // appId
    /**
     * @var string
     */
    public $appId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alipayUserId'      => 'alipay_user_id',
        'agreementNo'       => 'agreement_no',
        'status'            => 'status',
        'unsignTime'        => 'unsign_time',
        'appId'             => 'app_id',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('unsignTime', $this->unsignTime, true);
        Model::validateRequired('appId', $this->appId, true);
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
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->unsignTime) {
            $res['unsign_time'] = $this->unsignTime;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnbindContractZfbagreementRequest
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
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['unsign_time'])) {
            $model->unsignTime = $map['unsign_time'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }

        return $model;
    }
}
