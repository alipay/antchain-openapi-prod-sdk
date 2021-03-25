<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ServiceInfoGroup;

class ServiceInfoGroupCollection extends Model {
    protected $_name = [
        'serviceInfoGroups' => 'service_info_groups',
    ];
    public function validate() {
        Model::validateRequired('serviceInfoGroups', $this->serviceInfoGroups, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->serviceInfoGroups) {
            $res['service_info_groups'] = null !== $this->serviceInfoGroups ? $this->serviceInfoGroups->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ServiceInfoGroupCollection
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['service_info_groups'])){
            $model->serviceInfoGroups = ServiceInfoGroup::fromMap($map['service_info_groups']);
        }
        return $model;
    }
    // service info groups
    /**
     * @example 
     * @var ServiceInfoGroup
     */
    public $serviceInfoGroups;

}
