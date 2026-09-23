<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class InvokeAgenticnexusAilongoperationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'merchantId' => 'merchant_id',
        'scene' => 'scene',
        'bizRequest' => 'biz_request',
        'sysName' => 'sys_name',
        'traceId' => 'trace_id',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('sysName', $this->sysName, true);
        Model::validateRequired('traceId', $this->traceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->bizRequest) {
            $res['biz_request'] = $this->bizRequest;
        }
        if (null !== $this->sysName) {
            $res['sys_name'] = $this->sysName;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvokeAgenticnexusAilongoperationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['biz_request'])){
            $model->bizRequest = $map['biz_request'];
        }
        if(isset($map['sys_name'])){
            $model->sysName = $map['sys_name'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户 ID
    /**
     * @var string
     */
    public $tenantId;

    // 社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 业务场景标识
    /**
     * @var string
     */
    public $scene;

    // 场景特定业务字段键值
    /**
     * @var string
     */
    public $bizRequest;

    // 调用方系统名
    /**
     * @var string
     */
    public $sysName;

    // 链路 ID
    /**
     * @var string
     */
    public $traceId;

}
