<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Listener extends Model
{
    // 后端服务器端口
    /**
     * @example
     *
     * @var int
     */
    public $backendServerPort;

    // 带宽
    /**
     * @example
     *
     * @var int
     */
    public $bandwidth;

    // certificate_iaas_id
    /**
     * @example certificate_iaas_id
     *
     * @var string
     */
    public $certificateIaasId;

    // 证书 id
    /**
     * @example adsfadsfdas
     *
     * @var string
     */
    public $certificateId;

    // cookie
    /**
     * @example xxx
     *
     * @var string
     */
    public $cookie;

    // cookie 超时时间
    /**
     * @example
     *
     * @var int
     */
    public $cookieTimeout;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 连接超时时间
    /**
     * @example
     *
     * @var int
     */
    public $establishedTimeout;

    // gm_crypto_cert_iaas_id
    /**
     * @example gm_crypto_cert_iaas_id
     *
     * @var string
     */
    public $gmCryptoCertIaasId;

    // 健康检查
    /**
     * @example
     *
     * @var ListenerHealthMonitor
     */
    public $healthMonitor;

    // iaas_id
    /**
     * @example iaas_id
     *
     * @var string
     */
    public $iaasId;

    // iaasType
    /**
     * @example iaasType
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // is_health_monitor
    /**
     * @example is_health_monitor
     *
     * @var string
     */
    public $isHealthMonitor;

    // 监听器端口
    /**
     * @example 443
     *
     * @var int
     */
    public $listenerPort;

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

    // 会话保持的超时时间
    /**
     * @example
     *
     * @var int
     */
    public $persistTimeout;

    // 转发规则
    /**
     * @example WRR
     *
     * @var string
     */
    public $scheduler;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // sticky_session
    /**
     * @example sticky_session
     *
     * @var string
     */
    public $stickySession;

    // cookie 处理方式
    /**
     * @example SERVER
     *
     * @var string
     */
    public $stickySessionType;

    // 监听类型
    /**
     * @example HTTPS
     *
     * @var string
     */
    public $type;

    // url_path
    /**
     * @example url_path
     *
     * @var string
     */
    public $urlPath;

    // x_forwarded_for
    /**
     * @example x_forwarded_for
     *
     * @var string
     */
    public $xForwardedFor;
    protected $_name = [
        'backendServerPort'  => 'backend_server_port',
        'bandwidth'          => 'bandwidth',
        'certificateIaasId'  => 'certificate_iaas_id',
        'certificateId'      => 'certificate_id',
        'cookie'             => 'cookie',
        'cookieTimeout'      => 'cookie_timeout',
        'description'        => 'description',
        'establishedTimeout' => 'established_timeout',
        'gmCryptoCertIaasId' => 'gm_crypto_cert_iaas_id',
        'healthMonitor'      => 'health_monitor',
        'iaasId'             => 'iaas_id',
        'iaasType'           => 'iaas_type',
        'id'                 => 'id',
        'isHealthMonitor'    => 'is_health_monitor',
        'listenerPort'       => 'listener_port',
        'loadBalancer'       => 'load_balancer',
        'name'               => 'name',
        'persistTimeout'     => 'persist_timeout',
        'scheduler'          => 'scheduler',
        'status'             => 'status',
        'stickySession'      => 'sticky_session',
        'stickySessionType'  => 'sticky_session_type',
        'type'               => 'type',
        'urlPath'            => 'url_path',
        'xForwardedFor'      => 'x_forwarded_for',
    ];

    public function validate()
    {
        Model::validateRequired('backendServerPort', $this->backendServerPort, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->backendServerPort) {
            $res['backend_server_port'] = $this->backendServerPort;
        }
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->certificateIaasId) {
            $res['certificate_iaas_id'] = $this->certificateIaasId;
        }
        if (null !== $this->certificateId) {
            $res['certificate_id'] = $this->certificateId;
        }
        if (null !== $this->cookie) {
            $res['cookie'] = $this->cookie;
        }
        if (null !== $this->cookieTimeout) {
            $res['cookie_timeout'] = $this->cookieTimeout;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->establishedTimeout) {
            $res['established_timeout'] = $this->establishedTimeout;
        }
        if (null !== $this->gmCryptoCertIaasId) {
            $res['gm_crypto_cert_iaas_id'] = $this->gmCryptoCertIaasId;
        }
        if (null !== $this->healthMonitor) {
            $res['health_monitor'] = null !== $this->healthMonitor ? $this->healthMonitor->toMap() : null;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isHealthMonitor) {
            $res['is_health_monitor'] = $this->isHealthMonitor;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->loadBalancer) {
            $res['load_balancer'] = null !== $this->loadBalancer ? $this->loadBalancer->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->persistTimeout) {
            $res['persist_timeout'] = $this->persistTimeout;
        }
        if (null !== $this->scheduler) {
            $res['scheduler'] = $this->scheduler;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->stickySession) {
            $res['sticky_session'] = $this->stickySession;
        }
        if (null !== $this->stickySessionType) {
            $res['sticky_session_type'] = $this->stickySessionType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->urlPath) {
            $res['url_path'] = $this->urlPath;
        }
        if (null !== $this->xForwardedFor) {
            $res['x_forwarded_for'] = $this->xForwardedFor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Listener
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['backend_server_port'])) {
            $model->backendServerPort = $map['backend_server_port'];
        }
        if (isset($map['bandwidth'])) {
            $model->bandwidth = $map['bandwidth'];
        }
        if (isset($map['certificate_iaas_id'])) {
            $model->certificateIaasId = $map['certificate_iaas_id'];
        }
        if (isset($map['certificate_id'])) {
            $model->certificateId = $map['certificate_id'];
        }
        if (isset($map['cookie'])) {
            $model->cookie = $map['cookie'];
        }
        if (isset($map['cookie_timeout'])) {
            $model->cookieTimeout = $map['cookie_timeout'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['established_timeout'])) {
            $model->establishedTimeout = $map['established_timeout'];
        }
        if (isset($map['gm_crypto_cert_iaas_id'])) {
            $model->gmCryptoCertIaasId = $map['gm_crypto_cert_iaas_id'];
        }
        if (isset($map['health_monitor'])) {
            $model->healthMonitor = ListenerHealthMonitor::fromMap($map['health_monitor']);
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_health_monitor'])) {
            $model->isHealthMonitor = $map['is_health_monitor'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['load_balancer'])) {
            $model->loadBalancer = LoadBalancer::fromMap($map['load_balancer']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['persist_timeout'])) {
            $model->persistTimeout = $map['persist_timeout'];
        }
        if (isset($map['scheduler'])) {
            $model->scheduler = $map['scheduler'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sticky_session'])) {
            $model->stickySession = $map['sticky_session'];
        }
        if (isset($map['sticky_session_type'])) {
            $model->stickySessionType = $map['sticky_session_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['url_path'])) {
            $model->urlPath = $map['url_path'];
        }
        if (isset($map['x_forwarded_for'])) {
            $model->xForwardedFor = $map['x_forwarded_for'];
        }

        return $model;
    }
}
