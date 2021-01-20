<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryDeploymentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'creationTime' => 'creation_time',
        'operationId' => 'operation_id',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'statuses' => 'statuses',
        'title' => 'title',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDeploymentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['operation_id'])){
            $model->operationId = $map['operation_id'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['statuses'])){
            if(!empty($map['statuses'])){
                $model->statuses = $map['statuses'];
            }
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 部署单包含的应用（服务）名称
    /**
     * @var string
     */
    public $applicationName;

    // 部署单创建日期，采用UTC时间，按照ISO8601标准表示，格式为：YYYY-MM-DDThh:mm:ssZ
    /**
     * @var string
     */
    public $creationTime;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

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

    // 
    // 部署单状态。取值列表：
    // INITING：初始化中；
    // INIT_FAILED：初始化失败；
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // CANCELING：取消中；
    // CANCELED：已取消
    // 
    // 
    /**
     * @var string[]
     */
    public $statuses;

    // 精确部署单标题
    /**
     * @var string
     */
    public $title;

}
