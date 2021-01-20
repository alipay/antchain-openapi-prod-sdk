<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CancelServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'id' => 'id',
        'reason' => 'reason',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['reason'])){
            $model->reason = $map['reason'];
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

    // id
    /**
     * @var string
     */
    public $id;

    // reason
    /**
     * @var string
     */
    public $reason;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
