<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryMachinegroupProgressRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
        'parentId' => 'parent_id',
        'planId' => 'plan_id',
        'processDefinitionId' => 'process_definition_id',
        'serviceId' => 'service_id',
        'state' => 'state',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BatchqueryMachinegroupProgressRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
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

    // 当前页，默认 1
    /**
     * @var int
     */
    public $pageNo;

    // 分页大小，默认 20
    /**
     * @var int
     */
    public $pageSize;

    // 父节点 ID
    /**
     * @var string
     */
    public $parentId;

    // 发布单 ID
    /**
     * @var string
     */
    public $planId;

    // 发布进程 ID
    /**
     * @var string
     */
    public $processDefinitionId;

    // 发布服务 ID
    /**
     * @var string
     */
    public $serviceId;

    // 状态
    /**
     * @var string
     */
    public $state;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
