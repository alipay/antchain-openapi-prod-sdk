<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationComputerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'application' => 'application',
        'assign' => 'assign',
        'computerType' => 'computer_type',
        'cpu' => 'cpu',
        'memory' => 'memory',
        'name' => 'name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'serviceName' => 'service_name',
        'statuses' => 'statuses',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->assign) {
            $res['assign'] = $this->assign;
        }
        if (null !== $this->computerType) {
            $res['computer_type'] = $this->computerType;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplicationComputerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application'])){
            $model->application = $map['application'];
        }
        if(isset($map['assign'])){
            $model->assign = $map['assign'];
        }
        if(isset($map['computer_type'])){
            $model->computerType = $map['computer_type'];
        }
        if(isset($map['cpu'])){
            $model->cpu = $map['cpu'];
        }
        if(isset($map['memory'])){
            $model->memory = $map['memory'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
        }
        if(isset($map['statuses'])){
            if(!empty($map['statuses'])){
                $model->statuses = $map['statuses'];
            }
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

    /**
     * @var string
     */
    public $tenant;

    // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
    /**
     * @var string
     */
    public $application;

    // assign=true代表分配了app/appservice的computer,反之代表没有分配app/appservice的computer
    /**
     * @var bool
     */
    public $assign;

    // 资源类型
    /**
     * @var string
     */
    public $computerType;

    // cpu核数
    /**
     * @var int
     */
    public $cpu;

    // 内存大小，单位MB
    /**
     * @var int
     */
    public $memory;

    // 资源名称
    /**
     * @var string
     */
    public $name;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10
    /**
     * @var int
     */
    public $pageSize;

    // 目标服务实例名称
    /**
     * @var string
     */
    public $serviceName;

    // 资源所处的状态，可指定多个
    /**
     * @var string[]
     */
    public $statuses;

    // 目标工作空间名称
    /**
     * @var string
     */
    public $workspace;

}
