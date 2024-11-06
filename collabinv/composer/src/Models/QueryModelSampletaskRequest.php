<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryModelSampletaskRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 事件查询序号编码，在有loop_code接口返回值的异步接口的值
    // 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
    /**
     * @var string
     */
    public $loopCode;

    // 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
    /**
     * @var string
     */
    public $phase;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'loopCode'          => 'loop_code',
        'phase'             => 'phase',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('loopCode', $this->loopCode, true);
        Model::validateRequired('phase', $this->phase, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->loopCode) {
            $res['loop_code'] = $this->loopCode;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryModelSampletaskRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['loop_code'])) {
            $model->loopCode = $map['loop_code'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }

        return $model;
    }
}
