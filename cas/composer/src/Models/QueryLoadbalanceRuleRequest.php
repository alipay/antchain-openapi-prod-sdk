<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_ids
    /**
     * @var string[]
     */
    public $appIds;

    // cookies
    /**
     * @var string[]
     */
    public $cookies;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // domains
    /**
     * @var string[]
     */
    public $domains;

    // domain_urls
    /**
     * @var string[]
     */
    public $domainUrls;

    // health_monitor_ids
    /**
     * @var string[]
     */
    public $healthMonitorIds;

    // listener_ports
    /**
     * @var int[]
     */
    public $listenerPorts;

    // loadbalancer_ids
    /**
     * @var string[]
     */
    public $loadbalancerIds;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // urls
    /**
     * @var string[]
     */
    public $urls;

    // vcomputer_group_ids
    /**
     * @var string[]
     */
    public $vcomputerGroupIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'appIds'            => 'app_ids',
        'cookies'           => 'cookies',
        'currentPage'       => 'current_page',
        'domains'           => 'domains',
        'domainUrls'        => 'domain_urls',
        'healthMonitorIds'  => 'health_monitor_ids',
        'listenerPorts'     => 'listener_ports',
        'loadbalancerIds'   => 'loadbalancer_ids',
        'pageSize'          => 'page_size',
        'statuses'          => 'statuses',
        'urls'              => 'urls',
        'vcomputerGroupIds' => 'vcomputer_group_ids',
        'workspace'         => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->cookies) {
            $res['cookies'] = $this->cookies;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->domains) {
            $res['domains'] = $this->domains;
        }
        if (null !== $this->domainUrls) {
            $res['domain_urls'] = $this->domainUrls;
        }
        if (null !== $this->healthMonitorIds) {
            $res['health_monitor_ids'] = $this->healthMonitorIds;
        }
        if (null !== $this->listenerPorts) {
            $res['listener_ports'] = $this->listenerPorts;
        }
        if (null !== $this->loadbalancerIds) {
            $res['loadbalancer_ids'] = $this->loadbalancerIds;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->urls) {
            $res['urls'] = $this->urls;
        }
        if (null !== $this->vcomputerGroupIds) {
            $res['vcomputer_group_ids'] = $this->vcomputerGroupIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['cookies'])) {
            if (!empty($map['cookies'])) {
                $model->cookies = $map['cookies'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['domains'])) {
            if (!empty($map['domains'])) {
                $model->domains = $map['domains'];
            }
        }
        if (isset($map['domain_urls'])) {
            if (!empty($map['domain_urls'])) {
                $model->domainUrls = $map['domain_urls'];
            }
        }
        if (isset($map['health_monitor_ids'])) {
            if (!empty($map['health_monitor_ids'])) {
                $model->healthMonitorIds = $map['health_monitor_ids'];
            }
        }
        if (isset($map['listener_ports'])) {
            if (!empty($map['listener_ports'])) {
                $model->listenerPorts = $map['listener_ports'];
            }
        }
        if (isset($map['loadbalancer_ids'])) {
            if (!empty($map['loadbalancer_ids'])) {
                $model->loadbalancerIds = $map['loadbalancer_ids'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['urls'])) {
            if (!empty($map['urls'])) {
                $model->urls = $map['urls'];
            }
        }
        if (isset($map['vcomputer_group_ids'])) {
            if (!empty($map['vcomputer_group_ids'])) {
                $model->vcomputerGroupIds = $map['vcomputer_group_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
