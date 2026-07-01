<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateStubRequest extends Model
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

    // 数字票根全流程存证内容
    /**
     * @var OnestepFlowNotaryInfo
     */
    public $onestepFlowNotaryInfo;

    // 数字票根通用业务字段
    /**
     * @var StubCommonInfo
     */
    public $stubCommonInfo;

    // 数字票根扩展字段
    /**
     * @var StubExtraInfo
     */
    public $stubExtraInfo;

    // 数字票根计量字段
    /**
     * @var MetricInfo
     */
    public $metricInfo;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'onestepFlowNotaryInfo' => 'onestep_flow_notary_info',
        'stubCommonInfo'        => 'stub_common_info',
        'stubExtraInfo'         => 'stub_extra_info',
        'metricInfo'            => 'metric_info',
    ];

    public function validate()
    {
        Model::validateRequired('onestepFlowNotaryInfo', $this->onestepFlowNotaryInfo, true);
        Model::validateRequired('stubCommonInfo', $this->stubCommonInfo, true);
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
        if (null !== $this->onestepFlowNotaryInfo) {
            $res['onestep_flow_notary_info'] = null !== $this->onestepFlowNotaryInfo ? $this->onestepFlowNotaryInfo->toMap() : null;
        }
        if (null !== $this->stubCommonInfo) {
            $res['stub_common_info'] = null !== $this->stubCommonInfo ? $this->stubCommonInfo->toMap() : null;
        }
        if (null !== $this->stubExtraInfo) {
            $res['stub_extra_info'] = null !== $this->stubExtraInfo ? $this->stubExtraInfo->toMap() : null;
        }
        if (null !== $this->metricInfo) {
            $res['metric_info'] = null !== $this->metricInfo ? $this->metricInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStubRequest
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
        if (isset($map['onestep_flow_notary_info'])) {
            $model->onestepFlowNotaryInfo = OnestepFlowNotaryInfo::fromMap($map['onestep_flow_notary_info']);
        }
        if (isset($map['stub_common_info'])) {
            $model->stubCommonInfo = StubCommonInfo::fromMap($map['stub_common_info']);
        }
        if (isset($map['stub_extra_info'])) {
            $model->stubExtraInfo = StubExtraInfo::fromMap($map['stub_extra_info']);
        }
        if (isset($map['metric_info'])) {
            $model->metricInfo = MetricInfo::fromMap($map['metric_info']);
        }

        return $model;
    }
}
