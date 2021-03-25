<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsApplication;

class OpsApplicationGroup extends Model {
    protected $_name = [
        'applications' => 'applications',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->applications) {
            $res['applications'] = [];
            if(null !== $this->applications && is_array($this->applications)){
                $n = 0;
                foreach($this->applications as $item){
                    $res['applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsApplicationGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['applications'])){
            if(!empty($map['applications'])){
                $model->applications = [];
                $n = 0;
                foreach($map['applications'] as $item) {
                    $model->applications[$n++] = null !== $item ? OpsApplication::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 此运维应用（服务）组中包含的应用（服务）列表
    /**
     * @example 
     * @var OpsApplication[]
     */
    public $applications;

}
