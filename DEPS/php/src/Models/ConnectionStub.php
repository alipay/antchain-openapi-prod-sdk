<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Cloud;

class ConnectionStub extends Model {
    protected $_name = [
        'id' => 'id',
        'cloud' => 'cloud',
        'type' => 'type',
        'tenantName' => 'tenant_name',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->cloud) {
            $res['cloud'] = null !== $this->cloud ? $this->cloud->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConnectionStub
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['cloud'])){
            $model->cloud = Cloud::fromMap($map['cloud']);
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // id
    /**
     * @example 
     * @var int
     */
    public $id;

    // cloud
    /**
     * @example 
     * @var Cloud
     */
    public $cloud;

    // StubType
    /**
     * @example PLUG, SOCKET
     * @var string
     */
    public $type;

    // tenantName
    /**
     * @example tenantName
     * @var string
     */
    public $tenantName;

    // tenantId
    /**
     * @example tenantId
     * @var string
     */
    public $tenantId;

}
