<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class RunAntchainSaasMarketServiceRequest extends Model
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

    // 业务方传入，幂等用。
    /**
     * @var string
     */
    public $bizId;

    // saas产品code
    /**
     * @var string
     */
    public $productCode;

    // 服务code
    /**
     * @var string
     */
    public $serviceCode;

    // 子服务code
    /**
     * @var string
     */
    public $subServiceCode;

    // 服务版本
    /**
     * @var string
     */
    public $serviceVersion;

    // 业务参数，map格式
    /**
     * @var KeyValuePair[]
     */
    public $params;

    // 服务调用结果
    /**
     * @var KeyValuePair[]
     */
    public $resultData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'productCode'       => 'product_code',
        'serviceCode'       => 'service_code',
        'subServiceCode'    => 'sub_service_code',
        'serviceVersion'    => 'service_version',
        'params'            => 'params',
        'resultData'        => 'result_data',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->subServiceCode) {
            $res['sub_service_code'] = $this->subServiceCode;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if (null !== $this->params && \is_array($this->params)) {
                $n = 0;
                foreach ($this->params as $item) {
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resultData) {
            $res['result_data'] = [];
            if (null !== $this->resultData && \is_array($this->resultData)) {
                $n = 0;
                foreach ($this->resultData as $item) {
                    $res['result_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunAntchainSaasMarketServiceRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['sub_service_code'])) {
            $model->subServiceCode = $map['sub_service_code'];
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_data'])) {
            if (!empty($map['result_data'])) {
                $model->resultData = [];
                $n                 = 0;
                foreach ($map['result_data'] as $item) {
                    $model->resultData[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
