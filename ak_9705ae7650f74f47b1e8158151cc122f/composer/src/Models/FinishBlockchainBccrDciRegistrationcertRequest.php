<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class FinishBlockchainBccrDciRegistrationcertRequest extends Model
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

    // 登记号
    /**
     * @var string
     */
    public $regNumber;

    // 数登证书地址
    /**
     * @var string
     */
    public $certificateUrl;

    // 数登样本地址
    /**
     * @var string
     */
    public $sampleUrl;

    // 客户端幂等token
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regNumber'         => 'reg_number',
        'certificateUrl'    => 'certificate_url',
        'sampleUrl'         => 'sample_url',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('regNumber', $this->regNumber, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->sampleUrl) {
            $res['sample_url'] = $this->sampleUrl;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishBlockchainBccrDciRegistrationcertRequest
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
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['sample_url'])) {
            $model->sampleUrl = $map['sample_url'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
