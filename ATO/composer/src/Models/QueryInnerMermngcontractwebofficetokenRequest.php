<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ATO\Models\FileInfo;

class QueryInnerMermngcontractwebofficetokenRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contractFile' => 'contract_file',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
    ];
    public function validate() {
        Model::validateRequired('contractFile', $this->contractFile, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->contractFile) {
            $res['contract_file'] = null !== $this->contractFile ? $this->contractFile->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerMermngcontractwebofficetokenRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['contract_file'])){
            $model->contractFile = FileInfo::fromMap($map['contract_file']);
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
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

    // 合同文件信息
    /**
     * @var FileInfo
     */
    public $contractFile;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // trace_id
    /**
     * @var string
     */
    public $traceId;

}
