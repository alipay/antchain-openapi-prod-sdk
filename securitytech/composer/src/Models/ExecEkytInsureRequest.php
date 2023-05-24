<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ExecEkytInsureRequest extends Model
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

    // 保险信息，包含保单的所有信息
    /**
     * @var string
     */
    public $insureInfo;

    // 投保人信息
    /**
     * @var string
     */
    public $applicantInfo;

    // 被保人信息
    /**
     * @var string
     */
    public $assuredInfo;

    // 数据签名
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'insureInfo'        => 'insure_info',
        'applicantInfo'     => 'applicant_info',
        'assuredInfo'       => 'assured_info',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('insureInfo', $this->insureInfo, true);
        Model::validateRequired('applicantInfo', $this->applicantInfo, true);
        Model::validateRequired('assuredInfo', $this->assuredInfo, true);
        Model::validateRequired('signature', $this->signature, true);
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
        if (null !== $this->insureInfo) {
            $res['insure_info'] = $this->insureInfo;
        }
        if (null !== $this->applicantInfo) {
            $res['applicant_info'] = $this->applicantInfo;
        }
        if (null !== $this->assuredInfo) {
            $res['assured_info'] = $this->assuredInfo;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecEkytInsureRequest
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
        if (isset($map['insure_info'])) {
            $model->insureInfo = $map['insure_info'];
        }
        if (isset($map['applicant_info'])) {
            $model->applicantInfo = $map['applicant_info'];
        }
        if (isset($map['assured_info'])) {
            $model->assuredInfo = $map['assured_info'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
