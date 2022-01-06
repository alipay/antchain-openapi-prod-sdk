<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryMeshSidecarRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 查询指定应用服务的
    /**
     * @var string
     */
    public $appServiceName;

    // 查询指定集群的，如果未设置，则根据tenant + workspace获取
    /**
     * @var string
     */
    public $clusterName;

    // 查询指定命名空间的，如果未指定，默认值为default
    /**
     * @var string
     */
    public $namespace;

    // 分页查询索引页，默认0
    /**
     * @var int
     */
    public $pageIndex;

    // 分页查询单页大小，默认10
    /**
     * @var string
     */
    public $pageSize;

    // 查询指定podIp(英文半角逗号分割)的
    /**
     * @var string
     */
    public $podIp;

    // 查询指定pod状态的
    /**
     * @var string
     */
    public $podStatus;

    // 查询指定sidecar状态的
    /**
     * @var string
     */
    public $sidecarStatus;

    // 查询注入指定版本sidecar的
    /**
     * @var string
     */
    public $sidecarVersion;

    // 排序字段，默认pod创建时间
    /**
     * @var string
     */
    public $sortField;

    // 升序(ascend) 或 降序(descend)
    /**
     * @var string
     */
    public $sortOrder;

    // sidecar类型(mosn/odp/mist)
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appServiceName'    => 'app_service_name',
        'clusterName'       => 'cluster_name',
        'namespace'         => 'namespace',
        'pageIndex'         => 'page_index',
        'pageSize'          => 'page_size',
        'podIp'             => 'pod_ip',
        'podStatus'         => 'pod_status',
        'sidecarStatus'     => 'sidecar_status',
        'sidecarVersion'    => 'sidecar_version',
        'sortField'         => 'sort_field',
        'sortOrder'         => 'sort_order',
        'type'              => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appServiceName) {
            $res['app_service_name'] = $this->appServiceName;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->podIp) {
            $res['pod_ip'] = $this->podIp;
        }
        if (null !== $this->podStatus) {
            $res['pod_status'] = $this->podStatus;
        }
        if (null !== $this->sidecarStatus) {
            $res['sidecar_status'] = $this->sidecarStatus;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->sortOrder) {
            $res['sort_order'] = $this->sortOrder;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeshSidecarRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['app_service_name'])) {
            $model->appServiceName = $map['app_service_name'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['pod_ip'])) {
            $model->podIp = $map['pod_ip'];
        }
        if (isset($map['pod_status'])) {
            $model->podStatus = $map['pod_status'];
        }
        if (isset($map['sidecar_status'])) {
            $model->sidecarStatus = $map['sidecar_status'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['sort_field'])) {
            $model->sortField = $map['sort_field'];
        }
        if (isset($map['sort_order'])) {
            $model->sortOrder = $map['sort_order'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
