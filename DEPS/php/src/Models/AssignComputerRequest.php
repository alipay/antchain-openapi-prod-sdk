<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ComputerCell;

class AssignComputerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'autoOps' => 'auto_ops',
        'computerCells' => 'computer_cells',
        'computerIds' => 'computer_ids',
        'initDataDisk' => 'init_data_disk',
        'initSysDisk' => 'init_sys_disk',
        'reqBizId' => 'req_biz_id',
        'serviceName' => 'service_name',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
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
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->autoOps) {
            $res['auto_ops'] = $this->autoOps;
        }
        if (null !== $this->computerCells) {
            $res['computer_cells'] = [];
            if(null !== $this->computerCells && is_array($this->computerCells)){
                $n = 0;
                foreach($this->computerCells as $item){
                    $res['computer_cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->initDataDisk) {
            $res['init_data_disk'] = $this->initDataDisk;
        }
        if (null !== $this->initSysDisk) {
            $res['init_sys_disk'] = $this->initSysDisk;
        }
        if (null !== $this->reqBizId) {
            $res['req_biz_id'] = $this->reqBizId;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AssignComputerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['auto_ops'])){
            $model->autoOps = $map['auto_ops'];
        }
        if(isset($map['computer_cells'])){
            if(!empty($map['computer_cells'])){
                $model->computerCells = [];
                $n = 0;
                foreach($map['computer_cells'] as $item) {
                    $model->computerCells[$n++] = null !== $item ? ComputerCell::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['computer_ids'])){
            if(!empty($map['computer_ids'])){
                $model->computerIds = $map['computer_ids'];
            }
        }
        if(isset($map['init_data_disk'])){
            $model->initDataDisk = $map['init_data_disk'];
        }
        if(isset($map['init_sys_disk'])){
            $model->initSysDisk = $map['init_sys_disk'];
        }
        if(isset($map['req_biz_id'])){
            $model->reqBizId = $map['req_biz_id'];
        }
        if(isset($map['service_name'])){
            $model->serviceName = $map['service_name'];
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

    // 应用的完整名称
    /**
     * @var string
     */
    public $applicationName;

    // 是否启用自动运维，默认为**False**
    /**
     * @var bool
     */
    public $autoOps;

    // 计算资源与cell的关系，如果不指定会根据分配的应用、服务实例以及computer的zone信息由系统决定，如果无法决定会导致失败，建议在指定了service_name参数的情形下指定该参数
    /**
     * @var ComputerCell[]
     */
    public $computerCells;

    // 计算资源id，可以指定多个
    /**
     * @var string[]
     */
    public $computerIds;

    // 是否重新初始化数据磁盘，默认为**False**
    /**
     * @var bool
     */
    public $initDataDisk;

    // 是否重新初始化系统磁盘，默认为**False**
    /**
     * @var bool
     */
    public $initSysDisk;

    // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
    /**
     * @var string
     */
    public $reqBizId;

    // 目标服务实例名称
    /**
     * @var string
     */
    public $serviceName;

    // 目标工作空间名称
    /**
     * @var string
     */
    public $workspace;

}
