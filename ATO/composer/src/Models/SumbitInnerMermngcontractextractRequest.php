<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SumbitInnerMermngcontractextractRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceId' => 'trace_id',
        'tenantId' => 'tenant_id',
        'taskCode' => 'task_code',
        'bizId' => 'biz_id',
        'fileUrl' => 'file_url',
        'bizParams' => 'biz_params',
    ];
    public function validate() {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('taskCode', $this->taskCode, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->taskCode) {
            $res['task_code'] = $this->taskCode;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->bizParams) {
            $res['biz_params'] = $this->bizParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SumbitInnerMermngcontractextractRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['task_code'])){
            $model->taskCode = $map['task_code'];
        }
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['biz_params'])){
            $model->bizParams = $map['biz_params'];
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

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // code
    /**
     * @var string
     */
    public $taskCode;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 文件url
    /**
     * @var string
     */
    public $fileUrl;

    // 额外参数
    /**
     * @var string
     */
    public $bizParams;

}
