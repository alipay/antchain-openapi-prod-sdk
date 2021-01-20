<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDeltaInfo extends Model {
    protected $_name = [
        'tenant' => 'tenant',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WorkspaceDeltaInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    // 租户名
    /**
     * @example TEST
     * @var string
     */
    public $tenant;

    // 环境名
    /**
     * @example test
     * @var string
     */
    public $workspace;

}
