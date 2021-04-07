<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoadbalanceListenerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // bandwidth
    /**
     * @var int
     */
    public $bandwidth;

    // certificate_iaas_id
    /**
     * @var string
     */
    public $certificateIaasId;

    // certificate_id
    /**
     * @var string
     */
    public $certificateId;

    // cookie
    /**
     * @var string
     */
    public $cookie;

    // cookie_timeout
    /**
     * @var int
     */
    public $cookieTimeout;

    // established_timeout
    /**
     * @var int
     */
    public $establishedTimeout;

    // gm_crypto_cert_iaas_id
    /**
     * @var string
     */
    public $gmCryptoCertIaasId;

    // gm_sign_cert_iaas_id
    /**
     * @var string
     */
    public $gmSignCertIaasId;

    // health_monitor
    /**
     * @var ListenerHealthMonitor
     */
    public $healthMonitor;

    // listener_port
    /**
     * @var int
     */
    public $listenerPort;

    // load_balancer_id
    /**
     * @var string
     */
    public $loadBalancerId;

    // persist_timeout
    /**
     * @var int
     */
    public $persistTimeout;

    // scheduler
    /**
     * @var string
     */
    public $scheduler;

    // sticky_session_type
    /**
     * @var string
     */
    public $stickySessionType;

    // tls_cipher_policy
    /**
     * @var string
     */
    public $tlsCipherPolicy;

    // use_v_computer_group
    /**
     * @var bool
     */
    public $useVComputerGroup;

    // v_computer_group_id
    /**
     * @var string
     */
    public $vComputerGroupId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'bandwidth'          => 'bandwidth',
        'certificateIaasId'  => 'certificate_iaas_id',
        'certificateId'      => 'certificate_id',
        'cookie'             => 'cookie',
        'cookieTimeout'      => 'cookie_timeout',
        'establishedTimeout' => 'established_timeout',
        'gmCryptoCertIaasId' => 'gm_crypto_cert_iaas_id',
        'gmSignCertIaasId'   => 'gm_sign_cert_iaas_id',
        'healthMonitor'      => 'health_monitor',
        'listenerPort'       => 'listener_port',
        'loadBalancerId'     => 'load_balancer_id',
        'persistTimeout'     => 'persist_timeout',
        'scheduler'          => 'scheduler',
        'stickySessionType'  => 'sticky_session_type',
        'tlsCipherPolicy'    => 'tls_cipher_policy',
        'useVComputerGroup'  => 'use_v_computer_group',
        'vComputerGroupId'   => 'v_computer_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('loadBalancerId', $this->loadBalancerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->establishedTimeout) {
            $res['established_timeout'] = $this->establishedTimeout;
        }
        if (null !== $this->gmCryptoCertIaasId) {
            $res['gm_crypto_cert_iaas_id'] = $this->gmCryptoCertIaasId;
        }
        if (null !== $this->gmSignCertIaasId) {
            $res['gm_sign_cert_iaas_id'] = $this->gmSignCertIaasId;
        }
        if (null !== $this->healthMonitor) {
            $res['health_monitor'] = null !== $this->healthMonitor ? $this->healthMonitor->toMap() : null;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->persistTimeout) {
            $res['persist_timeout'] = $this->persistTimeout;
        }
        if (null !== $this->scheduler) {
            $res['scheduler'] = $this->scheduler;
        }
        if (null !== $this->stickySessionType) {
            $res['sticky_session_type'] = $this->stickySessionType;
        }
        if (null !== $this->tlsCipherPolicy) {
            $res['tls_cipher_policy'] = $this->tlsCipherPolicy;
        }
        if (null !== $this->useVComputerGroup) {
            $res['use_v_computer_group'] = $this->useVComputerGroup;
        }
        if (null !== $this->vComputerGroupId) {
            $res['v_computer_group_id'] = $this->vComputerGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoadbalanceListenerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
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
        if (isset($map['established_timeout'])) {
            $model->establishedTimeout = $map['established_timeout'];
        }
        if (isset($map['gm_crypto_cert_iaas_id'])) {
            $model->gmCryptoCertIaasId = $map['gm_crypto_cert_iaas_id'];
        }
        if (isset($map['gm_sign_cert_iaas_id'])) {
            $model->gmSignCertIaasId = $map['gm_sign_cert_iaas_id'];
        }
        if (isset($map['health_monitor'])) {
            $model->healthMonitor = ListenerHealthMonitor::fromMap($map['health_monitor']);
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['persist_timeout'])) {
            $model->persistTimeout = $map['persist_timeout'];
        }
        if (isset($map['scheduler'])) {
            $model->scheduler = $map['scheduler'];
        }
        if (isset($map['sticky_session_type'])) {
            $model->stickySessionType = $map['sticky_session_type'];
        }
        if (isset($map['tls_cipher_policy'])) {
            $model->tlsCipherPolicy = $map['tls_cipher_policy'];
        }
        if (isset($map['use_v_computer_group'])) {
            $model->useVComputerGroup = $map['use_v_computer_group'];
        }
        if (isset($map['v_computer_group_id'])) {
            $model->vComputerGroupId = $map['v_computer_group_id'];
        }

        return $model;
    }
}
