<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceListenerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // backend_server_ports
    /**
     * @var int[]
     */
    public $backendServerPorts;

    // certificate_iaas_ids
    /**
     * @var string[]
     */
    public $certificateIaasIds;

    // certificate_ids
    /**
     * @var string[]
     */
    public $certificateIds;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // gm_crypto_cert_iaas_ids
    /**
     * @var string[]
     */
    public $gmCryptoCertIaasIds;

    // gm_sign_cert_iaas_ids
    /**
     * @var string[]
     */
    public $gmSignCertIaasIds;

    // listener_ports
    /**
     * @var int[]
     */
    public $listenerPorts;

    // load_balancer_ids
    /**
     * @var string[]
     */
    public $loadBalancerIds;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // types
    /**
     * @var string[]
     */
    public $types;

    // v_computer_group_ids
    /**
     * @var string[]
     */
    public $vComputerGroupIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'           => 'auth_token',
        'backendServerPorts'  => 'backend_server_ports',
        'certificateIaasIds'  => 'certificate_iaas_ids',
        'certificateIds'      => 'certificate_ids',
        'currentPage'         => 'current_page',
        'gmCryptoCertIaasIds' => 'gm_crypto_cert_iaas_ids',
        'gmSignCertIaasIds'   => 'gm_sign_cert_iaas_ids',
        'listenerPorts'       => 'listener_ports',
        'loadBalancerIds'     => 'load_balancer_ids',
        'pageSize'            => 'page_size',
        'types'               => 'types',
        'vComputerGroupIds'   => 'v_computer_group_ids',
        'workspace'           => 'workspace',
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
        if (null !== $this->backendServerPorts) {
            $res['backend_server_ports'] = $this->backendServerPorts;
        }
        if (null !== $this->certificateIaasIds) {
            $res['certificate_iaas_ids'] = $this->certificateIaasIds;
        }
        if (null !== $this->certificateIds) {
            $res['certificate_ids'] = $this->certificateIds;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->gmCryptoCertIaasIds) {
            $res['gm_crypto_cert_iaas_ids'] = $this->gmCryptoCertIaasIds;
        }
        if (null !== $this->gmSignCertIaasIds) {
            $res['gm_sign_cert_iaas_ids'] = $this->gmSignCertIaasIds;
        }
        if (null !== $this->listenerPorts) {
            $res['listener_ports'] = $this->listenerPorts;
        }
        if (null !== $this->loadBalancerIds) {
            $res['load_balancer_ids'] = $this->loadBalancerIds;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->vComputerGroupIds) {
            $res['v_computer_group_ids'] = $this->vComputerGroupIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceListenerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['backend_server_ports'])) {
            if (!empty($map['backend_server_ports'])) {
                $model->backendServerPorts = $map['backend_server_ports'];
            }
        }
        if (isset($map['certificate_iaas_ids'])) {
            if (!empty($map['certificate_iaas_ids'])) {
                $model->certificateIaasIds = $map['certificate_iaas_ids'];
            }
        }
        if (isset($map['certificate_ids'])) {
            if (!empty($map['certificate_ids'])) {
                $model->certificateIds = $map['certificate_ids'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['gm_crypto_cert_iaas_ids'])) {
            if (!empty($map['gm_crypto_cert_iaas_ids'])) {
                $model->gmCryptoCertIaasIds = $map['gm_crypto_cert_iaas_ids'];
            }
        }
        if (isset($map['gm_sign_cert_iaas_ids'])) {
            if (!empty($map['gm_sign_cert_iaas_ids'])) {
                $model->gmSignCertIaasIds = $map['gm_sign_cert_iaas_ids'];
            }
        }
        if (isset($map['listener_ports'])) {
            if (!empty($map['listener_ports'])) {
                $model->listenerPorts = $map['listener_ports'];
            }
        }
        if (isset($map['load_balancer_ids'])) {
            if (!empty($map['load_balancer_ids'])) {
                $model->loadBalancerIds = $map['load_balancer_ids'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['v_computer_group_ids'])) {
            if (!empty($map['v_computer_group_ids'])) {
                $model->vComputerGroupIds = $map['v_computer_group_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
