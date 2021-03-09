<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerRule extends Model
{
    // load_balancer
    /**
     * @example
     *
     * @var LoadBalancer
     */
    public $loadBalancer;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // listener_port
    /**
     * @example listener_port
     *
     * @var int
     */
    public $listenerPort;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // domain
    /**
     * @example domain
     *
     * @var string
     */
    public $domain;

    // url
    /**
     * @example url
     *
     * @var string
     */
    public $url;

    // cookie
    /**
     * @example cookie
     *
     * @var string
     */
    public $cookie;

    // is_health_monitor
    /**
     * @example is_health_monitor
     *
     * @var string
     */
    public $isHealthMonitor;

    // health_monitor
    /**
     * @example
     *
     * @var ListenerHealthMonitor
     */
    public $healthMonitor;

    // sticky_session
    /**
     * @example sticky_session
     *
     * @var string
     */
    public $stickySession;

    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'loadBalancer'    => 'load_balancer',
        'name'            => 'name',
        'id'              => 'id',
        'listenerPort'    => 'listener_port',
        'status'          => 'status',
        'domain'          => 'domain',
        'url'             => 'url',
        'cookie'          => 'cookie',
        'isHealthMonitor' => 'is_health_monitor',
        'healthMonitor'   => 'health_monitor',
        'stickySession'   => 'sticky_session',
        'appId'           => 'app_id',
        'workspaceId'     => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loadBalancer) {
            $res['load_balancer'] = null !== $this->loadBalancer ? $this->loadBalancer->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->cookie) {
            $res['cookie'] = $this->cookie;
        }
        if (null !== $this->isHealthMonitor) {
            $res['is_health_monitor'] = $this->isHealthMonitor;
        }
        if (null !== $this->healthMonitor) {
            $res['health_monitor'] = null !== $this->healthMonitor ? $this->healthMonitor->toMap() : null;
        }
        if (null !== $this->stickySession) {
            $res['sticky_session'] = $this->stickySession;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancerRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['load_balancer'])) {
            $model->loadBalancer = LoadBalancer::fromMap($map['load_balancer']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['cookie'])) {
            $model->cookie = $map['cookie'];
        }
        if (isset($map['is_health_monitor'])) {
            $model->isHealthMonitor = $map['is_health_monitor'];
        }
        if (isset($map['health_monitor'])) {
            $model->healthMonitor = ListenerHealthMonitor::fromMap($map['health_monitor']);
        }
        if (isset($map['sticky_session'])) {
            $model->stickySession = $map['sticky_session'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
