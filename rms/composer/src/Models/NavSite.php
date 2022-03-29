<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NavSite extends Model
{
    // site
    /**
     * @example site
     *
     * @var Site
     */
    public $site;

    // nav_tenants
    /**
     * @example nav_tenants
     *
     * @var NavTenant[]
     */
    public $navTenants;
    protected $_name = [
        'site'       => 'site',
        'navTenants' => 'nav_tenants',
    ];

    public function validate()
    {
        Model::validateRequired('site', $this->site, true);
        Model::validateRequired('navTenants', $this->navTenants, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->site) {
            $res['site'] = null !== $this->site ? $this->site->toMap() : null;
        }
        if (null !== $this->navTenants) {
            $res['nav_tenants'] = [];
            if (null !== $this->navTenants && \is_array($this->navTenants)) {
                $n = 0;
                foreach ($this->navTenants as $item) {
                    $res['nav_tenants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NavSite
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['site'])) {
            $model->site = Site::fromMap($map['site']);
        }
        if (isset($map['nav_tenants'])) {
            if (!empty($map['nav_tenants'])) {
                $model->navTenants = [];
                $n                 = 0;
                foreach ($map['nav_tenants'] as $item) {
                    $model->navTenants[$n++] = null !== $item ? NavTenant::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
