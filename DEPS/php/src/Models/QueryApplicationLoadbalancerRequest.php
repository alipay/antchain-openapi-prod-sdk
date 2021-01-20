<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationLoadbalancerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'application' => 'application',
        'name' => 'name',
        'networkType' => 'network_type',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'serviceName' => 'service_name',
        'statuses' => 'statuses',
        'vipAddress' => 'vip_address',
        'vipAddressType' => 'vip_address_type',
        'vipType' => 'vip_type',
        'vpcIds' => 'vpc_ids',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
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
        if (null !== $this->vipAddress) {
            $res['vip_address'] = $this->vipAddress;
        }
        if (null !== $this->vipAddressType) {
            $res['vip_address_type'] = $this->vipAddressType;
        }
        if (null !== $this->vipType) {
            $res['vip_type'] = $this->vipType;
        }
        if (null !== $this->vpcIds) {
            $res['vpc_ids'] = $this->vpcIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryApplicationLoadbalancerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application'])){
            $model->application = $map['application'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
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
        if(isset($map['vip_address'])){
            $model->vipAddress = $map['vip_address'];
        }
        if(isset($map['vip_address_type'])){
            $model->vipAddressType = $map['vip_address_type'];
        }
        if(isset($map['vip_type'])){
            $model->vipType = $map['vip_type'];
        }
        if(isset($map['vpc_ids'])){
            if(!empty($map['vpc_ids'])){
                $model->vpcIds = $map['vpc_ids'];
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

    // 资源名称
    /**
     * @var string
     */
    public $name;

    // VIP类型
    /**
     * @var string
     */
    public $networkType;

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

    // vip地址
    /**
     * @var string
     */
    public $vipAddress;

    // address 类型：INTERNET, INTRANET
    /**
     * @var string
     */
    public $vipAddressType;

    // VIP类型
    /**
     * @var string
     */
    public $vipType;

    // vpc的id
    /**
     * @var string[]
     */
    public $vpcIds;

    // 目标工作空间名称
    /**
     * @var string
     */
    public $workspace;

}
