<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UnbindContractPayRequest extends Model
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

    // 用户id，平台方用户创建时生成的id。用户解约失败时该字段会通过解约申请消息透传给商家。
    /**
     * @var string
     */
    public $userTuid;

    // 外部代扣协议号，用户解约失败时该字段会通过解约申请消息透传给商家。
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 是否允许解约
    /**
     * @var bool
     */
    public $allowUnsign;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'userTuid'            => 'user_tuid',
        'externalAgreementNo' => 'external_agreement_no',
        'allowUnsign'         => 'allow_unsign',
    ];

    public function validate()
    {
        Model::validateRequired('userTuid', $this->userTuid, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
        Model::validateRequired('allowUnsign', $this->allowUnsign, true);
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
        if (null !== $this->userTuid) {
            $res['user_tuid'] = $this->userTuid;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->allowUnsign) {
            $res['allow_unsign'] = $this->allowUnsign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnbindContractPayRequest
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
        if (isset($map['user_tuid'])) {
            $model->userTuid = $map['user_tuid'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['allow_unsign'])) {
            $model->allowUnsign = $map['allow_unsign'];
        }

        return $model;
    }
}
