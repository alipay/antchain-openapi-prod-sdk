<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class VerifyContractTextsignRequest extends Model
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

    // 注册的平台方用户id
    /**
     * @var string
     */
    public $accountId;

    // 签名原文本
    /**
     * @var string
     */
    public $originText;

    // 文本签名值
    /**
     * @var string
     */
    public $signResult;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'originText'        => 'origin_text',
        'signResult'        => 'sign_result',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('originText', $this->originText, true);
        Model::validateRequired('signResult', $this->signResult, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->originText) {
            $res['origin_text'] = $this->originText;
        }
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyContractTextsignRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['origin_text'])) {
            $model->originText = $map['origin_text'];
        }
        if (isset($map['sign_result'])) {
            $model->signResult = $map['sign_result'];
        }

        return $model;
    }
}
