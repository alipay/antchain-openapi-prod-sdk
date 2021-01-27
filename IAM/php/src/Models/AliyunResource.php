<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AliyunResource extends Model {
    protected $_name = [
        'resource' => 'resource',
        'resourceTenant' => 'resource_tenant',
    ];
    public function validate() {
        Model::validateRequired('resource', $this->resource, true);
        Model::validateRequired('resourceTenant', $this->resourceTenant, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->resourceTenant) {
            $res['resource_tenant'] = $this->resourceTenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AliyunResource
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['resource'])){
            $model->resource = $map['resource'];
        }
        if(isset($map['resource_tenant'])){
            $model->resourceTenant = $map['resource_tenant'];
        }
        return $model;
    }
    // resource_type/resource_id
    /**
     * @example ecs/xxx_id
     * @var string
     */
    public $resource;

    // 资源所属的租户
    /**
     * @example ABCD
     * @var string
     */
    public $resourceTenant;

}
