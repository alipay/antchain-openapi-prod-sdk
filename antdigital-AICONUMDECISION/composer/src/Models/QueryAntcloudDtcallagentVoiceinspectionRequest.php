<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudDtcallagentVoiceinspectionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'instanceCode' => 'instance_code',
        'qcRecordId' => 'qc_record_id',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('qcRecordId', $this->qcRecordId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->qcRecordId) {
            $res['qc_record_id'] = $this->qcRecordId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudDtcallagentVoiceinspectionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['instance_code'])){
            $model->instanceCode = $map['instance_code'];
        }
        if(isset($map['qc_record_id'])){
            $model->qcRecordId = $map['qc_record_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户 ID
    /**
     * @var string
     */
    public $tenantId;

    // 业务空间实例编码
    /**
     * @var string
     */
    public $instanceCode;

    // execute 接口返回的质检记录 ID
    /**
     * @var string
     */
    public $qcRecordId;

}
