<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryServiceSlbmountRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'serviceId' => 'service_id',
        'slbId' => 'slb_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->slbId) {
            $res['slb_id'] = $this->slbId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryServiceSlbmountRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['slb_id'])){
            $model->slbId = $map['slb_id'];
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

    // service_id
    /**
     * @var string
     */
    public $serviceId;

    // slb_id
    /**
     * @var string
     */
    public $slbId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
