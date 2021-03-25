<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsApplication extends Model {
    protected $_name = [
        'name' => 'name',
        'status' => 'status',
        'type' => 'type',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsApplication
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    // 应用（服务）名称
    /**
     * @example 
     * @var string
     */
    public $name;

    // 应用（服务）当前运维状态。取值列表：
    // INITING：初始化中；
    // INIT_FAILED：初始化失败；
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // ROLLBACKED：已回滚；
    // CANCELED：已取消
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // APPLICATION和APP_SERVICE。设置为APPLICATION表示该实例描述对象为应用; APP_SERVICE表示该实例描述对象为应用服务。
    /**
     * @example APPLICATION
     * @var string
     */
    public $type;

}
