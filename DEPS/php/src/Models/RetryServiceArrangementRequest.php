<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class RetryServiceArrangementRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'arrangementId' => 'arrangement_id',
        'serviceId' => 'service_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetryServiceArrangementRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // arrangement_id
    /**
     * @var string
     */
    public $arrangementId;

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
