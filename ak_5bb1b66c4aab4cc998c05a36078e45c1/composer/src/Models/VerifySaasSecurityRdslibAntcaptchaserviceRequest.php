<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class VerifySaasSecurityRdslibAntcaptchaserviceRequest extends Model
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

    // 123
    /**
     * @var RdsAnalyzeRequest
     */
    public $rdsAnalyzeRequest;

    // 服务版本
    /**
     * @var string
     */
    public $serviceVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'rdsAnalyzeRequest' => 'rds_analyze_request',
        'serviceVersion'    => 'service_version',
    ];

    public function validate()
    {
        Model::validateRequired('rdsAnalyzeRequest', $this->rdsAnalyzeRequest, true);
        Model::validateRequired('serviceVersion', $this->serviceVersion, true);
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
        if (null !== $this->rdsAnalyzeRequest) {
            $res['rds_analyze_request'] = null !== $this->rdsAnalyzeRequest ? $this->rdsAnalyzeRequest->toMap() : null;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifySaasSecurityRdslibAntcaptchaserviceRequest
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
        if (isset($map['rds_analyze_request'])) {
            $model->rdsAnalyzeRequest = RdsAnalyzeRequest::fromMap($map['rds_analyze_request']);
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }

        return $model;
    }
}
