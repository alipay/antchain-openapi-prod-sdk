<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NavTenant extends Model
{
    // tenant
    /**
     * @example tenant
     *
     * @var Tenant
     */
    public $tenant;

    // view_power
    /**
     * @example true, false
     *
     * @var bool
     */
    public $viewPower;

    // nav_workspaces
    /**
     * @example nav_workspaces
     *
     * @var NavWorkspace[]
     */
    public $navWorkspaces;

    // nav_biz_domains
    /**
     * @example nav_biz_domains
     *
     * @var NavBizDomain[]
     */
    public $navBizDomains;
    protected $_name = [
        'tenant'        => 'tenant',
        'viewPower'     => 'view_power',
        'navWorkspaces' => 'nav_workspaces',
        'navBizDomains' => 'nav_biz_domains',
    ];

    public function validate()
    {
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('viewPower', $this->viewPower, true);
        Model::validateRequired('navWorkspaces', $this->navWorkspaces, true);
        Model::validateRequired('navBizDomains', $this->navBizDomains, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenant) {
            $res['tenant'] = null !== $this->tenant ? $this->tenant->toMap() : null;
        }
        if (null !== $this->viewPower) {
            $res['view_power'] = $this->viewPower;
        }
        if (null !== $this->navWorkspaces) {
            $res['nav_workspaces'] = [];
            if (null !== $this->navWorkspaces && \is_array($this->navWorkspaces)) {
                $n = 0;
                foreach ($this->navWorkspaces as $item) {
                    $res['nav_workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->navBizDomains) {
            $res['nav_biz_domains'] = [];
            if (null !== $this->navBizDomains && \is_array($this->navBizDomains)) {
                $n = 0;
                foreach ($this->navBizDomains as $item) {
                    $res['nav_biz_domains'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NavTenant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant'])) {
            $model->tenant = Tenant::fromMap($map['tenant']);
        }
        if (isset($map['view_power'])) {
            $model->viewPower = $map['view_power'];
        }
        if (isset($map['nav_workspaces'])) {
            if (!empty($map['nav_workspaces'])) {
                $model->navWorkspaces = [];
                $n                    = 0;
                foreach ($map['nav_workspaces'] as $item) {
                    $model->navWorkspaces[$n++] = null !== $item ? NavWorkspace::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['nav_biz_domains'])) {
            if (!empty($map['nav_biz_domains'])) {
                $model->navBizDomains = [];
                $n                    = 0;
                foreach ($map['nav_biz_domains'] as $item) {
                    $model->navBizDomains[$n++] = null !== $item ? NavBizDomain::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
