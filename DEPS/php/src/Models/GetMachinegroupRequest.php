<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetMachinegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'id' => 'id',
        'withMachines' => 'with_machines',
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
        if (null !== $this->withMachines) {
            $res['with_machines'] = $this->withMachines;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetMachinegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['with_machines'])){
            $model->withMachines = $map['with_machines'];
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

    // 分组 ID
    /**
     * @var string
     */
    public $id;

    // 是否带上机器信息，默认 false
    /**
     * @var bool
     */
    public $withMachines;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
