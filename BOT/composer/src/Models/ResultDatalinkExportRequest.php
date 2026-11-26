<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ResultDatalinkExportRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'exportJobId' => 'export_job_id',
        'sourceTenantId' => 'source_tenant_id',
    ];
    public function validate() {
        Model::validateRequired('exportJobId', $this->exportJobId, true);
        Model::validateRequired('sourceTenantId', $this->sourceTenantId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->exportJobId) {
            $res['export_job_id'] = $this->exportJobId;
        }
        if (null !== $this->sourceTenantId) {
            $res['source_tenant_id'] = $this->sourceTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResultDatalinkExportRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['export_job_id'])){
            $model->exportJobId = $map['export_job_id'];
        }
        if(isset($map['source_tenant_id'])){
            $model->sourceTenantId = $map['source_tenant_id'];
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

    // 任务ID
    /**
     * @var string
     */
    public $exportJobId;

    // 请求方原始租户ID
    /**
     * @var string
     */
    public $sourceTenantId;

}
