<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationDatabaseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'application' => 'application',
        'connectionAddress' => 'connection_address',
        'name' => 'name',
        'networkType' => 'network_type',
        'netType' => 'net_type',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'port' => 'port',
        'serviceName' => 'service_name',
        'statuses' => 'statuses',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->connectionAddress) {
            $res['connection_address'] = $this->connectionAddress;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
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
     * @return QueryApplicationDatabaseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application'])){
            $model->application = $map['application'];
        }
        if(isset($map['connection_address'])){
            $model->connectionAddress = $map['connection_address'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['net_type'])){
            $model->netType = $map['net_type'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
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

    // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
    /**
     * @var string
     */
    public $application;

    // 连接地址
    /**
     * @var string
     */
    public $connectionAddress;

    // 资源名称
    /**
     * @var string
     */
    public $name;

    // 网络类型，Classic或VPC
    /**
     * @var string
     */
    public $networkType;

    // 网络连接类型，取值 Internet：外网，Intranet：内网
    /**
     * @var string
     */
    public $netType;

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

    // 连接端口
    /**
     * @var int
     */
    public $port;

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
