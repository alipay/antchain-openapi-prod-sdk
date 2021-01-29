<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsappsvcRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'serviceName' => 'service_name',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOpsappsvcRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
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

    // 应用的名称
    /**
     * @var string
     */
    public $appName;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10，最大50
    /**
     * @var int
     */
    public $pageSize;

    // 应用服务的名称，如果为空，会查询该应用下所有应用服务的运维历史
    /**
     * @var string
     */
    public $serviceName;

}
