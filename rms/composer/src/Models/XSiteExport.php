<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XSiteExport extends Model
{
    /**
     * @example
     *
     * @var XDashboardQuery[]
     */
    public $dashboards;

    /**
     * @example
     *
     * @var XDatasourceQuery[]
     */
    public $datasources;

    // alert uuids
    /**
     * @example
     *
     * @var string[]
     */
    public $alerts;
    protected $_name = [
        'dashboards'  => 'dashboards',
        'datasources' => 'datasources',
        'alerts'      => 'alerts',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dashboards) {
            $res['dashboards'] = [];
            if (null !== $this->dashboards && \is_array($this->dashboards)) {
                $n = 0;
                foreach ($this->dashboards as $item) {
                    $res['dashboards'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->datasources) {
            $res['datasources'] = [];
            if (null !== $this->datasources && \is_array($this->datasources)) {
                $n = 0;
                foreach ($this->datasources as $item) {
                    $res['datasources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alerts) {
            $res['alerts'] = $this->alerts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XSiteExport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dashboards'])) {
            if (!empty($map['dashboards'])) {
                $model->dashboards = [];
                $n                 = 0;
                foreach ($map['dashboards'] as $item) {
                    $model->dashboards[$n++] = null !== $item ? XDashboardQuery::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['datasources'])) {
            if (!empty($map['datasources'])) {
                $model->datasources = [];
                $n                  = 0;
                foreach ($map['datasources'] as $item) {
                    $model->datasources[$n++] = null !== $item ? XDatasourceQuery::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alerts'])) {
            if (!empty($map['alerts'])) {
                $model->alerts = $map['alerts'];
            }
        }

        return $model;
    }
}
