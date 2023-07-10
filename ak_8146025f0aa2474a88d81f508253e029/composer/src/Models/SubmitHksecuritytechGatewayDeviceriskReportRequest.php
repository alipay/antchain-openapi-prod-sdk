<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_8146025f0aa2474a88d81f508253e029\Models;

use AlibabaCloud\Tea\Model;

class SubmitHksecuritytechGatewayDeviceriskReportRequest extends Model
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

    // request_data
    /**
     * @var string
     */
    public $requestData;

    // result
    /**
     * @var DeviceRiskReportResult
     */
    public $result;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestData'       => 'request_data',
        'result'            => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('requestData', $this->requestData, true);
        Model::validateRequired('result', $this->result, true);
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
        if (null !== $this->requestData) {
            $res['request_data'] = $this->requestData;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitHksecuritytechGatewayDeviceriskReportRequest
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
        if (isset($map['request_data'])) {
            $model->requestData = $map['request_data'];
        }
        if (isset($map['result'])) {
            $model->result = DeviceRiskReportResult::fromMap($map['result']);
        }

        return $model;
    }
}
